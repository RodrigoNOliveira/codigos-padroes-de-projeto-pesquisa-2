public class Controlador {
    
    private Command[] commands;
    private Command fim;

    public Controlador (Command abrir, Command fechar){
        this.commands = new Command[2];
        commands[0] = abrir;
        commands[1] = fechar;
    }

    public void abrirChuveiro(){
        commands[0].execute();
        fim = commands[0];
    }

    public void fecharChuveiro(){
        commands[1].undo();
        fim = commands[1];
    }

    public void resetar() {
		fim.undo();
	}


}
