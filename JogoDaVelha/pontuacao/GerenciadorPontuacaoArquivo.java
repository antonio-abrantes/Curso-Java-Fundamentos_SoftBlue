package jogodavelha.pontuacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorPontuacaoArquivo {

	private static final String ARQUIVO_PONTUACAO = "pontuacao.txt";
	
	private Map<String, Integer> pontuacaoMap = new HashMap<String, Integer>();
	
	public GerenciadorPontuacaoArquivo() throws PontuacaoException{
		inicializar();
	}
	
	private void inicializar()throws PontuacaoException{
		
		File arquivo = new File(ARQUIVO_PONTUACAO);
		if(!arquivo.exists()){
			try {
				arquivo.createNewFile();
			} catch (Exception e) {
				throw new PontuacaoException(e.getMessage());
			}
		}
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(arquivo));
			String line;
			while((line = reader.readLine()) != null){
				String[] tokens = line.split("\\|");
				pontuacaoMap.put(tokens[0].toUpperCase(), new Integer(tokens[1]));
			}
		} catch (Exception e) {
			throw new PontuacaoException(e.getMessage());
		}finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					throw new PontuacaoException(e.getMessage());
				}
			}
		}
		
	}
	
	public Integer getPontuacao(String nome){
		return pontuacaoMap.get(nome.toUpperCase());
	}
	
	public void gravarPontuacao(String nome) throws PontuacaoException{
		Integer pontuacao = getPontuacao(nome);
		
		if(pontuacao == null){
			pontuacao = 0;
		}
		
		pontuacaoMap.put(nome.toUpperCase(), pontuacao + 1);
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_PONTUACAO))){
			for(Map.Entry<String, Integer> entry : pontuacaoMap.entrySet()){
				writer.write(entry.getKey() + "|"+ entry.getValue());
				writer.newLine();
			}
			
		} catch (Exception e) {
			throw new PontuacaoException(e.getMessage());
		}		
	}	
}