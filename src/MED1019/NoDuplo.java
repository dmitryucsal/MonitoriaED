package MED1019;
/*
Crie um programa que faça a utilização de listas duplamente encadeadas,
 onde cadastre passageiros de um transporte, que deverá conter neste cadastro nome.
 Esse programa deverá contemplar as seguintes funcionalidades: Incluir no fim e Remover no fim.
 Após a inclusão fazer um método para Listar todos os passageiros.


 */

public class NoDuplo {
    String nome;
    NoDuplo proximo;
    NoDuplo anterior;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}
