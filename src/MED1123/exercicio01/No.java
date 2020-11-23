package MED1123.exercicio01;

public class No {

    //O nó terá nome e o registro de quem será o próximo
    public String nome;
    public No prox;

    //Getters e setters padrão
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
