package vomistr;

public class Ejecutivo {
	private int id;
	private String rutEjecutivo;
	private String nombreEjecutivo;
	private char tipoEjecutivo;
	
	public Ejecutivo() {
		
	}

	public Ejecutivo(int id, String rutEjecutivo, String nombreEjecutivo, char tipoEjecutivo) {
		super();
		this.id = id;
		this.rutEjecutivo = rutEjecutivo;
		this.nombreEjecutivo = nombreEjecutivo;
		this.tipoEjecutivo = tipoEjecutivo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRutEjecutivo() {
		return rutEjecutivo;
	}

	public void setRutEjecutivo(String rutEjecutivo) {
		this.rutEjecutivo = rutEjecutivo;
	}

	public String getNombreEjecutivo() {
		return nombreEjecutivo;
	}

	public void setNombreEjecutivo(String nombreEjecutivo) {
		this.nombreEjecutivo = nombreEjecutivo;
	}

	public char getTipoEjecutivo() {
		return tipoEjecutivo;
	}

	public void setTipoEjecutivo(char tipoEjecutivo) {
		this.tipoEjecutivo = tipoEjecutivo;
	}



}
