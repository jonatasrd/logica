package algorithm;

class PossivelOrdenarVetorApenasUmaTroca {

	public static boolean solution(int[] A) {
		// write your code in Java SE 8

		maior: for (int fixo = 0; fixo < A.length - 1; fixo++) {
			int menor = fixo;
			for (int i = menor + 1; i < A.length; i++) {
				if (A[i] < A[menor]) {
					for (int j = menor + 1; j < A.length; j++) {
						if (A[i] < A[j]) {
							int aux = A[j - 1];
							A[j - 1] = A[menor];
							A[menor] = aux;
							break maior;
						}
					}
				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// int A[] = { 1, 5, 3, 3, 7 };
		int A[] = { 1, 3, 5, 3, 4 };
		System.out.println(solution(A));
	}
}
