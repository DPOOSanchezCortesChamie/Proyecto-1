package modelo;

public class Admin {
	
	TemporadaFantasia temporada;
	private String nombre;
	private String contrasena;
	
	public Admin(String nombre, String contrasena) {
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
	public TemporadaFantasia crearTemporada(String nominas, String partidos, int presupuesto, String nombre) {
		temporada = new TemporadaFantasia(presupuesto, nombre);
		temporada.crearTemporadaReal(nominas, partidos);
		return temporada;
	}
	public void registrarResultadoPartido(String resultado) {
		temporada.hacerReportePartido(resultado);
		actualizarDatosTemporada();
	}
	public boolean isUser(String nombre,String contrasena) {
		if(this.nombre.equals(nombre) && this.contrasena.equals(contrasena))
			return true;
		return false;
	}
	public void concluirFecha() {
		temporada.concluirFecha();
	}
	private void actualizarDatosTemporada() {
		
	}
}
