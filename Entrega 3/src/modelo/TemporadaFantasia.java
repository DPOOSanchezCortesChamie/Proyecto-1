package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class TemporadaFantasia {
	private int presupuesto;
	private TemporadaReal temporada;
	private Fecha fechaActual;
	private ArrayList<EquipoFantasia> equipos;
	private String nombre;
	
	public TemporadaFantasia(int presupuesto, String nombre) {
		this.presupuesto=presupuesto;
		this.nombre=nombre;
		this.equipos = new ArrayList<EquipoFantasia>();
	}
	
	public void asociarEquipo(EquipoFantasia e) {
		equipos.add(e);
	}
	
	public int getPresupuesto() {
		return this.presupuesto;
	}
	public void crearTemporadaReal(String nominas, String partidos) {
		temporada = new	TemporadaReal();
		temporada.crearEquipos(nominas);
		temporada.crearFechas(partidos);
	}
	public void hacerReportePartido(String resultado) {
		fechaActual.hacerReportePartido(resultado);
	}
	public HashMap<String, Equipo> getEquiposReales() {
		return temporada.getEquipos();
	}
	
	public void actualizarDatos() {
		
	}
}
