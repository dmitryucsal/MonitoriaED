package MED0930;

public class MatriculaMain {
    public static void main(String[] args) {
        ListaMatricula lista = new ListaMatricula(249,"Dmitry Rocha", "Publicidade");

        lista.adicionar(334,"Carlos Pinho", "Engenharia de Software");
        lista.adicionar(002,"Osvaldo","Computação");
        lista.adicionar(132,"Ricardo Oliveira","Engenharia de Software");
        lista.adicionar(233, "Angela ED", "Engenharia de requisitos");


        lista.listar();

        System.out.println("Vamos remover 1\n\n");
        lista.remover();
        lista.listar();

        System.out.println("Vamos pesquisar ");
        System.out.println("O nome Osvaldo está na lista? "+lista.pesquisar("Osvaldo"));
        System.out.println("O nome Tatiana está na lista? "+lista.pesquisar("Tatiana"));
        System.out.println("_____________________________________");

        System.out.println("Será que fica em ordem?");
        lista.alfabetica();
        lista.listar();

    }
}
