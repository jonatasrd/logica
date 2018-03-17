package algorithm;

public class OrdenarVetor {

	public static void main(String[] args) {
		int[] testeArray = { 1, 3, 5, 9, 9, 0, 34 };
		OrdenarVetor vetor = new OrdenarVetor();
		vetor.ordernaVetor(testeArray);
		for (int i = 0; i < testeArray.length; i++) {
			System.out.println(testeArray[i]);
		}
	}

	public int[] ordernaVetor(int vetor[]) {

		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				int temp;
				if (vetor[i] > vetor[j]) {
					temp = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = temp;
				}
			}
		}

		return vetor;
	}

}
