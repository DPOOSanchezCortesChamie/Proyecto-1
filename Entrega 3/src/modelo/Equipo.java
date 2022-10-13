package modelo;
//HMMMM
import java.util.ArrayList;
import java.util.HashMap;

public class Equipo {
	private String nombre;
	private HashMap<Jugador> jugadores;
	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	public void agregarJugador(String nombre, int precio, String pos) {
		Jugador nuevoJugador;
		if (pos == "delantero")
			nuevoJugador = new Delantero(nombre, precio);
		else if (pos == "mediocampista")
			nuevoJugador = new Mediocampista(nombre, precio);
		else if (pos == "defensor")
			nuevoJugador = new Defensa(nombre, precio);
		else if (pos == "arquero")
			nuevoJugador = new Arquero(nombre, precio);
		try {
			jugadores.put(nombre, nuevoJugador);
		} catch (Exception e) {
			System.out.println("Jugador " + nombre + " no se añadió por posición inválida");
		}
	}
	public String getNombre() {
		return nombre;
	}
	public HashMap<Jugador> getJugadores() {
		return jugadores;
	}
	
}
