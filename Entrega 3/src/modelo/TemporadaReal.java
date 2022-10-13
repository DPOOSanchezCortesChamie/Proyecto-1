package modelo;

import java.util.ArrayList;

public class TemporadaReal {
	private ArrayList<Fecha> fechas;
	private ArrayList<Equipo> equipos;
	
	public TemporadaReal() {
		fechas = new ArrayList<Fecha>();
		equipos = new ArrayList<Equipo>();
	}
	public void crearFechas(String partidos) {
		//TODO
	}
	public void crearEquipos(String nominas) {
		//TODO
	}
	public int getCantidadFechas() {
		return fechas.size();
	}
	
}
