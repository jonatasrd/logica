package algorithm;

public class OrdenarVetor {

	public static void main(String[] args) {
		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}

		long tempoInicial = System.currentTimeMillis();

		ordernaVetor(vetor);

		long tempoFinal = System.currentTimeMillis();

		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

	}

	public static int[] ordernaVetor(int vetor[]) {

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
