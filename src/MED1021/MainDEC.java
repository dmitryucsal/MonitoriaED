package MED1021;

import java.util.Scanner;

public class MainDEC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AltTab altTab = new AltTab();
        altTab.inserir("netflix");
        altTab.inserir("spotify");
        altTab.inserir("opera");
        altTab.listar();

        System.out.println("\nVamos retirar um\n");
        altTab.remover();
        altTab.listar();

    }
}
