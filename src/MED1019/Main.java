package MED1019;

public class Main {
    public static void main(String[] args) {
        ListaDePassageiros lista1 = new ListaDePassageiros();
        lista1.inseir("Dmitry");
        lista1.inseir("Isabel");
        lista1.inseir("Pivete");
        lista1.inseir("Angela");
        lista1.listar();
        System.out.println("\nVamos apagar 1 nome\n");
        lista1.remover();
        lista1.listar();
    }
}
