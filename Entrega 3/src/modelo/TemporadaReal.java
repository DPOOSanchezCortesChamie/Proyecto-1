package modelo;

import persistencia.Archivo;
import java.util.ArrayList;
import java.util.HashMap;

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
		Archivo archivo = new Archivo();
		HashMap<String,ArrayList<String[]>> equipos = archivo.cargarArchivo(nominas);
		for(String nombre: equipos.keySet()) {
			Equipo nuevoEquipo = new Equipo(nombre);
			for(String[] jugador: equipos.get(nombre)) {
				nuevoEquipo.agregarJugador(jugador[0], Integer.parseInt(jugador[1]), jugador[2]);
			}
			this.equipos.add(nuevoEquipo);
		}
	}
	public int getCantidadFechas() {
		return fechas.size();
	}
	
}
