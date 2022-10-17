package modelo;

public class Admin {
	
	TemporadaFantasia temporada;
	private String nombre;
	private String contrasena;
	private int numFecha;
	
	public Admin(String nombre, String contrasena) {
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.numFecha = 0;
	}
	public int getNumFecha() {
		return this.numFecha;
	}
	public TemporadaFantasia crearTemporada(String nominas, String partidos, int presupuesto, String nombre) {
		temporada = new TemporadaFantasia(presupuesto, nombre);
		temporada.crearTemporadaReal(nominas, partidos);
		return temporada;
	}
	public boolean registrarResultadoPartido(String resultado) {
		boolean sePudo = temporada.hacerReportePartido(resultado);
		if (sePudo) {
		actualizarDatosTemporada();
		}
		return sePudo;
	}
	public boolean isUser(String nombre,String contrasena) {
		if(this.nombre.equals(nombre) && this.contrasena.equals(contrasena))
			return true;
		return false;
	}
	public void concluirFecha() {
		temporada.concluirFecha();
		this.numFecha++;
	}
	private void actualizarDatosTemporada() {
		temporada.actualizarDatos();
	}
}
