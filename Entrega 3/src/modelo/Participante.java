package modelo;

import java.util.HashMap;

public class Participante extends Usuario {
	
	private EquipoFantasia equipo;
	//TODO debatir

	public Participante(String nombre, String contrasena) {
		super(nombre, contrasena);
	}
	//TODO hacer llegar presupuesto
	public void crearEquipo(String nombre) {
		this.equipo = new EquipoFantasia(nombre, 3);
	}
	
	public HashMap<String,Jugador> BuscarJugadorPorEquipo(String nombreEquipo) {
		TemporadaReal temporada = new TemporadaReal();
		HashMap<String, Equipo> equipos = temporada.getEquipos();
		Equipo equipo = equipos.get(nombreEquipo);
		HashMap<String,Jugador> jugadores = equipo.getJugadores();
		
		return jugadores;

	}

}
