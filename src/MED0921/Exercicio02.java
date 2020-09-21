package MED0921;

public class Exercicio02 {
    //Desenvolva um programa em java que calcule o fatorial de um número x
    public static int fatorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }

    }

}
