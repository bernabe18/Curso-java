package edu.java.udemy.tp01;

public class Persona {
	//Atributos de la clase
	private String nombre;
	private String apellido;

	
	//Metodos de la clase
	public void desplegarInformacion() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Apellido: "+ apellido);
		
	}
	
		
	// solo asigne los parametro a las variables de la clases
	public Persona(String nombre, String apellido) {
			this(nombre,apellido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}