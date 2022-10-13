package modelo;

public class Participante extends Usuario {
	
	private EquipoFantasia equipo;
	//TODO debatir

	public Participante(String nombre, String contrasena) {
		super(nombre, contrasena);
	}
	
	public crearEquipo(String nombre) {
		this.equipo = new EquipoFantasia()
	}

}
