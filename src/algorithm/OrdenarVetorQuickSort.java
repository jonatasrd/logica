package algorithm;

public class OrdenarVetorQuickSort {

	public static void main(String[] args) {
		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}

		long tempoInicial = System.currentTimeMillis();

		ordernaVetorQuickSort(vetor, 0, vetor.length - 1);

		long tempoFinal = System.currentTimeMillis();

		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

	}

	private static void ordernaVetorQuickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			ordernaVetorQuickSort(vetor, inicio, posicaoPivo - 1);
			ordernaVetorQuickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int separar(int[] vetor, int paramInicio, int paramFim) {
		int pivo = vetor[paramInicio];
		int inicio = paramInicio + 1;
		int fim = paramFim;

		while (inicio <= fim) {
			if (vetor[inicio] <= pivo)
				inicio++;
			else if (pivo < vetor[fim])
				fim--;
			else {
				int troca = vetor[inicio];
				vetor[inicio] = vetor[fim];
				vetor[fim] = troca;
				inicio++;
				fim--;
			}
		}

		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
	}
}
