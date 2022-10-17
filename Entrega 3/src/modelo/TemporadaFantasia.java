package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import persistencia.CompararEquipos;

public class TemporadaFantasia {
	private double presupuesto;
	private TemporadaReal temporada;
	private Fecha fechaSiguiente;
	private Fecha fechaActual;
	private ArrayList<EquipoFantasia> equipos;
	private String nombre;
	
	public TemporadaFantasia(int presupuesto, String nombre) {
		this.presupuesto=presupuesto;
		this.nombre=nombre;
		this.equipos = new ArrayList<EquipoFantasia>();
	}
	
	public void asociarEquipo(EquipoFantasia e) {
		equipos.add(e);
	}
	
	public double getPresupuesto() {
		return this.presupuesto;
	}
	public void crearTemporadaReal(String nominas, String partidos) {
		this.temporada = new TemporadaReal();
		this.temporada.crearEquipos(nominas);
		this.fechaSiguiente = temporada.crearFechas(partidos);
	}
	public void hacerReportePartido(String resultado) {
		fechaActual.hacerReportePartido(resultado);
	}
	public HashMap<String, Equipo> getEquiposReales() {
		return temporada.getEquipos();
	}
	
	public Fecha getFechaSiguiente(){
		return this.fechaSiguiente;
	}
	
	public void concluirFecha() {
		this.fechaActual = this.fechaSiguiente;
		this.fechaSiguiente = this.temporada.concluirFecha(this.fechaActual);
		for(EquipoFantasia e: equipos) {
			e.concluirFecha();
		}
	}
	public List<EquipoFantasia> MejoresTresEquipos(){
		ArrayList<EquipoFantasia> equipos = this.equipos;
		Collections.sort(equipos, new CompararEquipos());
		List<EquipoFantasia> mejores3 = equipos.subList(0,3);
		return mejores3;
	}
	
	public void actualizarDatos() {
		
	}
}
