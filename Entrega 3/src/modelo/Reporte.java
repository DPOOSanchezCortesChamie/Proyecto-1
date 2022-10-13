package modelo;

public class Reporte {
	private int minutosJugados;
	private int golesAnotados;
	private int penaltisAnotados;
	private int autogoles;
	private int asistencias;
	private int penaltisErrados;
	private int tarjetasAmarillas;
	private int tarjetasRojas;
	private int golesRecibidos;
	private int penaltisDetenidos;
	private Jugador jugador;
	
	
	
	public int getMinutosJugados() {
		return minutosJugados;
	}
	public void setMinutosJugados(int minutosJugados) {
		this.minutosJugados = minutosJugados;
	}
	public int getGolesAnotados() {
		return golesAnotados;
	}
	public void setGolesAnotados(int golesAnotados) {
		this.golesAnotados = golesAnotados;
	}
	public int getPenaltisAnotados() {
		return penaltisAnotados;
	}
	public void setPenaltisAnotados(int penaltisAnotados) {
		this.penaltisAnotados = penaltisAnotados;
	}
	public int getAutogoles() {
		return autogoles;
	}
	public void setAutogoles(int autogoles) {
		this.autogoles = autogoles;
	}
	public int getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	public int getPenaltisErrados() {
		return penaltisErrados;
	}
	public void setPenaltisErrados(int penaltisErrados) {
		this.penaltisErrados = penaltisErrados;
	}
	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}
	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	public int getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public int getPenaltisDetenidos() {
		return penaltisDetenidos;
	}
	public void setPenaltisDetenidos(int penaltisDetenidos) {
		this.penaltisDetenidos = penaltisDetenidos;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public Reporte(int minutosJugados, int golesAnotados, int penaltisAnotados, int autogoles, int asistencias,
			int penaltisErrados, int tarjetasAmarillas, int tarjetasRojas, int golesRecibidos, int penaltisDetenidos,
			Jugador jugador) {

		this.minutosJugados = minutosJugados;
		this.golesAnotados = golesAnotados;
		this.penaltisAnotados = penaltisAnotados;
		this.autogoles = autogoles;
		this.asistencias = asistencias;
		this.penaltisErrados = penaltisErrados;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
		this.golesRecibidos = golesRecibidos;
		this.penaltisDetenidos = penaltisDetenidos;
		this.jugador = jugador;
	}
	//TODO
	public int calcularPuntos() {
		return 0;
	}
	
}
