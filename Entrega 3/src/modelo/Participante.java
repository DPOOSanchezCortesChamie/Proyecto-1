package modelo;

import java.util.HashMap;
import java.util.ArrayList;

public class Participante {
	private String nombre;
	private String contrasena;
	private HashMap<String,EquipoFantasia> equipos;

	public Participante(String nombre, String contrasena) {
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.equipos = new HashMap<String,EquipoFantasia>();
	}

	public void crearEquipo(String nombre, TemporadaFantasia temporada, ArrayList<Jugador> jugadores) {
		EquipoFantasia equipo = new EquipoFantasia(nombre, temporada, jugadores);
		this.equipos.put(nombre,equipo);
		temporada.asociarEquipo(equipo);
	}
	
	public void venderComprarJugadores(String equipo, Jugador saliente, Jugador entrante) {
		equipos.get(equipo).agregarJugador(entrante);
		equipos.get(equipo).eliminarJugador(saliente);
	}
	
	public boolean isUser(String nombre,String contrasena) {
		if(this.nombre.equals(nombre) && this.contrasena.equals(contrasena))
			return true;
		return false;
	}
	
	public HashMap<String,Jugador> BuscarJugadorPorEquipo(String nombreEquipo) {
		TemporadaReal temporada = new TemporadaReal();
		HashMap<String, Equipo> equipos = temporada.getEquipos();
		Equipo equipo = equipos.get(nombreEquipo);
		HashMap<String,Jugador> jugadores = equipo.getJugadores();
		
		return jugadores;

	}

}
