package MED0916;

interface IProfessoresUcsal {

    //Indica quais métodos serão obrigatŕios na classe
    void consulta();
    void incluir(String nome);
    void remocao(String nome);
    int retornoQtd();
    void limpar();
    void professorEhLindo();
}
