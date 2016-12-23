package br.com.aula4.questao1;

public class Relogio {
	
	Ponteiro ponteiroHora;
	Ponteiro ponteiroMinuto;
	Ponteiro ponteiroSegundo;
	
	public void acertarHora(int hora, int minuto, int segundo){	
		hora = hora % 12;
		ponteiroHora = new Ponteiro();
		ponteiroMinuto = new Ponteiro();
		ponteiroSegundo = new Ponteiro();
		ponteiroHora.posicao = hora;
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}
	
	public int lerHora(){
		return ponteiroHora.posicao; 
	}

	public int lerMinuto(){
		return ponteiroMinuto.posicao * 5;
	}
	
	public int lerSegundo(){
		return ponteiroSegundo.posicao * 5;
	}
	
}
