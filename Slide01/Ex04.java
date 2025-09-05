// 4. Escreva um programa que ordene um vetor de tamanho arbitrário preenchido
//    com números aleatórios e execute a pesquisa por um valor passado como
//    parâmetro utilizando o algoritmo da busca binária
public class Ex04 {
    public static int[] ordenar (int[] v){
        int aux;
        boolean troca = true;
        while (troca) {
            troca = false;
            for(int i = 0; i < v.length - 1; i++){
                if (v[i] > v[i + 1]){
                    aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return v;
    }
    
    public static int buscaBinaria (int[] v, int e){
        int i = 0, f = v.length;
        while (i < f) {
            int m =i + (f - i)/ 2;
            if (v[m] == e) {
                return m;
            }
            else{
                if (v[m] < e) {
                    i = m;
                }
                else{
                    f = m;
                }
            }
            System.out.printf("\n\nInicio: %d Meio: %d Fim: %d", i, m, f);
        }
        return -1;
    }
    public static void main(String[] args) {
        int v[] = {38, 19, 63, 84, 5, 92, 12, 77, 56, 45, 28, 3, 90, 68, 21, 72, 51, 74};
        v = ordenar(v);
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + "\t");
        }
        System.out.println("\n" + buscaBinaria(v, 55));
    }
}
