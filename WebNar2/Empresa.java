import javax.swing.*;

public class Empresa{

	//Metodo statico para poder ser chamado direto na main com a passagem dos parametros...
	public static void criarFuncionario(int op, String nome, int idade){
		
		//Opção para entrar com os dados dinamicamente...
		double salario, horasT;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
		horasT = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas"));
		
		if(op == 1){ //Opção 1 para Gerente...
			Gerente f = new Gerente(nome, idade);
			f.setSalario(salario);
			f.setHoras(horasT);
			double bonus = Double.parseDouble(JOptionPane.showInputDialog("Digite o bonus"));
			
			f.setBonus(bonus);
			f.mostrarDados();
		}else if(op == 2){ // Opção 2 para Analista...
			Analista f = new Analista(nome, idade);
			f.setSalario(salario);
			f.setHoras(horasT);
			String setor = JOptionPane.showInputDialog("Digite o nome do setor");
			f.setSetor(setor);
			f.mostrarDados();
		}else{
			System.out.println("Opção invalida...");
		}
	}

}
