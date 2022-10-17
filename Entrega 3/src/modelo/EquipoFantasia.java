package modelo;

import java.util.ArrayList;

public class EquipoFantasia {
	
	private String nombre;
	private double monto;
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
	
	public void comprarJugador(Jugador jugador) {
		jugadores.add(jugador);
		monto -= jugador.getPrecio();
	}
	public int getPuntos() {
		return this.puntos;
	}
	public void actualizarPuntos() {
		proxima.actualizarPuntos();
	}
	public void venderJugador(Jugador jugador) {
		jugadores.remove(jugador);
		double remuneracion = jugador.getPrecio()*0.97;
		monto += remuneracion;
	}
	public void concluirFecha() {
		alineaciones.add(proxima);
		this.puntos+=proxima.getPuntos();
	}
	public void designarAlienacion(ArrayList<Jugador> jugadores) {
		this.proxima = new Alineacion(jugadores, temporada.getFechaSiguiente());
	}
}
