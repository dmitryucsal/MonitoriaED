package MED1123.exercicio01;

public class PilhaLivros {

    No inicio;
    No fim;

    public PilhaLivros() {
        inicio = null;
        fim = null;

    }

    public void inserir(String nome) {
        No aux = new No();
        aux.setNome(nome);

        if(inicio == null) {
            inicio = aux;
            fim = inicio;
            inicio.setProx(null);
        } else if (inicio == fim) {
            fim = aux;
            inicio.setProx(fim);
            fim.setProx(null);
        } else {
            fim.setProx(aux);
            fim = aux;
        }
    }


    public void remover() {
        if(inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            No aux = inicio;
            while(aux.getProx() != fim) {
                aux = aux.getProx();
            }
            fim = aux;
            fim.setProx(null);
        }
    }

    public void consultar() {
        No aux = inicio;
        while( aux != null) {
            System.out.println(aux.getNome());
            aux = aux.getProx();
        }
    }

    public boolean estaVazia() {
        if(inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void esvaziar() {
        if(estaVazia()) {
            System.out.println("Sua pilha já está vazia");
        } else {
            inicio = null;
            fim = null;
            System.out.println("Sua pilha agora está vazia");
        }
    }

    public void menu() {
        System.out.println("Bem vindo ao organizador de livros das férias. Digite:" +
                "\n1 - Para inserir livros" +
                "\n2 - Para remover livros" +
                "\n3 - Para ver os livros da sua pilha" +
                "\n4 - Para esvaziar toda a pilha" +
                "\n5 - Para sair");
    }
}
