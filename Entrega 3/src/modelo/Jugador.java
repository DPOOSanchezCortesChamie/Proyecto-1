package modelo;


public class Jugador {
	private String nombre;
	private int precio;
	private int puntaje;
	private Reporte reporte;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public Jugador(String nombre, int precio) {
		this.nombre=nombre;
		this.precio=precio;
		this.puntaje = 0;
	}
}
