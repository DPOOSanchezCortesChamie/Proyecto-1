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
	public ArrayList<Reporte> reportarPartido(File resultados) {
		
	}
	
	private HashMap<Jugador> getLocales(){
		return equipoLocal.getJugadores();
	}
	private HashMap<Jugador> getVisitantes(){
		return equipoVisitante.getJugadores();
	}
	

}
