package es.studium.persona;

public class Persona {
	/* atributos  */
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean haPagado;
	
	/* constructores */

	//constructores por defecto
	public Persona() {
		nombre = "";
		apellidos = "";
		edad = 0;
		haPagado = false;
	}
	
	//constructor con parametros
	
	public Persona (String n, String a, int e, boolean h) {
		nombre =n;
		apellidos = a;
		edad = e;
		haPagado = h;
		
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getHaPagado() {
		return haPagado;
	}

	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}
	
	
	/* métodos */
}
