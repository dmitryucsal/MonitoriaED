package MED1021;

public class NoDEC {
    String nome;
    NoDEC anterior;
    NoDEC proximo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NoDEC getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDEC anterior) {
        this.anterior = anterior;
    }

    public NoDEC getProximo() {
        return proximo;
    }

    public void setProximo(NoDEC proximo) {
        this.proximo = proximo;
    }
}
