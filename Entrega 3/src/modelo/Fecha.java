package modelo;

import java.util.HashMap;
import java.util.ArrayList;

public class Fecha {
	
	private int num;
	private HashMap<HashMap<Partido>> partidos;
	private ArrayList<Alineacion> alineaciones;
	
	public Fecha(int num) {
		this.num = num;
	}
	
	public int getNumFecha() {
		return this.num;
	}
	
	public void crearPartido(String dia, String hora) {
		Partido partido = new Partido(dia, hora);
		partidos.add(partido);
	}
	public void hacerReportePartido(File resultados){
		//TODO La primera linea del archivo tiene el nombre de los equipos?
		String nombreLocal;
		String nombreVisitante;
		Partido partido = partidos.get(nombreLocal).get(nombreVisitante);
		ArrayList<Reporte> reportes = partido.reportarPartido(resultados);
		actualizarPuntajes(reportes);
	}
	private void actualizarPuntajes(ArrayList<Reportes>) {
		//TODO
	}
}
