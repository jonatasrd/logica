package algorithm;

public class MMC {

	public static void main(String[] args) {
		System.out.println(getMMC(6, 13));
	}

	private static int getMMC(int num1, int num2) {
		int aux = 0;
		int soma = 0;

		if (num1 < num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		soma = num1;
		while (soma % num2 != 0) {
			soma += num1;
		}
		return soma;
	}

}
