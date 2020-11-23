package MED1123.exercicio03Fila;

public class NoMercado {
    String nomeCliente;
    NoMercado prox;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public NoMercado getProx() {
        return prox;
    }

    public void setProx(NoMercado prox) {
        this.prox = prox;
    }
}
