package modelo;

import java.util.HashMap;
import java.util.ArrayList;

public class Fecha {
	
	private int num;
	private ArrayList<Partido> partidos;
	private ArrayList<Alineacion> alineaciones;
	
	public Fecha(int num) {
		this.num = num;
		alineaciones = new ArrayList<Alineacion>();
	}
	
	public int getNumFecha() {
		return this.num;
	}
	
	public void crearPartido(String dia, String hora) {
		Partido partido = new Partido(dia, hora);
		partidos.add(partido);
	}
	public void hacerReportePartido(String resultados){
		//TODO La primera linea del archivo tiene el nombre de los equipos?
		String nombreLocal = null;
		String nombreVisitante = null;
		//TODO buscar partido
		Partido partido = null;
		ArrayList<Reporte> reportes = partido.reportarPartido(resultados);
		actualizarPuntajes(reportes);
	}
	private void actualizarPuntajes(ArrayList<Reporte> reportes) {
		//TODO
	}
}
