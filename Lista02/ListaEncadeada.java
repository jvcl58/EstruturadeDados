// 1. Implemente a classe ListaEncadeada utilizando um arranjo de inteiros para
//    armazenar os elementos da lista

package Lista02;

public class ListaEncadeada {
    public int lista[], primeiro, ultimo;
    // 2. Crie um método para criar uma lista vazia.
    public ListaEncadeada(){
        this.primeiro = 0;
        this.ultimo = 0;
        this.lista = new int[10];
    }
    public void imprimirLista(){
        String s = "";
        for (int i = 0; i + this.primeiro < this.ultimo ; i++){
            s += this.lista[primeiro + i] + "\t";
        }
        System.out.println(s);
    }

    private void aumentarLista(){
        int v[] = new int[this.lista.length * 2];
        for (int i = 1; i + this.primeiro < this.ultimo ; i++){
            v[i] = this.lista[primeiro + i];
        }
        this.lista = v;
    }
    private void moverListaDireita() {
        if (ultimo <= lista.length) {
            for (int i = 0; i + this.primeiro < this.ultimo ; i++){
            // v[i] = this.lista[primeiro + i];
        }
        }
    }
    // 3. Crie um método responsável por inserir um elemento no início da lista.
    public void inserirNoInicio(int elemento){
        if (primeiro != 0) {
            primeiro--;
            this.lista[primeiro] = elemento;
        }
        else{
            // if (condition) {
                
            }
        }
        // 6. Crie um método responsável por remover um elemento no início da lista.
        public void removerNoInicio(){
            primeiro++;
        }
        public static void main(String[] args) {
            ListaEncadeada l = new ListaEncadeada();
            l.inserirNoInicio(4);
            l.imprimirLista();
        }
    }