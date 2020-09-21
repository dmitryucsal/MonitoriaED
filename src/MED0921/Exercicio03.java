package MED0921;

public class Exercicio03 {
    //Escreva em java um método recursivo que receba
    // um número inteiro na base decimal e realize a conversão deste número para base binária.

    public static int decimalParaBinario(int decimal) {

        if(decimal == 0) {
            return 0;
        } else {
            return decimal % 2 + 10 * (decimalParaBinario(decimal/2));
        }

    }


}
