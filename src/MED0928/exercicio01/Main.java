package MED0928.exercicio01;

public class Main {
    public static void main(String[] args) {
        ListaProfessores lista1 = new ListaProfessores();

        lista1.adicionar("Angela");
        lista1.adicionar("Osvaldo");
        lista1.adicionar("Neiva");
        lista1.adicionar("Indio");

        lista1.listar();
        System.out.println("\nVamos remover 1");
        lista1.remover();
        lista1.listar();
        System.out.println("\nVamos verificar o tamamnho");
        System.out.println("O tamanho é "+lista1.verificarTamanho());

        System.out.println("\nA lista está vazia? "+lista1.estaVazia());
        System.out.println("Vamos apagar a lista toda");
        lista1.apagarLista();
        System.out.println("\nA lista está vazia? "+lista1.estaVazia());

    }
}
