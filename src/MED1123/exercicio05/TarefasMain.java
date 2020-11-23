package MED1123.exercicio05;

public class TarefasMain {
    public static void main(String[] args) {
        PassoAPasso passoAPasso = new PassoAPasso();
        passoAPasso.inserirTarefas("Estudar");
        passoAPasso.inserirTarefas("Fazer café");
        passoAPasso.inserirTarefas("Fechar a prova");

        passoAPasso.removerTarefa();
        passoAPasso.removerTarefa();
        passoAPasso.removerTarefa();

    }
}
