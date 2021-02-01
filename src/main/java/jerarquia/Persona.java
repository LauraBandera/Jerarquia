package jerarquia;

public class Persona {

	private String nombre, nif;
	private int edad;
	
	public Persona(String nombre, String nif, int edad) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.edad = edad;
	}
	
	public Persona() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNif() {
		return nif;
	}
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", nif=" + nif + ", edad=" + edad + "]";
	}
	
	
}
