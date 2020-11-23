package MED1123.exercicio03Fila;

public class FilaMercado {

    NoMercado inicio;
    NoMercado fim;
    int contador;

    public FilaMercado() {
        inicio = null;
        fim = null;
        contador = 0;
    }

    public void inserirCliente(String nome) {
        NoMercado aux = new NoMercado();
        aux.setNomeCliente(nome);
        aux.setProx(null);
        if(inicio == null) {
            inicio = aux;
            fim = aux;
        } else if (inicio == fim) {
            fim = aux;
            inicio.setProx(fim);
        } else {
            fim.setProx(aux);
            fim = aux;
        }

        contador++;
    }

    public boolean estaVazia() {
        if (inicio == null) {
            return true;
        }else {
            return false;
        }
    }

    public void removerCliente() {
        if(estaVazia()) {
            System.out.println("Sua fila já está vazia");
        } else {
            inicio = inicio.getProx();
            contador--;
        }
    }

    public int getContador() {
        return contador;
    }
}
