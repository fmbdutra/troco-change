package stuff;

import java.util.Scanner;

public class troco {

	private static Scanner ipt = new Scanner(System.in); //Caso usar o teclado no console

	public static int c5, c10, c25, c50, c100;
	public static int p2, p5, p10, p20, p50, p100;

	public static void countPaper(long p) {
		while (p >= 2) {
			if (p >= 100) {
				p -= 100;
				p100++;
			}
			if (p >= 50) {
				p -= 50;
				p50++;
			}
			if (p >= 20) {
				p -= 20;
				p20++;
			}
			if (p >= 10) {
				p -= 10;
				p10++;
			}
			if (p >= 5) {
				p -= 5;
				p5++;
			}
			if (p >= 2) {
				p -= 2;
				p2++;
			}
		}

		if (p100 > 0) {
			System.out.println(p100 + " cedulas de 100 reais");
		}
		if (p50 > 0) {
			System.out.println(p50 + " cedulas de 50 reais");
		}
		if (p20 > 0) {
			System.out.println(p20 + " cedulas de 20 reais");
		}
		if (p10 > 0) {
			System.out.println(p10 + " cedulas de 10 reais");
		}

		if (p5 > 0) {
			System.out.println(p5 + " cedulas de 5 reais");
		}

		if (p2 > 0) {
			System.out.println(p2 + " cedulas de 2 reais");
		}

		if (p < 2) {
			long a = p;
			p -= p;
			countCoins(a);
		}
	}

	public static void countCoins(double d) {

		if (d <= 1) {
			d *= 100;
		}

		long a = (long) d;
		// Se fizer direto com double,
		// fica lixo de memoria influenciando o calculo
		// entao essa foi uma forma de nao utilizar o bigDecimal
		// e o codigo tambem ficar acessivel para quem esta
		// aprendendo Java

		while (a >= 5) {
			if (a >= 100) {
				a -= 100;
				c100++;
			}

			if (a >= 50) {
				a -= 50;
				c50++;
			}
			if (a >= 25) {
				a -= 25;
				c25++;
			}
			if (a >= 10) {
				a -= 10;
				c10++;
			}
			if (a >= 5) {
				a -= 5;
				c5++;
			}

			if (a < 5 && a > 0) {
				c5++;
				a -= a;
			}
		}

		if (c100 > 0) {
			System.out.println(c100 + " moedas de 1 real");
			c100 = 0;
		}
		if (c50 > 0) {
			System.out.println(c50 + " moedas de 50 centavos");
			c50 = 0;
		}
		if (c25 > 0) {
			System.out.println(c25 + " moedas de 25 centavos");
			c25 = 0;
		}
		if (c10 > 0) {
			System.out.println(c10 + " moedas de 10 centavos");
			c10 = 0;
		}
		if (c5 > 0) {
			System.out.println(c5 + " moedas de 5 centavos");
			c5 = 0;
		}
	}

	public static void main(String[] args) {
		System.out.println("Insira o dinheiro");

		countCoins(63);
		countPaper(21);
	}

}
