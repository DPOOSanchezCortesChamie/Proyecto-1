package modelo;

import java.util.HashMap;

public class Alineacion {
	
	private HashMap<Jugador> jugadores;
	private Jugador capitan;
	private int puntos;
	private Fecha fecha;
	//TODO como hacer llegar esta info
	
	public Alineacion() {
		this.jugadores = new HashMap<String, Jugador>();
		puntos = actualizarPuntos();
	}
	
	public Jugador getCapitan() {
		return this.capitan;
	}

	public void setCapitan(Jugador jugador) {
		this.capitan = jugador;
	}
	
	public void quitarJugador(Jugador jugador) {
		this.jugadores.remove(jugador.getNombre(), jugador);
	}
	
	public void meterJugador(Jugador jugador) {
		this.jugadores.put(jugador.getNombre(), jugador);
	}
	
	public void actualizarPuntos() {
		int total = 0;
		for(String nombre: jugadores) {
			total += jugadores.get(nombre).calcularPuntos(fecha.getNumFecha());
		}
		return total;
	}
}
