package classes;


public class FabricaJogadorFuteAmericano implements FabricaAbstrata {

    @Override
    public Calcado criaCalcado() {
        return new CalcadoFutAmericano();
    }

    @Override
    public Bola criaBola() {
        return new BolaFutAmericano();
    }

    

   
    
}
