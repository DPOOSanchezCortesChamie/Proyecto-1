package modelo;
//HMMMM
public class Defensa extends Jugador {
	
	public Defensa(String nombre, int precio) {
		super(nombre, precio);
	}
	@Override
	public int calcularPuntos(int fecha) {
		Reporte reporte = reportes.get(fecha);
		return reporte.calcularPuntosDefensa();
	}
	@Override
	public String darTipo() {
		return "Defensa";
	}
}