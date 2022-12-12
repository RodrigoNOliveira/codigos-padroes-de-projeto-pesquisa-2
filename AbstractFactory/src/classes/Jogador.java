package classes;


public class Jogador {
    private Bola bola;
    private Calcado calcado;

    public Jogador(FabricaAbstrata fabrica) {
        this.bola = fabrica.criaBola();
        this.calcado = fabrica.criaCalcado();
    }

    public Bola getBola() {
        return bola;
    }

    public void setBola(Bola bola) {
        this.bola = bola;
    }

    public Calcado getCalcado() {
        return calcado;
    }

    public void setCalcado(Calcado calcado) {
        this.calcado = calcado;
    }

    @Override
    public String toString() {
        return "Jogador [bola=" + bola + ", calcado=" + calcado + "]";
    }


}
