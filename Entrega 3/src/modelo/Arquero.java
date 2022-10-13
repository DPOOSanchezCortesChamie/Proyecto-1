package modelo;
//HMMMM
public class Arquero extends Jugador {
	public Arquero(String nombre, int precio) {
		super(nombre, precio);
	}
	@Override
	public int calcularPuntos(int fecha) {
		Reporte reporte = reportes.get(fecha);
		return reporte.calcularPuntosArquero();
	}
	@Override
	public String darTipo() {
		return "Arquero";
	}
}
