package MED0921;

public class Main {
    public static void main(String[] args) {
        // Testar Exercício 01
        System.out.println("Testando o Exercício 01\n");
        int m = 134;
        int n = 22551;
        int mdc = Exercicio01.CalculaMDC(m, n);
        int rmdc = Exercicio01.recursivaMDC(m,n);

        System.out.println("O MDC é "+ mdc);
        System.out.println("O recursivo deu "+ rmdc);

        m = 12;
        n = 14;

        mdc = Exercicio01.CalculaMDC(m, n);
        rmdc = Exercicio01.recursivaMDC(m,n);

        System.out.println("O MDC é "+ mdc);
        System.out.println("O recursivo deu "+ rmdc);

        //Testar Exercício 02
        System.out.println("\nTestendo o Exercício 02\n");
        n = 4;

        int fatorial = Exercicio02.fatorial(n);
        System.out.println("O fatorial de "+n+" é "+fatorial);

        n = 12;
        fatorial = Exercicio02.fatorial(n);
        System.out.println("O fatorial de "+n+" é "+fatorial);

        //Testar Exercício 03
        System.out.println("\nTestendo o Exercício 03\n");
       int binario = Exercicio03.decimalParaBinario(n);
        System.out.println(n+" em binário é "+binario);
        n = 142;
        binario = Exercicio03.decimalParaBinario(n);
        System.out.println(n+" em binário é "+binario);

        //Testar Exercício 04
        System.out.println("\nTestendo o Exercício 04\n");
        n = 1984;
        int soma = Exercicio04.somaDigitos(n);
        System.out.println("A soma foi "+soma);

        n = 1979;
        soma = Exercicio04.somaDigitos(n);
        System.out.println("A soma foi "+soma);


    }
}
