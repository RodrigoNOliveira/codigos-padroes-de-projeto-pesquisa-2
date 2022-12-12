

public class Singleton {
	private static Singleton objetoUnico;
	
	private Singleton() {
		}
	
	public static Singleton obterUnicaInstancia() {
		if(objetoUnico == null) {
			objetoUnico = new Singleton();
		}
		return objetoUnico;
	}

}