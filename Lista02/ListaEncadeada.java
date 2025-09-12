// 1. Implemente a classe ListaEncadeada utilizando um arranjo de inteiros para
//    armazenar os elementos da lista

package Lista02;

public class ListaEncadeada {
    public int lista[], primeiro, ultimo;
    // 2. Crie um método para criar uma lista vazia.
    public ListaEncadeada(){
        this.primeiro = -1;
        this.ultimo = 0;
        this.lista = new int[10];
    }
    private void aumentarLista(){
        int v[] = new int[this.lista.length * 2];
        for (int i = 1; i + this.primeiro < this.ultimo ; i++){
            v[i] = this.lista[i + primeiro];
        }
    }
    // 3. Crie um método responsável por inserir um elemento no início da lista.
    public void inserirNoInicio(int elemento){
        if (primeiro != -1) {
            this.lista[primeiro] = elemento;
            primeiro--;
        }
        else{
            
        }
    }
    // 6. Crie um método responsável por remover um elemento no início da lista.
    public void removerNoInicio(){
        primeiro++;
    }
}
