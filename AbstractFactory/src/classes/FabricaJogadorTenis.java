package classes;


public class FabricaJogadorTenis implements FabricaAbstrata {

    @Override
    public Calcado criaCalcado() {
        return new CalcadoTenis();
    }

    @Override
    public Bola criaBola() {
        return new BolaTenis();
    }

    

   
    
}
