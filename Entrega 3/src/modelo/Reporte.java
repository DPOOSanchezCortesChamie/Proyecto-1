package modelo;
//HMMMM
public class Reporte {
	private int minutosJugados;
	private int golesAnotados;
	private int penaltisAnotados;
	private int autogoles;
	private int asistencias;
	private int penaltisErrados;
	private int tarjetasAmarillas;
	private int tarjetasRojas;
	private int golesRecibidos;
	private int penaltisDetenidos;
	private Jugador jugador;
	
	public Reporte(int minutosJugados, int golesAnotados, int penaltisAnotados, int autogoles, int asistencias,
			int penaltisErrados, int tarjetasAmarillas, int tarjetasRojas, int golesRecibidos, int penaltisDetenidos,
			Jugador jugador) {

		this.minutosJugados = minutosJugados;
		this.golesAnotados = golesAnotados;
		this.penaltisAnotados = penaltisAnotados;
		this.autogoles = autogoles;
		this.asistencias = asistencias;
		this.penaltisErrados = penaltisErrados;
		this.tarjetasAmarillas = tarjetasAmarillas;
		this.tarjetasRojas = tarjetasRojas;
		this.golesRecibidos = golesRecibidos;
		this.penaltisDetenidos = penaltisDetenidos;
		this.jugador = jugador;
	}
	
	public int calcularPuntosArquero() {
		int puntos = (golesAnotados+penaltisAnotados)*6+(asistencias*3)+(penaltisErrados*-2)+
				(tarjetasAmarillas*-1)+(tarjetasRojas*-3)+(autogoles*-2);
		if (minutosJugados >= 60)
			puntos+=2;
		else if (minutosJugador != 0)
			puntos+=1;	
		if (golesRecibidos == 0)
			puntos +=4;
		if (penaltisDetenidos > 0)
			puntos +=5;
		return puntos;
	}
	public int calcularPuntosDefensa() {
		int puntos = (golesAnotados+penaltisAnotados)*6+(asistencias*3)+(penaltisErrados*-2)+
			(tarjetasAmarillas*-1)+(tarjetasRojas*-3)+(autogoles*-2);
		if (minutosJugados >= 60)
			puntos+=2;
		else if (minutosJugador != 0)
			puntos+=1;	
		if (golesRecibidos == 0)
			puntos +=4;
		return puntos;
	}
	public int calcularPuntosDelantero() {
		int puntos = (golesAnotados+penaltisAnotados)*4+(asistencias*3)+
		(penaltisErrados*-2)+(tarjetasAmarillas*-1)+(tarjetasRojas*-3)+(autogoles*-2);
		if (minutosJugados >= 60) 
			puntos+=2;
		else if (minutosJugador != 0)
			puntos+=1;
		return puntos;
	}
	public int calcularPuntosMediocampista() {
		int puntos = (golesAnotados+penaltisAnotados)*5+(asistencias*3)+
		(penaltisErrados*-2)+(tarjetasAmarillas*-1)+(tarjetasRojas*-3)+(autogoles*-2);
		if (minutosJugados >= 60) 
			puntos+=2;
		else if (minutosJugador != 0)
			puntos+=1;
		return puntos;
	}
}
