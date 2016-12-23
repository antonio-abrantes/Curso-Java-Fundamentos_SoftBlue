package br.com.aula13.questao2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Autor implements Recordable{
	private String nome;
	private String dataNascimento;
	
	public Autor(){}
	
	public Autor(String nome, String dataNascimento){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	} 
	
	@Override
	public void read(DataInputStream in) throws IOException {
		nome = in.readUTF();
		if(nome.equals(NULL_DATA)){
			nome = null;
		}
		dataNascimento = in.readUTF();
		if(dataNascimento.equals(NULL_DATA)){
			dataNascimento = null;
		}		
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		if(nome != null){
			out.writeUTF(nome);
		}else{
			out.writeUTF(NULL_DATA);
		}
		if(dataNascimento != null){
			out.writeUTF(dataNascimento);
		}else{
			out.writeUTF(NULL_DATA);
		}		
	}
	
	@Override
	public String toString() {
		return "Autor: [nome="+nome+" dataNascimento="+ dataNascimento+"]";
	}
}
