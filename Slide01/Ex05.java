// 5. Implemente dois algoritmos que ordenem os elementos de um vetor em ordem
//    crescente e compare o número de trocas que eles efetuam durante a
//    ordenação de:
// a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
// b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente.

import java.util.Collections;

public class Ex05 {
    public static int[] preencheVetor(int tamanho) {
        int v[] = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            v[i] = i + 1;
        }
        return v;
    }
    public static int[] preencheVetorAleatorio(int tamanho){
        int v[] = preencheVetor(tamanho);
        shuffle(v);
        return v;
    }
    public static int[] bubbleSort (int[] v){
        int aux, quantTrocas = 0;
        boolean troca = true;
        while (troca) {
            troca = false;
            for(int i = 0; i < v.length - 1; i++){
                if (v[i] > v[i + 1]){
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    troca = true;
                    quantTrocas++;
                }
            }
        }
        System.out.println("Para ordenar o vetor, foram feitas " + quantTrocas + " trocas. ");
        return v;
    }
    // public static int[] 
}
