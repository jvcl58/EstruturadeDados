// 2. Escreva um programa que carregue um vetor inteiro de cem posições com
//    números aleatórios entre 0 e 100. Percorrendo o vetor criado apenas uma
//    vez, imprima a posição onde ocorre o menor o valor, a soma dos números
//    armazenados e preencha os valores de um novo vetor com metade do tamanho
//    do vetor original onde a primeira posição do novo vetor é igual à soma da
//    primeira e da última posição do vetor original. A segunda posição do novo
//    vetor é a soma da segunda e da penúltima posição do vetor original e assim
//    em diante.

import java.util.Random;

public class Ex02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int v[] = new int[100];
        for(int i = 0; i < 100; i++){
            v[i] = rand.nextInt(101);
        }
        int menor = v[0], soma = 0, v2[] = new int[50];
        for(int i = 0; i < 100; i++){
            
            if (v[i] < menor) {
                menor = v[i];
            }
            
            soma = soma + v[i];
            
            if (i < 50) {
                v2[i] = v[i] + v[99 - i];
            }
        }
    }
}
