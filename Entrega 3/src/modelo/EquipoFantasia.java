package modelo;

import java.util.ArrayList;

public class EquipoFantasia {
	
	private String nombre;
	private int monto;
	private int puntos;
	private TemporadaFantasia temporada;
	private ArrayList<Jugador> jugadores;
	private ArrayList<Alineacion> alineaciones;
	private Alineacion proxima;
	
	public EquipoFantasia(String nombre, TemporadaFantasia temporada, ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
		this.monto = temporada.getPresupuesto();
		this.temporada = temporada;
		this.puntos = 0;
		this.jugadores = new ArrayList<Jugador>();
		this.alineaciones = new ArrayList<Alineacion>();
	}
	//TODO falta todo :)
	
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	public void eliminarJugador(Jugador jugador) {
		jugadores.remove(jugador);
	}
}
