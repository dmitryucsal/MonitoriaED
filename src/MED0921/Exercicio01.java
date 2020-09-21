package MED0921;

//1 – O método a seguir, executa o cálculo do MDC (máximo divisor comum) de dois inteiros positivos m e n.
// Escreva um método recursivo equivalente.
//public static int CalculaMDC(int m, int n){
//int r;
//do{
//r = m%n;
//m = n;
//n = r;
//} while (r != 0);
//return m;
//}

public class Exercicio01 {
    public static int CalculaMDC(int m, int n) {
        int r;
        do {
            r = m % n;
            m = n;
            n = r;
        } while (r != 0);
        return m;
    }

    public static int recursivaMDC(int m, int n) {
        int r;
        r = m % n;
        if (r == 0) {
            return n;
        } else {
            m = n;
            n = r;
            return recursivaMDC(m, n);
        }
    }
}
