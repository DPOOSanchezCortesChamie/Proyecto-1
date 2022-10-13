package modelo;
//HMMMM
public class Delantero extends Jugador {
	
	public Delantero(String nombre, int precio) {
		super(nombre, precio);
	}
	@Override
	public int calcularPuntos(int fecha) {
		Reporte reporte = reportes.get(fecha);
		return reporte.calcularPuntosDelantero();
	}
	@Override
	public String darTipo() {
		return "Delantero";
	}
}
