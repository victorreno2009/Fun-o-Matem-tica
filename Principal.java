package Execucao;

import java.util.Scanner;

public class Principal {
	private static Scanner ler;

	public static void main(String[] args) {
		ler = new Scanner(System.in);
		int a;
		int b;

		int escolha = 0;

		System.out.println("Digite sua escolha: ");
		escolha = ler.nextInt();

		if (escolha == 1) {
			System.out.println("Informe um n�mero: ");
			a = ler.nextInt();

			System.out.println("Informe outro n�mero: ");
			b = ler.nextInt();

			System.out.println("Resultado da soma: ");
			System.out.println(a + b);
		}

		if (escolha == 2) {

			System.out.println("Informe um n�mero: ");
			a = ler.nextInt();

			System.out.println("Informe outro n�mero: ");
			b = ler.nextInt();

			System.out.println("Subtra��o: ");
			System.out.println(a - b);
		}

		if (escolha == 3) {

			System.out.println("Informe um n�mero: ");
			a = ler.nextInt();

			System.out.println("Informe outro n�mero: ");
			b = ler.nextInt();

			System.out.println("Multiplica��o: ");
			System.out.println(a * b);
		}

		if (escolha == 4) {

			System.out.println("Informe um n�mero: ");
			a = ler.nextInt();

			System.out.println("Informe outro n�mero: ");
			b = ler.nextInt();

			System.out.println("Divis�o: ");
			System.out.println(a / b);

		}
	}
}
