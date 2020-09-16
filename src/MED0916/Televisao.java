package MED0916;

public class Televisao {
    private boolean ligado;
    private Integer canais;
    private int volume;



    public Televisao() {
        this.ligado = false;
        this.canais = 11;
        this.volume = 1;
    }

    public void trocarCanal(int canalNovo){
        if(ligado) {
            this.canais = canalNovo;
            System.out.println("Canal foi mudado para "+canalNovo);
        } else {
            System.out.println("Sua Tv está desligada");
        }
    }

    public void ligarTV() {
        this.ligado = true;
        System.out.println("Sua TV está ligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentou para "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuiu para "+volume);
    }

    public void ajustarVolume(int volumeNovo) {
        this.volume = volumeNovo;
        System.out.println("Volume novo "+volume);
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Integer getCanais() {
        return canais;
    }

    public void setCanais(Integer canais) {
        this.canais = canais;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
