package algorithm;

public class Fatorial {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			System.out.println(i + " || " + calculaFatorial(i));
		}
	}

	public static int calculaFatorial(int numero) {
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}
