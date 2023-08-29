package quickSort;

public class Quick_Sort {

	public Quick_Sort() {
		super();
	}
	public int[] QuickSort(int[]vetor, int inicio, int fim) {
		if(fim > inicio) {
		int pivofixo = dividir(vetor,inicio,fim);
		QuickSort(vetor,inicio,pivofixo-1);
		QuickSort(vetor,pivofixo+1,fim);
	}
		return vetor;
	}
	private int dividir(int[] vetor, int inicio,int fim) {
		int pivo = vetor[inicio];
		int ponteiroesquerda =inicio +1;
		int ponteirodireita = fim;
		while(ponteiroesquerda <= ponteirodireita ) {
			while(ponteiroesquerda <= ponteirodireita &&vetor[ponteiroesquerda] <= pivo) {
				ponteiroesquerda++;
			}
			while(ponteirodireita >= ponteiroesquerda && vetor[ponteirodireita] > pivo) {
				ponteirodireita--;
			}
			if(ponteiroesquerda < ponteirodireita) {
				trocar(vetor,ponteiroesquerda,ponteirodireita);
				ponteiroesquerda++;
				ponteirodireita--;
			}
		}
		trocar(vetor,inicio,ponteirodireita);
		return ponteirodireita;
	}
	private void trocar(int[] vetor,int i,int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
}
