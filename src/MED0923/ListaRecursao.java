package MED0923;

import java.util.LinkedList;
import java.util.List;

public class ListaRecursao {
    public static int calculaMDC(int m, int n) {
        int r;
        do {
            r = m%n;
            m = n;
            n = r;
        } while (r != 0);

        return m;
    }

    public static int recursivaMDC(int m, int n){
        int r;
        r = m%n;
        if(r==0) {
            return n;
        } else {
            m = n;
            n = r;
            return recursivaMDC(m, n);
        }
    }


    public static int fatorial(int numero) {
        //fatorial de 6 = 6*5*4*3*2*1
        if(numero == 1) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }

    public static int binarioGenerator(int decimal) {
        if(decimal == 0) {
            return 0;
        } else {
            System.out.println("decimal: "+decimal+", decimal%2="+decimal%2);
            return decimal % 2 + 10 * (binarioGenerator(decimal/2));
        }
    }
    //1985 = 1+9+8+5
    public static int digitos(int ano) {
        if(ano ==0) {
            return 0;
        } else {
            System.out.println("ano = "+ano+", ano%10 = "+ano%10);
            return ano%10 + digitos(ano/10);
        }
    }

    public static int movimentosHanoi(int n) {
        if(n ==1){
            return 1;
        } else {
            return 2*movimentosHanoi(n-1)+1;
        }
    }

}
