package jogodavelha;

import java.util.ArrayList;
import java.util.List;

import jogodavelha.io.Console;
import jogodavelha.pontuacao.GerenciadorPontuacaoArquivo;
import jogodavelha.pontuacao.PontuacaoException;

public class Jogo {

private Tabuleiro tabuleiro = new Tabuleiro();
	
	private List<Jogador> jogadores = new ArrayList<>();
	
	private GerenciadorPontuacaoArquivo gerenciadorPontuacao;	
	
	public void jogar() throws JogoDaVelhaExcetion{
		
		System.out.println("|| JOGO DA VELHA ||");
		System.out.println();
		
		try {
			gerenciadorPontuacao = new GerenciadorPontuacaoArquivo();
		} catch (PontuacaoException e1) {
			e1.printStackTrace();
		}
		
		System.out.print("Nome do Jogador 1: ");	
		String nome = Console.readString();
		System.out.println();
		jogadores.add(new Jogador(nome, 'X'));
		
		Integer pontuacao = gerenciadorPontuacao.getPontuacao(nome);
		String msg = "O jogador %s ja possui %d %s!\n";
		
		if(pontuacao != null){
			System.out.format(msg, nome, pontuacao, pontuacao == 1 ? "Vitoria" : "vitorias");
		}
		
		System.out.print("Nome do Jogador 2: ");
		nome = Console.readString();
		System.out.println();
		jogadores.add(new Jogador(nome, 'O'));
		
		pontuacao = gerenciadorPontuacao.getPontuacao(nome);		
		if(pontuacao != null){
			System.out.format(msg, nome, pontuacao, pontuacao == 1 ? "Vitoria" : "vitorias");
		}
		
		boolean finalizado = false;
		
		int indexJogadorAtual = 0;
		
		Jogador vencedor = null;
		
		while(!finalizado){
			tabuleiro.imprimir();
			
			Jogador jogador = jogadores.get(indexJogadorAtual);
			
			System.out.print("Jogador '"+ jogador.getNome() + "' => ");
			
			boolean sequenciaEncontrada;
			try {
				Jogada jogada = jogador.obterJogada();
				
				sequenciaEncontrada = tabuleiro.efetuarJogada(jogada, jogador.getSimbolo());
			} catch (Exception e) {
				System.out.println("Erro "+e.getMessage());
				continue;
			}
			
			if(sequenciaEncontrada){
				vencedor = jogador;
				finalizado = true;
			}else if(tabuleiro.isCompleto()){
				finalizado = true;
			}
			
			indexJogadorAtual = (indexJogadorAtual + 1) % jogadores.size();
		}
		
		System.out.println();
		
		if(vencedor == null){
			System.out.println("O jogo terminou empatado!");
		}else {
			System.out.println("O jogador '"+vencedor.getNome() + "' venceu o jogo!");
			try {
				gerenciadorPontuacao.gravarPontuacao(vencedor.getNome());
			} catch (PontuacaoException e) {
				e.printStackTrace();
			}
		}
		tabuleiro.imprimir();
	}
}
