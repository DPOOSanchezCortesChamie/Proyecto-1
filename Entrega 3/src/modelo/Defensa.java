package modelo;

public class Defensa extends Jugador{
	
	public Defensa(String nombre, int precio) {
		super(nombre, precio);
	}
	
	public void calcularPuntaje(Reporte reporte) {
		
		int autogoles = reporte.getAutogoles();
		int minutosJugados = reporte.getMinutosJugados();
		int golesAnotados = reporte.getGolesAnotados();
		int penaltisAnotados = reporte.getPenaltisAnotados();
		int asistencias = reporte.getAsistencias();
		int penaltisErrados = reporte.getPenaltisErrados();
		int tarjetasAmarillas = reporte.getTarjetasAmarillas();
		int tarjetasRojas = reporte.getTarjetasRojas();
		int golesRecibidos = reporte.getGolesRecibidos();
		int penaltisDetenidos = reporte.getPenaltisDetenidos();
		
		int puntaje =  getPuntaje() + ((golesAnotados+penaltisAnotados)*6)+(asistencias*3)+(penaltisErrados*-2)+(tarjetasAmarillas*-1)+(tarjetasRojas*-3)+(autogoles*-2)+(golesRecibidos*4);
		
		if (minutosJugados>=60) {
			puntaje+=2;
		}
		else {
			puntaje+=1;
		}
		
		setPuntaje(puntaje);
		
	}
}