package vomistr;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Vomistr {
	

	//CONSTANTES
	private final static int OPCION_MENU_CREAR_TICKET = 1;
	private final static int OPCION_MENU_VER_TICKET = 2;
	private final static int OPCION_MENU_SALIR = 3;
	
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente ();
		Ticket ticket = new Ticket();
		Especialista especialista = new Especialista();
		Producto producto = new Producto();
		
	int opcionSeleccionada;
		do {
			opcionSeleccionada = menu();
			switch (opcionSeleccionada){
				case OPCION_MENU_CREAR_TICKET:
					crearTicket();
					break;
				case OPCION_MENU_VER_TICKET:
					verTicket();
					break;
					
			}
		}while (opcionSeleccionada != OPCION_MENU_SALIR);
		
	}

	private static void crearTicket() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese Numero Ticket");
		int numeroTicket = scanner.nextInt();
		
		System.out.println("Ingrese descripcionProblema");
		String descripcionProblema = scanner.nextLine();
		
		System.out.println("Ingrese estado");
		String estado = scanner.nextLine();
		
				
	}

	private static void verTicket() {
	
	
	}


	


	private static int menu() {
		System.out.println("**************************\nMenu Atencion al Cliente \n**************************\n");
		System.out.println("[1.] Crear Ticket");
		System.out.println("[2.] Ver Ticket");
		System.out.println("[3.] Salir");
		System.out.println("Por favor Seleccione una Opcion");
		Scanner scanner = new Scanner(System.in);
		int opcionSeleccionada = scanner.nextInt();
		
		return opcionSeleccionada;
	}


}
