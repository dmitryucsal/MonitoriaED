package MED1123.exercicio05;

public class PassoAPasso {

    NoTarefas inicio;
    NoTarefas fim;

    public PassoAPasso() {
        inicio = null;
        fim = null;
    }

    public void inserirTarefas(String tarefa) {
        NoTarefas aux = new NoTarefas();
        aux.setTarefa(tarefa);
        aux.setProx(null);
        if(inicio == null) {
            inicio = aux;
            inicio.setProx(null);
            fim = inicio;
        } else if(inicio == fim) {
            fim = aux;
            inicio.setProx(fim);
        } else {
            fim.setProx(aux);
            fim = aux;
        }
    }

    public void removerTarefa() {
        if(inicio == fim) {
            System.out.println("Tarefa '"+inicio.getTarefa()+"' realizada");
            inicio = null;
            fim = null;
            System.out.println("Parabéns! Acabaram as tarefas!");
        } else {
            NoTarefas aux = inicio;
            while (aux.getProx() != fim) {
                aux = aux.getProx();
            }
            System.out.println("Tarefa '"+fim.getTarefa()+"' realizada");
            fim = aux;
            fim.setProx(null);
        }
    }


}
