package MED0923;

public class ListaProfessores {
    private No inicio;
    private int tamanho;

    public ListaProfessores() {
        this.inicio = null;
        this.tamanho = 0;
    }


    // Angela,Osvaldo,Neiva,Jeane

    public void adicionar(String nome) {
        No novoNo = new No(nome);

        if(inicio == null) {
            inicio = novoNo;
        } else {
            No auxiliar = inicio;
            while(auxiliar.getProximo() != null) {
                auxiliar.setProximo(auxiliar.getProximo());
            }
            auxiliar.setProximo(novoNo);
        }

    }
}
