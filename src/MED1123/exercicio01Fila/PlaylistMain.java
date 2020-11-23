package MED1123.exercicio01Fila;

public class PlaylistMain {
    public static void main(String[] args) {
        PlaylistFimDeAno playlist = new PlaylistFimDeAno();
        playlist.inserirMusica("Teste");
        playlist.inserirMusica("Só pra contrariar");
        playlist.consultar();
        System.out.println("\nVamos retirar uma música\n");
        playlist.remover();
        playlist.consultar();
        System.out.println("\nVamos retirar uma música\n");
        playlist.remover();
        playlist.consultar();
    }
}
