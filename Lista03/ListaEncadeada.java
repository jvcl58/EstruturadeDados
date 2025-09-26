// 1. Implemente a classe ListaEncadeada para armazenar valores inteiros
//    referências para ligar os elementos da lista.
public class ListaEncadeada {
    public Node primeiro, ultimo;
    public int tamanho;

    // 2. Crie um método para criar uma lista vazia.
    public ListaEncadeada(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    
    // 3. Crie um método responsável por inserir um elemento no início da lista.
    public void inserirNoInicio(Node n){
        if (tamanho == 0){
            this.ultimo = n;
        }
        n.proximo = this.primeiro;
        this.primeiro = n;
        this.tamanho++;
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
        this.tamanho++;
    }
    public void inserirNoFinal(int v){
        Node n = new Node(v);
        inserirNoFinal(n);
    }
    
    // 5. Crie um método responsável por inserir um elemento em uma posição
    //    específica da lista.
    public void inserirNoMeio(Node n, int pos){
        if (pos > tamanho + 1 || pos <= 1 || tamanho == 0) {
            System.out.println("(" + n.valor + ":" + pos + ") Não foi possível inserir na posição desejada. \n");
        }
        else{
            if (pos == 1) {
                inserirNoInicio(n);
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
                this.tamanho++;
            }
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
            this.tamanho--;
        }
    }
    
    // 7. Crie um método responsável por remover um elemento no fim da lista.
    public void removerNoFinal(){
        if (tamanho <= 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.tamanho = 0;
        }
        else{
            Node aux = this.primeiro;
            while (aux.proximo.proximo != null) {
                aux = aux.proximo;
            }
            this.ultimo = aux;
            aux.proximo = null;
            this.tamanho--;
        }
    }
    
    // 8. Crie um método responsável por remover um elemento em uma posição
    //    específica da lista.
    public void removerNaPosicao(int pos){
        if (tamanho != 0 && pos <= tamanho && pos > 1) {
            if (pos == 1) {
                removerNoInicio();
            }
            else{
                Node aux = this.primeiro;
                for(int i = 1; i < pos - 1; i++){
                    aux = aux.proximo;
                }
                aux.proximo = aux.proximo.proximo;
                this.tamanho--;
            }
        }
        else{
            System.out.println("(" + pos + ") Não foi possível remover a posição desejada. \n");
        }
    }
    
    // 9. Crie um método responsável por remover um elemento específico da lista.
        public void removerElemento(int e) {
        if (tamanho != 0) {
            if (this.primeiro.valor == e) {
                removerNoInicio();
            } else {
                Node aux = this.primeiro;
                while (aux.proximo != null && aux.proximo.valor != e) {
                    aux = aux.proximo;
                }
                if (aux.proximo != null && aux.proximo.valor == e) {
                    aux.proximo = aux.proximo.proximo;
                    if (aux.proximo == null) {
                        this.ultimo = aux;
                    }
                    this.tamanho--;
                } else {
                    System.out.println("(" + e + ") Elemento não encontrado na lista.");
                }
            }
        }
    }
    // 10. Crie um método para exibir o conteúdo de uma lista.
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
    
    // 11. Crie um método para pesquisar por um elemento específico em uma lista
    //     e informar, caso o elemento exista, a posição na qual ele está
    //     armazenado.
    public void procurarElemento(int e){
        if (tamanho != 0){
            Node aux = this.primeiro;
            int pos = 1;
            while (aux.proximo != null && aux.valor != e) {
                aux = aux.proximo;
                pos++;
            }
            if (aux.valor == e) {
                System.out.println("(" + e + ":" + pos + ") Elemento encontrado na posição " + pos + ".");
            }
            else{
                System.out.println("(" + e + ") Elemento não encontrado na lista.");
            }
        }
    }
    // 12. Crie um método que retorne o número de elementos existentes na lista.
    public int quantElementos(){
        return this.tamanho;
    }
}