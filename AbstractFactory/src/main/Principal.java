package main;

import classes.FabricaAbstrata;
import classes.FabricaJogadorFuteAmericano;
import classes.FabricaJogadorFutebol;
import classes.FabricaJogadorTenis;
import classes.Jogador;

public class Principal {
    public static void main(String[] args) throws Exception {
       FabricaAbstrata fabrica1 = new FabricaJogadorFuteAmericano();
       Jogador jogador = new Jogador(fabrica1);
       System.out.println(jogador);

       FabricaAbstrata fabrica2 = new FabricaJogadorFutebol();
       Jogador jogador2 = new Jogador(fabrica2);
       System.out.println(jogador2);

       FabricaAbstrata fabrica3 = new FabricaJogadorTenis();
       Jogador jogador3 = new Jogador(fabrica3);
       System.out.println(jogador3);

    }
}
