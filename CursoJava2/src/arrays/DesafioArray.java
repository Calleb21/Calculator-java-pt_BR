package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		System.out.println("===============================================");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantas notas você deseja inserir?: ");
		int quantidadeDeNota = scanner.nextInt();

		double[] notas = new double[quantidadeDeNota];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Insira a nota: " + (i + 1));
			notas[i] = scanner.nextDouble();
			if (notas[i] > 10 || notas[i] < 0) {
				System.out.println("Nota inválida!");
				break;
			}

			double total = 0;
			for (double nota : notas) {
				total += nota;
			}

			double media = total / notas.length;
			System.out.println("A média é " + media + "!");

			if (notas.length <= 10.0 && media >= 9.0) {
				System.out.println("Parabéns, você é incrivel!");
			} else if (media >= 6 && media <= 8.9) {
				System.out.println("Parabéns!");
			} else if (media >= 4 && media <= 5.9) {
				System.out.println("Recuperação!");
			} else if (media >= 0 && media <= 3.9) {
				System.out.println("Reprovado!");
			} else {

			}
		}
		scanner.close();

		System.out.println("=================================================");
	}
}
