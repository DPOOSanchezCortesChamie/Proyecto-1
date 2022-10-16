package modelo;

import java.util.ArrayList;

public class Alineacion {
	
	private ArrayList<Jugador> jugadores;
	private Jugador capitan;
	private int puntos;
	private Fecha fecha;
	//TODO como hacer llegar esta info
	
	public Alineacion() {
		this.jugadores = new ArrayList<Jugador>();
		actualizarPuntos();
	}
	
	public Jugador getCapitan() {
		return this.capitan;
	}

	public void setCapitan(Jugador jugador) {
		this.capitan = jugador;
	}
	
	public void quitarJugador(Jugador jugador) {
		this.jugadores.remove(jugador);
	}
	
	public void meterJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	public ArrayList<Jugador> getJugadores(){
		return this.jugadores;
	}
	
	public void actualizarPuntos() {
		int total = 0;
		for(Jugador jugador: jugadores) {
			total += jugador.calcularPuntos(fecha.getNumFecha());
		}
		puntos = total;
	}
}
