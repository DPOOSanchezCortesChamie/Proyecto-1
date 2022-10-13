package modelo;
//HMMMM
public class Mediocampista extends Jugador {
	
	public Mediocampista(String nombre, int precio) {
		super(nombre, precio);
	}
	@Override
	public int calcularPuntos(int fecha) {
		Reporte reporte = reportes.get(fecha);
		return reporte.calcularPuntosMediocampista();
	}
	@Override
	public String darTipo() {
		return "Mediocampista";
	}
}
