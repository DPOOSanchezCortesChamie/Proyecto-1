package modelo;

import modelo.EquipoFantasia;
import java.util.HashMap;
import java.util.ArrayList;

public class Partido {
	
	private String dia;
	private String hora;
	private int golesLocal;
	private int golesVisitante;
	private int duracion;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private ArrayList<Reporte> reportes;
		
	public Partido(String dia, String hora) {
		this.dia = dia;
		this.hora = hora;
	}
	
	//TODO
	public ArrayList<Reporte> reportarPartido(String resultados) {
		return null;
	}
	
	private HashMap<String,Jugador> getLocales(){
		return equipoLocal.getJugadores();
	}
	private HashMap<String,Jugador> getVisitantes(){
		return equipoVisitante.getJugadores();
	}
	public String getNombreLocal() {
		return equipoLocal.getNombre();
	}
	public String getNombreVisitante() {
		return equipoVisitante.getNombre();
	}
}
