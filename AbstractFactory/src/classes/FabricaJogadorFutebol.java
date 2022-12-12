package classes;


public class FabricaJogadorFutebol implements FabricaAbstrata {

    @Override
    public Calcado criaCalcado() {
        return new CalcadoFutebol();
    }

    @Override
    public Bola criaBola() {
        return new BolaFutebol();
    }

    

   
    
}
