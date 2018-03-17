package algorithm;

public class MDCRecursivo {

	public static void main(String[] args) {
		System.out.println(getMDC(5, 25));
	}

	private static int getMDC(int num1, int num2) {
		if (num1 == 0)
			return num2;
		return getMDC(num2 % num1, num1);
	}

}
