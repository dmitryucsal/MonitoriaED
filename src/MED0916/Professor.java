package MED0916;

import java.util.ArrayList;
import java.util.List;

public class Professor implements IProfessoresUcsal {

    public List<String> professores = new ArrayList<>();

    public Professor() {
        this.professores = professores;
    }

    @Override
    public void consulta() {
        for (int i = 0; i < professores.size(); i++) {
            System.out.print(professores.get(i)+ " ");
        }
    }

    @Override
    public void incluir(String nome) {
        professores.add(nome);
    }

    @Override
    public void remocao(String nome) {
        for(int i = 0; i < professores.size(); i++) {
            if(professores.get(i).equals(nome)){
                professores.remove(i);
            }
        }
    }

    @Override
    public int retornoQtd() {
        return professores.size()+1;
    }


    @Override
    public void limpar() {
        professores = null;
    }

    @Override
    public void professorEhLindo() {
        System.out.println("é não");
    }


}
