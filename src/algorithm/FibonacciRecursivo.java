package algorithm;

public class FibonacciRecursivo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getFibonacci(i));
		}
	}

	static long getFibonacci(int numero) {
		return (numero < 2) ? numero : getFibonacci(numero - 1) + getFibonacci(numero - 2);
	}

}
