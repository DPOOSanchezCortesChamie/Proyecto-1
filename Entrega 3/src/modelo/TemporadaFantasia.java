package modelo;

import java.util.ArrayList;

public class TemporadaFantasia {
	private int presupuesto;
	private TemporadaReal temporada;
	private Fecha fechaActual;
	private ArrayList<Participante> participantes;
	
	public TemporadaFantasia(int presupuesto) {
		this.presupuesto=presupuesto;
		this.participantes = new ArrayList<Participante>();
	}
	
	public void crearTemporadaReal(String nominas, String partidos) {
		temporada = new	TemporadaReal();
		temporada.crearFechas(partidos);
		temporada.crearEquipos(nominas);
	}
	
	public void hacerReportePartido(String resultado) {
		fechaActual.hacerReportePartido(resultado);
	}
	
}
