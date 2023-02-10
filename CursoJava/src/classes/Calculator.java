package classes;

import java.util.Scanner;

public class Calculator {

	double resultado;

	public void soma(double n1, double n2) {
		resultado = n1 + n2;
		System.out.println("O resultado é: " + resultado);
	}

	public void subtracao(double n1, double n2) {
		resultado = n1 - n2;
		System.out.println("O resultado é: " + resultado);
	}

	public void divisão(double n1, double n2) {
		if (n2 == 0) {
			System.out.println("Divisão por Zero não permitida.");
		} else {
			resultado = n1 / n2;
			System.out.println("O resultado é: " + resultado);
		}
	}

	public void multiplicacao(double n1, double n2) {
		resultado = n1 * n2;
		System.out.println("O resultado é: " + resultado);
	}

	Scanner entrada = new Scanner(System.in);

	public void menu() {

		System.out.println("Qual operação deseja realizar? Digite o número correspondente:\n"
				+ "1 Soma\n"
				+ "2 Subtração\n"
				+ "3 Divisão\n"
				+ "4 Multiplicação\n"
				+ "0 Encerrar o programa\n");
		
		int opcaoSelecionada = entrada.nextInt();
		if (opcaoSelecionada == 0) System.exit(0); // encerrar a apliação.
		
		System.out.println("Digite o primeiro número: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double n2 = entrada.nextDouble();
		
		System.out.println(opcaoSelecionada);
		if (opcaoSelecionada == 1) soma(n1, n2);
		if (opcaoSelecionada == 2) subtracao(n1, n2);
		if (opcaoSelecionada == 3) divisão(n1, n2);
		if (opcaoSelecionada == 4) multiplicacao(n1, n2);
		
		System.out.println("\nDeseja fazer uma nova operação? [S/N]");
		String decisao = entrada.next();
		if ("S".equals(decisao.toUpperCase())) menu();
		if ("N".equals(decisao.toUpperCase())) System.out.println("Bye! Fim do pragrama.");
		
		entrada.close();
	}
}
