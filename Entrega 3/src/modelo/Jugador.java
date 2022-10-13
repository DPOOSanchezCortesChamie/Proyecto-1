package modelo;
//HMMMM
import java.util.ArrayList;

public abstract class Jugador {
	private String nombre;
	private int precio;
	protected ArrayList<Reporte> reportes;
	
	public Jugador(String nombre, int precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}
	
	public void asociarReporte(Reporte reporte) {
		reportes.add(reporte);
	}

	public abstract int calcularPuntos(int fecha);
	
	public abstract String darTipo();
}
