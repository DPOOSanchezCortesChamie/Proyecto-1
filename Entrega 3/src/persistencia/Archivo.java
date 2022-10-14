package persistencia;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Archivo {
	private String tipo;
	
	public Archivo() {
		
	}
	public HashMap<String,ArrayList<String[]>> cargarArchivo(String nombreArchivo) {
        HashMap<String,ArrayList<String[]>> datos = new HashMap<String,ArrayList<String[]>>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos/"+nombreArchivo));
            String linea = br.readLine();
	        String[] equipos = linea.split(";");
            for (String equipo: equipos) {
            	datos.put(equipo, new ArrayList<String[]>());
            }
            int c = 0;
            while ((linea = br.readLine()) != null) {
            	String infoJugadores[] = linea.split(";");
            	int cantidadJugadores = infoJugadores.length/3;
            	for(int i = 0; i<cantidadJugadores;i++) {
            		String jugador[] = {infoJugadores[i*3],infoJugadores[i*3+1],infoJugadores[i*3+2]};
            		datos.get(equipos[c]).add(jugador);
            	}
            	c++;
            }
            br.close();
            return datos;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return datos;
    }

}

