package MED1123.exercicio03Fila;

public class FilaMercadoMain {


    public static void main(String[] args) {
        FilaMercado filaMercado = new FilaMercado();
        filaMercado.inserirCliente("Dmitry");
        filaMercado.inserirCliente("Angela");
        filaMercado.inserirCliente("Daniel");
        System.out.println("Nossa fila tem "+filaMercado.getContador()+" clientes");
        filaMercado.removerCliente();
        System.out.println("Nossa fila tem "+filaMercado.getContador()+" clientes");
    }
}
