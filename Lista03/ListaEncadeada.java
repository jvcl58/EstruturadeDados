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
        if (pos > tamanho || pos <= 0 || tamanho == 0) {
            System.out.println("(" + n.valor + ":" + pos + ") Não foi possível inserir na posição desejada. \n");
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
    public void removerNoInicio(){
        if (tamanho != 0) {
            this.primeiro = this.primeiro.proximo;
        }
    }
    
    // 12. Crie um método que retorne o número de elementos existentes na lista.
    public int quantElementos(){
        return this.tamanho;
    }
    public void imprimirElementos(){
        System.out.println("Elementos existentes na lista:");
        if (tamanho !=0) {
            Node n = this.primeiro;
            while (n != null) {
                System.out.println(n.valor);
                n = n.proximo;
            }
        }
        System.out.println("Fim da lista. \n");
    }
}