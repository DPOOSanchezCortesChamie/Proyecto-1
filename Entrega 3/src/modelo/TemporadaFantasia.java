package modelo;

public class TemporadaFantasia {
	private int presupuesto;
	private TemporadaReal temporada;
	private Fecha fechaActual;
	private ArrayList<Participante> participantes;
	
	public TemporadaFantasia(int presupuesto) {
		this.presupuesto=presupuesto;
	}
	
	public void crearTemporadaReal(File nominas, File partidos) {
		temporada = new	TemporadaReal();
		temporada.crearFechas(partidos);
		temporada.crearEquipos(nominas);
	}
	
	public void hacerReportePartido(File resultado) {
		fechaActual.hacerReportePartido(File resultado);
	}
	
}
