package vomistr;
import java.time.LocalDateTime;

public class Ticket {

	private int numeroTicket;
	private LocalDateTime fechaHora = LocalDateTime.now();
	private Cliente cliente;
	private Producto producto;
	private Ejecutivo ejecutivoAtencion;
	private Ejecutivo ejecutivoSoporte;
	private String descripcionProblema;
	private String solucionProblema;
	private String estado;
	
	public Ticket() {
		
	}

	public Ticket(int numeroTicket, LocalDateTime fechaHora, Cliente cliente, Producto producto,
			Ejecutivo ejecutivoAtencion, Ejecutivo ejecutivoSoporte, String descripcionProblema,
			String solucionProblema, String estado) {
		super();
		this.numeroTicket = numeroTicket;
		this.fechaHora = fechaHora;
		this.cliente = cliente;
		this.producto = producto;
		this.ejecutivoAtencion = ejecutivoAtencion;
		this.ejecutivoSoporte = ejecutivoSoporte;
		this.descripcionProblema = descripcionProblema;
		this.solucionProblema = solucionProblema;
		this.estado = estado;
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Ejecutivo getEjecutivoAtencion() {
		return ejecutivoAtencion;
	}

	public void setEjecutivoAtencion(Ejecutivo ejecutivoAtencion) {
		this.ejecutivoAtencion = ejecutivoAtencion;
	}

	public Ejecutivo getEjecutivoSoporte() {
		return ejecutivoSoporte;
	}

	public void setEjecutivoSoporte(Ejecutivo ejecutivoSoporte) {
		this.ejecutivoSoporte = ejecutivoSoporte;
	}

	public String getDescripcionProblema() {
		return descripcionProblema;
	}

	public void setDescripcionProblema(String descripcionProblema) {
		this.descripcionProblema = descripcionProblema;
	}

	public String getSolucionProblema() {
		return solucionProblema;
	}

	public void setSolucionProblema(String solucionProblema) {
		this.solucionProblema = solucionProblema;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	

	

}
