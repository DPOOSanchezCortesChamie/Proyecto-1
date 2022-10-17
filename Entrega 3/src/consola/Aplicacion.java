package consola;

import modelo.TemporadaFantasia;
import modelo.Admin;
import modelo.Equipo;
import modelo.Participante;
import modelo.Jugador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Aplicacion {
	private ArrayList<Participante> usuarios;
	private ArrayList<Admin> admins;
	private HashMap<String,TemporadaFantasia> temporadas;
	private Admin adminActual;
	private Participante userActual;
	private Scanner sc;
	
	public Aplicacion() {
		usuarios = new ArrayList<Participante>();
		admins = new ArrayList<Admin>();
		temporadas = new HashMap<String,TemporadaFantasia>();
		sc = new Scanner(System.in);
	}
	
	private void adminCrearTemporada() {
		System.out.println("Ingrese el nombre del archivo con los equipos");
		String nominas = sc.next();
		System.out.println("Ingrese el nombre del archivo con los partidos");
		String fechas = sc.next();
		System.out.println("Ingrese el presupuesto para los equipos de fantasia");
		int p = sc.nextInt();
		System.out.println("Ingrese el nombre de su temporada");
		String nombre = sc.next();
		while(temporadas.get(nombre)!=null) {
			System.out.println("El nombre elegido no esta disponible");
			System.out.println("Ingrese el nombre de su temporada");
			nombre = sc.next();
		}
		temporadas.put(nombre,adminActual.crearTemporada(nominas,fechas,p,nombre));
	}
	
	private void adminReportarPartido() {
		System.out.println("Ingrese el nombre del archivo del partido");
		String reporte = sc.next();
		boolean sePudo = adminActual.registrarResultadoPartido(reporte);
		if (sePudo)
			System.out.println("Partido registrado exitosamente");
		else
			System.out.println("El partido ingresado no se encuentra en la fecha");
	}
	private void adminConcluirFecha() {
		adminActual.concluirFecha();
	}
	private void adminMostrarInfoTemporada() {
		System.out.println("Numero de fecha: " + adminActual.getNumFecha());
	}
	
	private void menuAdmin() {
		int ans = 999;
		while(ans != 0) {
			System.out.println("Menu de opciones ADMINISTRADOR");
			System.out.println("1. Crear nueva temporada");
			System.out.println("2. Reportar resultado de un partido");
			System.out.println("3. Pasar a la siguiente fecha");
			System.out.println("4. Mostrar informacion temporada");
			System.out.println("0. Cerrar sesion");
			System.out.println("Seleccione una opcion: ");
			ans = sc.nextInt();
			if (ans == 1)
				adminCrearTemporada();
			else if (ans == 2)
				adminReportarPartido();
			else if(ans == 3)
				adminConcluirFecha();
			else if (ans == 4)
				adminMostrarInfoTemporada();
			else if (ans == 0) {
				this.adminActual = null;
		}
		}
	}
	
	private void userCrearEquipoFantasia() {
		System.out.println("Ingrese el nombre de su equipo: ");
		String nombre = sc.next();
		TemporadaFantasia temporada = null;
		while (temporada == null) {
			System.out.println("Ingrese el nombre de la temporada de fantasia al que va a pertenecer: ");
			String n = sc.next();
			temporada = temporadas.get(n);
		}
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		System.out.println("Escoja los 15 jugadores de su equipo de fantasia");
		System.out.println("Luego podra venderlos (al 97% del valor de compra) y comprar otros");
		System.out.println("Debe elegir 2 arqueros, 5 defensas, 5 mediocampistas y 3 delanteros");
		double monto = temporada.getPresupuesto();
		int cPos[] = {0,0,0,0};
		HashMap<String, Equipo> equipos = temporada.getEquiposReales();
		for(int i = 0; i<15; i++) {
			System.out.println("Su presupuesto restante es " + monto);
			Jugador j = buscarJugador(equipos, jugadores, monto, cPos);
			monto -= j.getPrecio();
			if(j.darTipo().equals("Arquero"))
				cPos[0]++;
			else if (j.darTipo().equals("Defensa"))
				cPos[1]++;
			else if (j.darTipo().equals("Mediocampista"))
				cPos[2]++;
			else
				cPos[3]++;
			jugadores.add(j);
		}
		this.userActual.crearEquipo(nombre, temporada, jugadores);
		System.out.println("Equipo creado exitosamente!");
	}
	
	private Jugador buscarJugador(HashMap<String,Equipo> equipos, 
			ArrayList<Jugador> listaJugadores, double monto, int cPos[]) {
		Jugador j = null;
		Equipo e = null;
		String equiposString = "";
		for(String eq: equipos.keySet()) {
			equiposString += eq + ", ";
		}
		equiposString = equiposString.substring(0,equiposString.length()-2);
		while(j==null) {
			while(e == null) {
				System.out.println("Los equipos disponibles son: " + equiposString);
				System.out.println("Escriba el nombre de un equipo para ver sus jugadores: ");
				String eName = sc.next();
				e = equipos.get(eName);
			}
			HashMap<String, Jugador> jugadores = e.getJugadores();
			System.out.println("Los jugadores de " + e.getNombre()+ " son: ");
			for(String jugador: jugadores.keySet()) {
				String temp = jugadores.get(jugador).print();
				System.out.println(temp);
			}
			System.out.println("Escriba el nombre del jugador que desea incluir en su equipo");
			System.out.println("Si desea volver a ver los equipos digite '0'");
			String jName = sc.nextLine();
			if(jName.equals("0"))
				e = null;
			else {
				j = jugadores.get(jName);
				boolean t = true;
				if(j != null) {
					if(monto<j.getPrecio())
						t=false;
					if(!t) {
						System.out.println("No te alcanza el presupuesto para comprar este jugador");
						j = null;
						breath();
					} else {
						if(j.darTipo().equals("Arquero") && cPos[0]==2)
							t=false;
						else if (j.darTipo().equals("Defensa") && cPos[1]==5)
							t=false;
						else if (j.darTipo().equals("Mediocampista") && cPos[2]==5)
							t=false;
						else if (cPos[3]==3)
							t=false;
						if(!t) {
							System.out.println("No puedes tener mas jugadores de esa posicion");
							breath();
							j = null;
						} else {
							if(listaJugadores.contains(j))
								t = false;
							if(!t) {
								System.out.println("El jugador elegido ya se encuentra en el equipo");
								j = null;
							}
						}
					}
				} 
			}
		}
		return j;
	}
	
	private void breath() {
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			}
	}
	
	public void menuUser() {
		int ans = 999;
		while(ans != 0) {
			System.out.println("Menu de opciones JUGADOR");
			System.out.println("1. Crear un equipo de fantasia");
			System.out.println("2. Administrar equipo de fantasia");
			System.out.println("0. Cerrar sesion");
			System.out.println("Seleccione una opcion: ");
			ans = sc.nextInt();
			if (ans==1) 
				userCrearEquipoFantasia();
			else if (ans==0)
				this.userActual = null;
		}
	}
	
	private void iniciarSesion() {
		System.out.println("Ingrese nombre de usuario: ");
		String user = sc.next();
		System.out.println("Ingrese su contraseña: ");
		String pswrd = sc.next();
		for(Admin a: admins) {
			if(a.isUser(user, pswrd)) {
				adminActual = a;
				menuAdmin();
			}
		}
		if(adminActual == null) {
			for(Participante a: usuarios) {
				if(a.isUser(user, pswrd))
					userActual = a;
					menuUser();
			}
		}
	}
	private void crearUsuario() {
		System.out.println("Ingrese nombre de usuario: ");
		String user = sc.next();
		System.out.println("Ingrese su contraseña: ");
		String pswrd = sc.next();
		System.out.println("Ingrese su tipo de usuario (jugador o administrador): ");
		String tipo = sc.next();
		if(tipo.equals("administrador")) {
			boolean esta = false;
			for(Admin a: admins) {
				if(a.isUser(user, pswrd)) {
					esta = true;
				}
			}
			if(!esta)
				admins.add(new Admin(user,pswrd));
			else
				System.out.println("Ya existe un administrador con este nombre y contraseña");
		}
		if(tipo.equals("jugador")) {
			boolean esta = false;
			for(Participante a: usuarios) {
				if(a.isUser(user, pswrd)) {
					esta = true;
				}
			}
			if(!esta)
				usuarios.add(new Participante(user,pswrd));
			else
				System.out.println("Ya existe un jugador con este nombre y contraseña");
		}
	}
	public void menuGeneral() {
		int ans = 999;
		while(ans!=0) {
			System.out.println("Bienvenido a futbol de fantasia");
			System.out.println("1. Iniciar sesion");
			System.out.println("2. Crear usuario");
			System.out.println("0. Finalizar programa");
			ans = sc.nextInt();
			if (ans == 1)
				iniciarSesion();
			else if (ans == 2)
				crearUsuario();
			else if (ans == 0)
				System.out.println("Gracias por usar la aplicacion");
		}
	}
	public static void main(String args[]) {
		Aplicacion app = new Aplicacion();
		app.menuGeneral();
		
	}
	//TODO estadisticas cuando ya tengamos mas
}
