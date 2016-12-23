package br.com.aula5.questao2;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;
	static final int HORA_12 = 12;
	static final int HORA_24 = 24;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = -1;
	}
	
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo){
		this(dia, mes, ano);
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}	
	
	public String imprimir1(int formato_hora){
		
		int horaTemp;
		String data = getDia()+"/"+getMes()+"/"+getAno(); 
		String horario;
		
		if(hora != -1){
			if(formato_hora == HORA_12){
				horaTemp = this.hora % HORA_12;
				horario = +horaTemp+":"+getMinuto()+":"+getSegundo();
				if(this.hora >= 12){
					horario += " PM";
				}else{
					horario += " AM";
				}
			}else{
				horaTemp = this.hora;
				horario = +horaTemp+":"+getMinuto()+":"+getSegundo();
			}			
			return data+" "+horario;
		}
		return data;
	}
	
	public void imprimir2(int formato) {
		String data = dia + "/" + mes + "/" + ano;
		
		if (hora == -1) {
			System.out.println(data);
		} else {
			String horario = ":" + minuto + ":" + segundo;
			
			if (formato == HORA_24) {
				horario = hora + horario;
			} else {
				if (hora >= 12) {			
					horario = (hora - 12) + horario;
					horario += " PM";
				} else {
					horario = hora + horario;
					horario += " AM";
				}
			}
			System.out.println(data + " " + horario);
		}
	}
}
