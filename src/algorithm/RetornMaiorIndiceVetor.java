package algorithm;

public class RetornMaiorIndiceVetor {

	public int solution(int[] A) {
		// write your code in Java SE 8
		int count = 1;
		int maior = 1;

		for (int i = 0; i < A.length;) {
			dentro: for (int j = i + 1; j < A.length; j++) {
				if (A[j] > A[i]) {
					count++;
					maior = count;
				} else {
					count = 1;
					i = j;
					break dentro;
				}
			}
			i++;
		}
		return maior;
	}

	public static void main(String[] args) {
		RetornMaiorIndiceVetor teste = new RetornMaiorIndiceVetor();
		int A[] = { 2, 2, 2, 2, 1, 2, -1, 2, 1, 3 };
		System.out.println(teste.solution(A));
	}

}
