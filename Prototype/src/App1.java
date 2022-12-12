public class App1 {
     public static void main(String[] args) throws Exception {
        
        Moto moto = new Moto("CB600", new Fabrica("Honda"), 38000, 600);
    
        Moto cloneMoto = moto.clone();
        cloneMoto.setNome("FZ6");
        cloneMoto.setCilindradas(600);
        cloneMoto.getFabricante().setNome("Yamaha");
        cloneMoto.setValor(38000);



        System.out.println(moto);
        System.out.println(cloneMoto);

    }
}
