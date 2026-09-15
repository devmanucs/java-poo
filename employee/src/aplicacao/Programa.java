package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.print("Nome: ");
		funcionario.nome = leitor.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = leitor.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = leitor.nextDouble();

		System.out.println();
		System.out.println("Funcionário: " + funcionario);
		System.out.println();

		System.out.print("Qual a porcentagem de aumento do salário? ");
		double porcentagem = leitor.nextDouble();
		funcionario.aumentarSalario(porcentagem);

		System.out.println();
		System.out.println("Dados atualizados: " + funcionario);

		leitor.close();
	}
}
