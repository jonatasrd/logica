package algorithm;

public class FatorialRecursivo {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			System.out.println(i + " || " + calculaFatorial(i));
		}
	}

	public static int calculaFatorial(int numero) {
		if (numero <= 1)
			return 1;
		else
			return numero * calculaFatorial(numero - 1);
	}
}
