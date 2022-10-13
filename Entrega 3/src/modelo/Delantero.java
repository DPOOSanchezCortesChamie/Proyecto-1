package modelo;

public class Delantero extends Jugador{
	
	public Delantero(String nombre, int precio, int puntaje) {
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
		
		int puntaje =  getPuntaje() + ((golesAnotados+penaltisAnotados)*4)+(asistencias*3)+(penaltisErrados*-2)+(tarjetasAmarillas*-1)+(tarjetasRojas*-3)+(autogoles*-2);
		
		if (minutosJugados>=60) {
			puntaje+=2;
		}
		else {
			puntaje+=1;
		}
		
		setPuntaje(puntaje);
		
	}
}
