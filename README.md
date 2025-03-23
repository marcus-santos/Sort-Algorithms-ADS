# Avaliação 1 - Estruturas de Dados e Algoritmos

Este projeto contém a implementação de vários métodos de ordenação em Java. O objetivo é comparar o desempenho de diferentes algoritmos de ordenação medindo o tempo de execução em milissegundos para ordenar um vetor de inteiros.

## Métodos de Ordenação Implementados

1. **Bubble Sort**:
   - Algoritmo simples de ordenação que repete várias vezes a passagem pela lista, comparando elementos adjacentes e trocando-os se estiverem na ordem errada.

2. **Selection Sort**:
   - Algoritmo que divide a lista em duas partes: a sublista de itens já ordenados e a sublista de itens restantes a serem ordenados. A cada iteração, o menor elemento da sublista não ordenada é selecionado e trocado com o primeiro elemento não ordenado.

3. **Insertion Sort**:
   - Algoritmo que constrói a lista ordenada um item de cada vez, pegando cada elemento e inserindo-o na posição correta dentro da lista já ordenada.

4. **Merge Sort**:
   - Algoritmo que divide a lista em duas metades, ordena cada metade de forma recursiva e, em seguida, mescla as duas metades ordenadas para produzir a lista final ordenada.

5. **Heap Sort**:
   - Algoritmo que transforma a lista em uma estrutura de dados chamada heap, e então extrai repetidamente o maior elemento do heap e o coloca na posição correta na lista.

6. **Counting Sort**:
   - Algoritmo que conta o número de ocorrências de cada valor em uma lista e usa essa contagem para determinar a posição de cada valor na lista ordenada.

7. **Quick Sort**:
   - Algoritmo que seleciona um elemento como pivô e particiona a lista em duas sublistas: uma com elementos menores que o pivô e outra com elementos maiores. As sublistas são então ordenadas recursivamente.

## Medição de Desempenho

O projeto mede o tempo de execução de cada algoritmo de ordenação em milissegundos. Para cada método de ordenação, o tempo de início e fim da execução é registrado, e a diferença entre esses tempos é calculada para determinar a duração total da ordenação.


## Como Executar

Para executar o projeto, compile e execute a classe `App`. O programa inicializa um vetor de inteiros e aplica cada método de ordenação, imprimindo o tempo de execução de cada um.

```bash
javac App.java
java App
```

## Exemplo de Saída

```
Tempo de ordenacao Bubble Sort: 0s123ms
Tempo de ordenacao Selection Sort: 0s98ms
Tempo de ordenacao Insertion Sort: 0s45ms
Tempo de ordenacao Merge Sort: 0s12ms
Tempo de ordenacao Heap Sort: 0s15ms
Tempo de ordenacao Counting Sort: 0s8ms
Tempo de ordenacao Quick Sort: 0s10ms
```

Este projeto é uma avaliação da disciplina de Estruturas de Dados e Algoritmos do IFSP.
