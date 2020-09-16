package MED0916;

public class ProfessorMain {
    public static void main(String[] args) {
        Professor professores = new Professor();

        professores.incluir("Angela");
        professores.incluir("Osvaldo");
        professores.incluir("Neiva");

        professores.consulta();


    }
}
