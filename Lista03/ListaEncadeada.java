// 1. Implemente a classe ListaEncadeada para armazenar valores inteiros
//    referências para ligar os elementos da lista.

public class ListaEncadeada {
    public Node primeiro, ultimo;
    public int tamanho;

    // 2. Crie um método para criar uma lista vazia.
    public ListaEncadeada(){
        this.primeiro = null;
        this.ultimo = null;
        tamanho = 0;
    }
    // 3. Crie um método responsável por inserir um elemento no início da lista.
    public void inserirNoInicio(Node n){
        if (tamanho == 0){
            this.ultimo = n;
        }
        n.proximo = this.primeiro;
        this.primeiro = n;
        tamanho++;
    }
    public void inserirNoInicio(int v){
        Node n = new Node(v);
        inserirNoInicio(n);
    }
    // 4. Crie um método responsável por inserir um elemento no fim da lista.
    public void inserirNoFinal(Node n){
        if (tamanho == 0){
            this.primeiro = n;
        }
        this.ultimo.proximo = n;
        this.ultimo = n;
        tamanho++;
    }
    public void inserirNoFinal(int v){
        Node n = new Node(v);
        inserirNoFinal(n);
    }
    // 5. Crie um método responsável por inserir um elemento em uma posição
    //    específica da lista.
    public void inserirNoMeio(Node n, int pos){
        if (pos > tamanho) {
            System.out.println("Não foi possível inserir na posição desejada. ");
        }
        else{
            Node aux = this.primeiro;
            for(int i = 1; i < pos - 1; i++){
                aux = aux.proximo;
            }
            n.proximo = aux.proximo;
            aux.proximo = n;
            if (pos == tamanho) {
                this.ultimo = n;
            }
            tamanho++;
        }
    }
    public void inserirNoMeio(int v, int pos){
        Node n = new Node(v);
        inserirNoMeio(n, pos);
    }
    // 6. Crie um método responsável por remover um elemento no início da lista.
}