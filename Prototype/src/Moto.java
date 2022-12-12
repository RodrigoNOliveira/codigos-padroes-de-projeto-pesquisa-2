public class Moto implements Cloneable{
    private String nome;
    private Fabrica fabricante;
    private double valor;
    private int cilindradas;


    public Moto(String nome, Fabrica fabricante, double valor, int cilindradas) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.valor = valor;
        this.cilindradas = cilindradas;
    }

    

   



    @Override
    protected Moto clone() throws CloneNotSupportedException {
        Moto motoClone = (Moto) super.clone();
        motoClone.fabricante =  (Fabrica) motoClone.fabricante.clone();
        return motoClone;
    }







    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto [nome=" + nome + ", fabricante=" + fabricante + ", valor=" + valor + ", cilindradas=" + cilindradas
                + "]";
    }







    public Fabrica getFabricante() {
        return fabricante;
    }







    public void setFabricante(Fabrica fabricante) {
        this.fabricante = fabricante;
    }


    
    

    
}
