package exer2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Insira o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		System.out.println();
		
		System.out.print("Insira o Salario Bruto do funcionário: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println();
		
		System.out.print("Insira o imposto que será aplicado ao funcionário: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		
		double salarioliquido = funcionario.salarioLiquido();
		System.out.println("Funcionário: " + funcionario.nome + ", $ " + salarioliquido);
		System.out.println();
		
		System.out.print("Qual será a porcentagem de aumento de salário?: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentoSal(porcentagem);
		
		System.out.println();
		System.out.println("Dados do funcionário atualizados: " + funcionario);
			
		sc.close();
	}

}
