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
	
	public ArrayList<String> cargarArchivo1(String nombreArchivo) {
		ArrayList<String> datos = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("datos/"+nombreArchivo));
			String linea;
			while((linea=br.readLine())!=null) {
				datos.add(linea);
			}			
			br.close();
			return datos;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return datos;
	}
	
	public HashMap<Integer,ArrayList<String[]>> cargarFechas(){
		HashMap<Integer,ArrayList<String[]>> fechas = new HashMap<Integer,ArrayList<String[]>>();
		ArrayList<String> datos;
		ArrayList<String[]> infoFecha = new ArrayList<String[]>();

		datos = cargarArchivo1("fechas.csv");
		for (String dato: datos) {
			String valores[] = dato.split(";");
			infoFecha.add(valores);
			fechas.put(Integer.parseInt(valores[0]), infoFecha);
		}
		return fechas;
	}
	
	public HashMap<String,ArrayList<String>> cargarFechas1(String nombreArchivo){
		HashMap<String,ArrayList<String>> datos = new HashMap<String,ArrayList<String>>();
		ArrayList<String> infoFecha = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("datos/"+nombreArchivo));
			String linea = br.readLine();
			while(linea!= null) {
				String infoFechas[] = linea.split(";");
				String numeroFecha = infoFechas[0];
				String equipo1 = infoFechas[1];
				String equipo2 = infoFechas[2];
				String dia = infoFechas[3];
				String hora = infoFechas[4];
				infoFecha.add(equipo1);
				infoFecha.add(equipo2);
				infoFecha.add(dia);
				infoFecha.add(hora);
				datos.put(numeroFecha, infoFecha);
				
			}
			
			br.close();
			return datos;
		}catch (Exception e) {
            // TODO: handle exception
        }
		return datos;
	}
	
}




