package MED1019;

import MED0923.ListaProfessores;

public class ListaDePassageiros {
    private NoDuplo inicio;
    private NoDuplo fim;

    public ListaDePassageiros() {
        this.inicio = null;
        this.fim = null;
    }

    public void inseir(String nome) {
        NoDuplo novoNo = new NoDuplo();
        novoNo.setNome(nome);
        novoNo.setAnterior(null);
        novoNo.setProximo(null);

        if(inicio == null) {
            inicio = novoNo;
            fim = inicio;
        } else if (inicio == fim) {
            fim = novoNo;
            fim.setAnterior(inicio);
            inicio.setProximo(fim);
        } else {
            fim.setProximo(novoNo);
            novoNo.setAnterior(fim);
            fim = novoNo;
        }
    }

    public void remover() {
        if(inicio == null) {
            System.out.println("Sua lista está vazia!");
        } else if(inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.getAnterior();
            fim.setProximo(null);
        }
    }

    public void listar() {
        System.out.println("Imprimindo a lista de passageiros:\n");
        NoDuplo aux = inicio;
        while (aux != null) {
            System.out.println("Nome: "+aux.getNome());
            aux = aux.getProximo();
        }
    }
}
