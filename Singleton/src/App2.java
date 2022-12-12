public class App2 {
    public static void main(String[] args) throws Exception {
        Singleton teste1;
        Singleton teste2;

        teste1 = Singleton.obterUnicaInstancia();
        teste2 = Singleton.obterUnicaInstancia();

        System.out.println(teste1);
        System.out.println(teste2);

        }
    }

