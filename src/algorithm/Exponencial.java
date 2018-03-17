package algorithm;

public class Exponencial {

	public static void main(String[] args) {
		System.out.println("Exponencial de 2 a 5: " + getExponencial(2, 5));
		System.out.println("Exponencial java: " + Math.pow(2, 5));

		System.out.println("");

		System.out.println("Exponencial de 5 a 10: " + getExponencial(5, 10));
		System.out.println("Exponencial java: " + Math.pow(5, 10));

		System.out.println("");

		System.out.println("Exponencial de 3 a 7: " + getExponencial(3, 7));
		System.out.println("Exponencial java: " + Math.pow(3, 7));
	}

	private static long getExponencial(int numero, int base) {
		long resultado = numero;
		for (int i = 1; i < base; i++) {
			resultado *= numero;
		}
		return resultado;
	}

}
