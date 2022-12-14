
public class Chuveiro {
	
	public final static int ABERTA = 0;
	public final static int FECHADA = 1;
	
	private int estado = 1;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public void abrir() {
		this.estado = ABERTA;
		System.out.println("Abriu chuveiro");
		
	}
	
	public void fechar() {
		this.estado = FECHADA;
		System.out.println("Fechou chuveiro.");
	}

}