
public class Fabrica implements Cloneable{
    private String  nome;

    public Fabrica(String nome) {
        this.nome = nome;
    }

    @Override
    protected Fabrica clone() throws CloneNotSupportedException {
        return (Fabrica)super.clone();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fabrica [nome=" + nome + "]";
    }
    


    
}
