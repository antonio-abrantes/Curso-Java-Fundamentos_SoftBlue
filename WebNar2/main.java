import java.util.Scanner;
import javax.swing.*;

public class main {
	
	public static void main(String[] args){
		//Gerente g1 = new Gerente("Antonio", 15);
		
		
		//Scanner in = new Scanner(System.in);
		
		//System.out.print("Salario: ");
		//int salario = in.nextInt(), horasT;
		
		//double salario, horasT;
		int op = Integer.parseInt(JOptionPane.showInputDialog("Opções\n1 - para Gerente\n2 - Para Analista\n"));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		//salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
		//horasT = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas"));
		//String p = in.next();
		//System.out.print("Horas de trabalho: ");
		//horasT = in.nextInt();
		
		Empresa.criarFuncionario(op, "Antonio Abrantes", idade);
		//g1.setSalario(salario);
		//g1.setHoras(horasT);
		
		//g1.calcularSalario();
		//g1.setBonus(5);
		//g1.mostrarDados();
		
		//System.out.println(p);
		
	}

}
