package vomistr;
import java.time.LocalDateTime;

public class Ticket {

	private int numeroTicket;
	private LocalDateTime fechaHora = LocalDateTime.now();
	private String descripcionProblema;
	private String estado;
	private String solucionProblema;
	
	public Ticket() {
		
	}

	public Ticket(int numeroTicket, LocalDateTime fecha, String descripcionProblema, String estado, String solucionProblema) {
		this.numeroTicket = numeroTicket;
		this.descripcionProblema = descripcionProblema;
		this.estado = estado;
		this.solucionProblema = solucionProblema;
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public LocalDateTime getFecha() {
		return fechaHora;
	}

	public void setFecha(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDescripcionProblema() {
		return descripcionProblema;
	}

	public void setDescripcionProblema(String descripcionProblema) {
		this.descripcionProblema = descripcionProblema;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSolucionProblema() {
		return solucionProblema;
	}

	public void setSolucionProblema(String solucionProblema) {
		this.solucionProblema = solucionProblema;
	} 
	
	


}
