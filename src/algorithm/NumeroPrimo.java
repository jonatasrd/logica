package algorithm;

public class NumeroPrimo {

	public static void main(String[] args) {
		for (int i = 0; i < 10000L; i++) {
			if (isPrimo(i)) {
				System.out.println("Numero: " + i);
			}
		}
	}

	private static boolean isPrimo(long numero) {
		long count = 0;
		for (long j = 1; j <= numero; j++) {
			if (numero % j == 0)
				count++;
		}
		return count == 2 ? true : false;
	}
}
