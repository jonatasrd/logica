package algorithm;

public class Fibonacci {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getFibonacci(i));
		}

		printFibonacci(15);
	}

	private static long getFibonacci(int numero) {
		int fibonacci = 0;
		int anterior = 0;

		for (int i = 1; i <= numero; i++) {
			if (i == 1) {
				fibonacci = 1;
				anterior = 0;
			} else {
				fibonacci += anterior;
				anterior = fibonacci - anterior;
			}
		}
		return fibonacci;
	}

	private static void printFibonacci(int numero) {
		int fibonacci = 0;
		int anterior = 0;

		for (int i = 1; i <= numero; i++) {
			if (i == 1) {
				fibonacci = 1;
				anterior = 0;
			} else {
				fibonacci += anterior;
				anterior = fibonacci - anterior;
			}
			System.out.println("Fibonacci 1: " + fibonacci);
		}
	}
}
