public class CommandConcreto implements Command{

    private Chuveiro chuveiro;

    public CommandConcreto(Chuveiro chuveiro) {
        this.chuveiro = chuveiro;
    }

    @Override
    public void execute() {
        chuveiro.abrir();
    }

    @Override
    public void undo() {
        chuveiro.fechar();
    }

   

  
}
