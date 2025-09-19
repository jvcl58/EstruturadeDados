// 1. Escreva um programa que leia dois vetores inteiros com dez posições cada.
//    A partir desses vetores, carregue um terceiro vetor onde o valor de cada
//    elemento será a média dos elementos de mesmo índice nos dois vetores
//    anteriores.

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int s = 10, v1[] = new int[s], v2[] = new int[s], m[] = new int[s];
        for(int i = 0; i < s; i++){
            v1[i] = rand.nextInt(10) + 1;
            v2[i] = rand.nextInt(10) + 1;
        }
        for(int i = 0; i < s; i++){
            m[i] = (v1[i] + v2[i])/2;
        }
    }
}
