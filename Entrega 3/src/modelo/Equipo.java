package modelo;

import java.util.ArrayList ;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;
	public Equipo(String nombre,ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
	}
	public void agregarJugador(String jugador, int precio, String pos) {
		
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	
}
