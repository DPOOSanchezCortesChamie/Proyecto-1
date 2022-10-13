package modelo;

import modelo.EquipoFantasia;

public class Partido {
	
	private String dia;
	private String hora;
	private int golesLocal;
	private int golesVisitante;
	private int duracion;
	private EquipoFantasia equipoLocal;
	private EquipoFantasia equipoVisitante;
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public Partido(String dia, String hora, int golesLocal, int golesVisitante, int duracion) {

		this.dia = dia;
		this.hora = hora;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.duracion = duracion;
	}
	
	

}
