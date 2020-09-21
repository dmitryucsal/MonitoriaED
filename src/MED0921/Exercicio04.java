package MED0921;

public class Exercicio04 {
    //Faça um programa em java fazendo uso da recursividade que solicite para o usuário digitar um número,
    // em seguida, faça a soma de todos os algarismos do número.
    //2002 = 2+0+0+2
    //1984 = 1+9+8+4
    //84 n%10 = 4

    public static int somaDigitos(int n) {
        if(n==0) {
            return 0;
        } else {
            System.out.println("n%10 é igual a "+n%10+" onde n é igual a "+n);
            return n%10 + somaDigitos(n/10);
        }
    }
}
