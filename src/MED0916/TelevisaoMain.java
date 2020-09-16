package MED0916;

public class TelevisaoMain {
    public static void main(String[] args) {
        Televisao tvQuarto = new Televisao();
        Televisao tvSala = new Televisao();



        tvQuarto.trocarCanal(12);

        tvQuarto.ligarTV();

        tvQuarto.trocarCanal(12);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
