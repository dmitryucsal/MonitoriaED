package MED1123.exercicio01;

import java.util.Scanner;

public class PilhaLivrosMain {
    public static void main(String[] args) {

//        pilhaLivros.inserir("O senhor dos Pastéis");
//        pilhaLivros.inserir("Harry Podre");
//        pilhaLivros.inserir("Angela quer que eu reprove");
//
//        pilhaLivros.consultar();
//        System.out.println("\nRemover um livro\n");
//        pilhaLivros.remover();
//        pilhaLivros.consultar();
//        System.out.println("\nVamos esvaziar a pilha\n");
//        pilhaLivros.esvaziar();
//        pilhaLivros.consultar();

        run();

    }

    public static void run() {
        PilhaLivros pilhaLivros = new PilhaLivros();
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            pilhaLivros.menu();
            int escolhaMenu = sc.nextInt();

            switch (escolhaMenu){
                case 1:
                    System.out.println("Digite o nome do livro:\n");
                    String nome = sc.next();
                    pilhaLivros.inserir(nome);
                    break;
                case 2:
                    pilhaLivros.remover();
                    System.out.println("Livro removido com sucesso");
                    break;
                case 3:
                    pilhaLivros.consultar();
                    break;
                case 4:
                    pilhaLivros.esvaziar();
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar nosso app!");
                    sair = true;

                    break;
                default:
                    pilhaLivros.menu();
            }

        }
    }
}
