package vomistr;

public class Cliente {
	
	private String id;
	private String rut;
	private String nombre;
	private String telefono;
	private String email;
	
	public Cliente() {
		
	}

	public Cliente(String rut, String nombre, String telefono, String correoElectronico) {
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
