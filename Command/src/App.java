
public class App {

	public static void main(String[] args) {
		Chuveiro chuveiro =  new Chuveiro();
		CommandConcreto comando= new CommandConcreto(chuveiro);
		Controlador control = new Controlador(comando,comando);
		
		control.abrirChuveiro();
		control.fecharChuveiro();
	}

}