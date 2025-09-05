// 3. Escreva um programa que carregue dois vetores inteiros com 5 posições,
//    sendo um com números pares e o outro com números ímpares. O usuário pode
//    digitar os números em qualquer sequência e o programa deverá armazená-los
//    no vetor correto na ordem em que foram informados pelo usuário.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vImpar[] = new int[5], vPar[] = new int[5], indImpar = 0, indPar = 0, numero;
        for(int i = 0; i < 5; i++){
            System.out.printf("\n\nDigite o %dº número inteiro: ", i);
            numero = input.nextInt();
            if (numero%2 == 0) {
                vPar[indPar] = numero;
                indPar++;
            }
            else{
                vImpar[indImpar] = numero;
                indImpar++;
            }
        }
        input.close();
    }
}
