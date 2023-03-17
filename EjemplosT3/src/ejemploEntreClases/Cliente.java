package ejemploEntreClases;

public class Cliente {
	//atributos
	private String nombre;
	private int edad;
	//constructores
	public Cliente(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	} 
	//toString
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}
	//gettersandsetters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//metodo
	public float imprimirSenior(int tope) {
		float pension=500;
		if(edad>=tope) {
			return pension;
		}else {
			return 0;
		}
	}
	
}
