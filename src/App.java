public class App {

    public static void main(String[] args) {

        int N = 50000;

        int vet[] = new int[N];

        inicializarVetor(vet, N, 2); //0-aleatório, 1-crescente, 2-decrescente

        int vet2[] = vet.clone();
        int vet3[] = vet.clone();
        int vet4[] = vet.clone();
        int vet5[] = vet.clone();
        int vet6[] = vet.clone();
        int vet7[] = vet.clone();

        long inicio, fim, tempoS, tempoMS;

        // BUBBLE SORT ---------------------------------------------------------------

        inicio = System.currentTimeMillis();
        bubbleSort(vet, N); 
        fim = System.currentTimeMillis();

        tempoS = (fim - inicio) / 1000;
        tempoMS = (fim - inicio) - tempoS * 1000;

        System.out.println("Tempo de ordenacao Bubble Sort: " + tempoS + "s" + tempoMS + "ms");

        // SELECTION SORT -------------------------------------------------------------

        inicio = System.currentTimeMillis();
        selectionSort(vet2, N); 
        fim = System.currentTimeMillis();

        tempoS = (fim - inicio) / 1000;
        tempoMS = (fim - inicio) - tempoS * 1000;

        System.out.println("Tempo de ordenacao Selection Sort: " + tempoS + "s" + tempoMS + "ms");

        // INSERTION SORT -------------------------------------------------------------

        inicio = System.currentTimeMillis();
        insertionSort(vet3, N); 
        fim = System.currentTimeMillis();

        tempoS = (fim - inicio) / 1000;
        tempoMS = (fim - inicio) - tempoS * 1000;

        System.out.println("Tempo de ordenacao Insertion Sort: " + tempoS + "s" + tempoMS + "ms");        
        
        // MERGE SORT --------------------------------------------------------------------

        inicio = System.currentTimeMillis();
        mergeSort(vet4, 0, N - 1); 
        fim = System.currentTimeMillis();
        tempoS = (fim - inicio) / 1000;
        tempoMS = (fim - inicio) - tempoS * 1000;

        System.out.println("Tempo de ordenacao Merge Sort: " + tempoS + "s" + tempoMS + "ms");
        
        // HEAP SORT ---------------------------------------------------------------------

        inicio = System.currentTimeMillis();
        heapSort(vet5, N); 
        fim = System.currentTimeMillis();
        tempoS = (fim - inicio) / 1000;
        tempoMS = (fim - inicio) - tempoS * 1000;

        System.out.println("Tempo de ordenacao Heap Sort: " + tempoS + "s" + tempoMS + "ms");
        
        // COUTING SORT -------------------------------------------------------------------

        inicio = System.currentTimeMillis();
        countingSort(vet6, N); 
        fim = System.currentTimeMillis();
        tempoS = (fim - inicio) / 1000;
        tempoMS = (fim - inicio) - tempoS * 1000;
        System.out.println("Tempo de ordenacao Couting Sort: " + tempoS + "s" + tempoMS + "ms");
        
        // QUICK SORT ----------------------------------------------------------------------

        inicio = System.currentTimeMillis();
        quickSort(vet7,0, N); 
        fim = System.currentTimeMillis();
        tempoS = (fim - inicio) / 1000;
        tempoMS = (fim - inicio) - tempoS * 1000;

        System.out.println("Tempo de ordenacao Quick Sort: " + tempoS + "s" + tempoMS + "ms");

    }

    static void inicializarVetor(int vet[], int N, int s) {
        switch(s){
            case 0:         
                for (int i = 0; i < N; i++) 
                    vet[i] = (int) (Math.random() * (N * 2));
            break;
            case 1: 
                for (int i = 0; i < N; i++) 
                    vet[i] = i+1;
            break;
            case 2: 
                for (int i = N; i > 0; i--) 
                    vet[i-1] = i;
            break;

        }

    }

    private static void exibirVetor(int[] vet, int N) {
        for (int i = 0; i < N; i++) {
            if (vet[i] < 10) {
                System.out.print("0" + vet[i] + " ");
            } else {
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println("");
    }

        private static void troca(int[] vet, int a, int b) {
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
    }

    
    private static void bubbleSort(int[] vet, int N) {
        int aux;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j<N - 1; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
    }

    private static void selectionSort(int[] vet, int N) {
        int i, j, min, aux;

        for (i = 0; i < (N - 1); i++) {
            min = i;
            
            for (j = (i+1); j < N; j++) {

                if(vet[j] < vet[min]){ 
                    min = j;
                }
            }

                if (i != min) {
                    aux = vet[i];
                    vet[i] = vet[min];
                    vet[min] = aux;
                }
        }
    }

    private static void insertionSort(int[] vet, int N) {
        int key, j;
        
        for (int i = 1; i < N; i++) {
            key = vet[i];
            j = i - 1;
            
            while (j >= 0 && vet[j] > key) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }

            vet[j + 1] = key;
        }
    }

    private static void mergeSort(int[] vet, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vet, inicio, meio);
            mergeSort(vet, meio + 1, fim);
            merge(vet, inicio, meio, fim);
        }
    }

    private static void merge(int[] vet, int inicio, int meio, int fim) {
        int[] helper = new int[vet.length];
        for (int i = inicio; i <= fim; i++) {
            helper[i] = vet[i];
        }

        int i = inicio;
        int j = meio + 1;
        int k = inicio;

        while (i <= meio && j <= fim) {
            if (helper[i] <= helper[j]) {
                vet[k] = helper[i];
                i++;
            } else {
                vet[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {
            vet[k] = helper[i];
            i++;
            k++;
        }
    }

    private static void heapSort(int[] vet, int N) {
    
        int tamanho = vet.length;
        int i = tamanho / 2, pai, filho, t;
        while (true){
            if (i > 0){
                i--; t = vet[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = vet[tamanho];
                vet[tamanho] = vet[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (vet[filho + 1] > vet[filho])) {filho++;}
                if (vet[filho] > t){
                    vet[pai] = vet[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            vet[pai] = t;
        }
    }
    
    private static void countingSort(int[] vet, int N) {
        // encontra o maior valor em vet[]
        int maior = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        // conta quantas vezes cada valor de vet[] aparece
        int[] c = new int[maior + 1]; // +1 pois se 10 for o maior valor, ele iria apenas de 0 a 9
        for (int i = 0; i < vet.length; i++) {
            c[vet[i]] += 1;
        }

        // acumula as vezes de cada elemento de vet[] com os elementos anteriores a este
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }

        // adiciona os elementos em suas posições conforme o acumulo de suas frequencias
        int[] b = new int[vet.length];
        for (int i = vet.length - 1; i >= 0; i--) { // percorre do fim para o inicio para manter estavel
            b[c[vet[i]] - 1] = vet[i];
            c[vet[i]]--;
        }

        // copia os valores ordenados de volta para o vetor original
        for (int i = 0; i < vet.length; i++) {
            vet[i] = b[i];
        }
    }
    
    private static void quickSort(int[] vet, int inicio, int N) {
    
        if (inicio >= N - 1) return; // Caso base: array de 1 ou 0 elementos já está ordenado

        int i = inicio, j = N - 1;
        int pivo = vet[inicio + (N - inicio) / 2];
        int aux;

        while (i <= j){
            while (i < N && vet[i] < pivo)
                i++;
            while (j >= inicio && vet[j] > pivo)
                j--;

            if (i <= j){
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
                i++;
                j--;
            }
        }

        if (inicio < j)
            quickSort(vet, inicio, j + 1);
        if (i < N)
            quickSort(vet, i, N);
        }
}

