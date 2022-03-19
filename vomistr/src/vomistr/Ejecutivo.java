package vomistr;

public class Ejecutivo {
	private int id;
	private String rutEspecialista;
	private String nombreEspecialista;
	private char tipo;
	
	public Ejecutivo() {
		
	}

public Ejecutivo(String rutEspecialista, String nombreEspecialista) {
		this.id= id;
		this.rutEspecialista = rutEspecialista;
		this.nombreEspecialista = nombreEspecialista;
		this.tipo = tipo;
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getRutEspecialista() {
	return rutEspecialista;
}

public void setRutEspecialista(String rutEspecialista) {
	this.rutEspecialista = rutEspecialista;
}

public String getNombreEspecialista() {
	return nombreEspecialista;
}

public void setNombreEspecialista(String nombreEspecialista) {
	this.nombreEspecialista = nombreEspecialista;
}

public char getTipo() {
	return tipo;
}

public void setTipo(char tipo) {
	this.tipo = tipo;
}


	
	
	

}
