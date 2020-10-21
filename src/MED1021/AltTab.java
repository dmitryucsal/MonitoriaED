package MED1021;

public class AltTab {
    NoDEC inicio;
    NoDEC fim;



    public AltTab() {
        inicio = null;
        fim = null;
    }

    public boolean isEmpty() {
        if(inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir(String nome) {
        NoDEC novoNo = new NoDEC();
        novoNo.setNome(nome);

        if(isEmpty()) {
            inicio = novoNo;
            fim = inicio;
        } else if(inicio == fim) {
            fim = novoNo;
            inicio.setProximo(fim);
            inicio.setAnterior(fim);
            fim.setProximo(inicio);
            fim.setAnterior(inicio);
        } else {
            NoDEC aux = inicio;
            while (aux != fim) {
                aux = aux.getProximo();
            }
            aux.setProximo(novoNo);
            novoNo.setAnterior(aux);
            novoNo.setProximo(inicio);
            fim = novoNo;
        }
    }

    public void remover() {
        if(isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            fim = fim.getAnterior();
            inicio.setAnterior(fim);
        }
    }

    public void listar() {
        NoDEC aux = inicio;
        while(aux != fim) {
            System.out.println(aux.getNome());
            aux = aux.getProximo();
        }
        System.out.println(aux.getNome());
    }

}
