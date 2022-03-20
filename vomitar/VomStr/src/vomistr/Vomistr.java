package vomistr;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Vomistr {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Ejecutivo> ejecutivos = new ArrayList<Ejecutivo>();
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	private static ArrayList<Ticket> tickets = new ArrayList<Ticket>(); //generar un numero y cambiar en clase a long por el largo

	//CONSTANTES
	private final static int OPCION_MENU_CREAR_TICKET = 1;
	private final static int OPCION_MENU_VER_TICKET = 2;
	private final static int OPCION_MENU_SALIR = 3;
	LocalDateTime fechaHora = LocalDateTime.now();
	static DateTimeFormatter FECHA_FORMATEADA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
	
	
	public static void main(String[] args) {
		inicializarObjetos();			
		Scanner leer = new Scanner (System.in);
		
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
		System.out.printf("Selecciono la opcion  : %d ", opcionSeleccionada);
		
	}
	public static void inicializarObjetos() {
		
		//Inicializados 2 objetos de ejecutivo
		int id=1;
		String rutEjecutivo="12345678-9";
		String nombreEjecutivo = "Diego Perez";
		char tipoEjecutivo = '1';
		Ejecutivo ejecutivoAtencion = new Ejecutivo(id,rutEjecutivo,nombreEjecutivo,tipoEjecutivo);
		ejecutivos.add(ejecutivoAtencion);
		
		int id2=2;
		String rutEjecutivo2="98765432-1";
		String nombreEjecutivo2 = "Paola Lagos";
		char tipoEjecutivo2 = '2';
		Ejecutivo ejecutivoSoporte = new Ejecutivo(id2,rutEjecutivo2,nombreEjecutivo2,tipoEjecutivo2);
		ejecutivos.add(ejecutivoSoporte);
		
		//Inicializar Cliente
		String idCliente = "1";
		String rut = "12890890-9";
		String nombre = "Cristian Coloma";
		String telefono = "998898989";
		String email = "cristian@cristian.com";
		Cliente cliente = new Cliente (idCliente,rut,nombre,telefono,email);
		clientes.add(cliente);
		
		String idCliente2 = "2";
		String rut2 = "13456789-0";
		String nombre2 = "Andres Vargas";
		String telefono2 = "900089892";
		String email2 = "andres@andres.cl";
		Cliente cliente2 = new Cliente (idCliente2,rut2,nombre2,telefono2,email2);
		clientes.add(cliente2);
		
		//inicializar Productos
		String codigoProducto = "300";
		String nombreProducto = "Fibra 300";
		Producto producto = new Producto(codigoProducto,nombreProducto);
		productos.add(producto);
		String codigoProducto1 = "600";
		String nombreProducto1 = "Fibra 600";
		Producto producto1 = new Producto(codigoProducto1,nombreProducto1);
		productos.add(producto1);
		
	}
	
	private static void crearTicket() {
		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese Numero Ticket");
		int numeroTicket = leer.nextInt();
		leer.nextLine();
		LocalDateTime fechaHora = LocalDateTime.now();
		
	
		System.out.println("Ingrese Rut Cliente");
		String rut= leer.nextLine();
		Cliente rutDelCliente = null;
		for(Cliente clienteA: clientes  ) {
			if (rut.equalsIgnoreCase(clienteA.getRut()) ) {
				rutDelCliente = clienteA;
			}
		}
		System.out.println("Ingrese Codigo Producto afectado");
		String codigoProducto= leer.nextLine();
		Producto codigoDelProducto = null;
		for(Producto producto: productos) {
			if (codigoProducto == producto.getCodigoProducto()) {
				codigoDelProducto = producto;
			}
		}
	
		System.out.println("Ingrese Nombre Producto afectado");
		String nombreProducto= leer.nextLine();
		
		System.out.println("Ingrese Rut Ejecutivo Atencion");
		String rutEjecutivo= leer.nextLine();
		Ejecutivo rutDelEjecutivo = null;
		for(Ejecutivo ejecutivoA: ejecutivos) {
			if (rutEjecutivo.equalsIgnoreCase(ejecutivoA.getRutEjecutivo())) {
				rutDelEjecutivo = ejecutivoA;
			}
		}
		System.out.println("Ingrese Rut Ejecutivo Soporte");
		String rutEjecutivo2= leer.nextLine();
		Ejecutivo rutDelEjecutivo2 = null;
		for(Ejecutivo ejecutivoB: ejecutivos) {
			if (rutEjecutivo2.equalsIgnoreCase(ejecutivoB.getRutEjecutivo())) {
				rutDelEjecutivo2 = ejecutivoB;
			}
		}
			
		System.out.println("Ingrese descripcion de Problema");
		String descripcionProblema = leer.nextLine();

		System.out.println("Ingrese Solucion para el Problema");
		String solucionProblema = leer.nextLine();
					
		System.out.println("Ingrese estado");
		String estado = leer.nextLine();
		
		Ticket ticketNuevo = new Ticket(numeroTicket, fechaHora, rutDelCliente,  codigoDelProducto,  rutDelEjecutivo , rutDelEjecutivo2, descripcionProblema,  solucionProblema,  estado);
		tickets.add(ticketNuevo);
		
	}

	private static void verTicket() {
		System.out.println("\nTicket\n====================\n");

		for(Ticket ticket : tickets) {
			System.out.print("Numero Ticket: " + ticket.getNumeroTicket() + "\nFecha: " + FECHA_FORMATEADA.format(ticket.getFechaHora()) +  "\nDescripcion: " + ticket.getDescripcionProblema()
			+ "\nEstado: " + ticket.getEstado() +  "\nSolucion: " + ticket.getSolucionProblema() + "\nAtencion :" + ticket.getEjecutivoAtencion().getNombreEjecutivo()+ "\nSoporte :" + ticket.getEjecutivoSoporte().getNombreEjecutivo());
		}
	
	}

	private static int menu() {
		System.out.println("\nMenu Atencion al Cliente \n**************************\n");
		System.out.println("[1.] Crear Ticket");
		System.out.println("[2.] Ver Ticket");
		System.out.println("[3.] Salir");
		System.out.println("\nPor favor Seleccione una Opcion");
		Scanner leer = new Scanner(System.in);
		int opcionSeleccionada = leer.nextInt();
		
		return opcionSeleccionada;
	}


}
