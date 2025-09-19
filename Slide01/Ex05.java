// 5. Implemente dois algoritmos que ordenem os elementos de um vetor em ordem
//    crescente e compare o número de trocas que eles efetuam durante a
//    ordenação de:
// a) um vetor criado com os números de 1 até 100 aleatoriamente distribuídos.
// b) um vetor criado com os números de 1 até 100 ordenados em ordem decrescente.

import java.util.Random;

public class Ex05 {
    public static void imprimeVetor(int[] v){
        String vetor = "";
        for(int i = 0; i < v.length; i++){
            vetor += (v[i] + "\t");
        }
        System.out.println(vetor);
    }
    public static int[] preencheVetorInvertido(int tamanho) {
        int v[] = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            v[i] = tamanho - i;
        }
        return v;
    }
    public static int[] preencheVetorAleatorio(int tamanho){
        int v[] = new int[tamanho], i = 0, r = 0;
        Random random = new Random();
        while (i < tamanho) {
            r = random.nextInt(tamanho);
            if (v[r] == 0) {
                v[r] = ++i;
            }
        }
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
        System.out.println("[BUBBLE SORT] Para ordenar o vetor, foram feitas " + quantTrocas + " trocas. ");
        return v;
    }
    public static int[] selectionSort (int[] v){
        int aux, m, quantTrocas = 0;
        for(int i = 0; i < v.length; i++){
            m = i;
            for(int j = i + i; j < v.length; j++){
                if(v[j] < v[i]){
                    m = j;
                }
            }
            if(v[i] != v[m]){
                aux = v[m];
                v[m] = v[i];
                v[i] = aux;
                quantTrocas++;
            }
        }
        System.out.println("[SELECT SORT] Para ordenar o vetor, foram feitas " + quantTrocas + " trocas. ");
        return v;
    }
    // public static int[] 
    public static void main(String[] args) {
        int t = 100, v[] = preencheVetorAleatorio(t), v2[] = v.clone();
        imprimeVetor(v);
        bubbleSort(v);
        selectionSort(v2);
        imprimeVetor(v);
        imprimeVetor(v2);
        v = preencheVetorInvertido(t); v2 = v.clone();
        imprimeVetor(v);
        bubbleSort(v);
        selectionSort(v2);
        imprimeVetor(v);
        imprimeVetor(v2);
    }
}
