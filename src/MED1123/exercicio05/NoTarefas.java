package MED1123.exercicio05;

public class NoTarefas {
    String tarefa;
    NoTarefas prox;

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public NoTarefas getProx() {
        return prox;
    }

    public void setProx(NoTarefas prox) {
        this.prox = prox;
    }
}
