public class Teste {
    public static void main(String[] args) {
        ListaEncadeada l = new ListaEncadeada();
        l.inserirNoInicio(0);
        l.inserirNoInicio(5);
        l.inserirNoFinal(10);
        l.imprimirElementos();
        l.inserirNoMeio(1, 0);
        l.inserirNoMeio(6, 1);
        l.imprimirElementos();
    }
}
