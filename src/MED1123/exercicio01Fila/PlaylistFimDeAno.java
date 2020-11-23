package MED1123.exercicio01Fila;

public class PlaylistFimDeAno {
    NoPlaylist inicio;
    NoPlaylist fim;

    public PlaylistFimDeAno() {
        inicio = null;
        fim = null;
    }

    public void inserirMusica(String nome) {
        NoPlaylist aux = new NoPlaylist();
        aux.setNome(nome);

        if(inicio == null) {
            inicio = aux;
            fim = inicio;
            inicio.setProx(fim);
        } else {
            fim.setProx(aux);
            fim = aux;
        }
    }

    public void consultar() {
        NoPlaylist aux = inicio;
        while (aux != null) {
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



    public void remover() {
        if(estaVazia()) {
            System.out.println("Sua playlist está vazia");
        } else if(inicio.getProx() == null){
            inicio = null;
            System.out.println("Sua lista está vazia");
        } else {
            inicio = inicio.getProx();
        }
    }
}
