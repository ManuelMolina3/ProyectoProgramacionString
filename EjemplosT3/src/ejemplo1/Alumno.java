package ejemplo1;

public class Alumno {
	
//Primero los atributos
int numDeClase;
double notaMedia;
String nombre;
int edad;

//construcctores

	public Alumno (int numDeClase, double notaMedia, String nombre, int edad) {
	
	this.numDeClase=numDeClase;
	this.notaMedia=notaMedia;
	this.nombre=nombre;
	this.edad=edad;
	

	}
	public Alumno (int numDeClase, String nombre) {
		this.numDeClase=numDeClase;
		this.nombre=nombre;
	}
}
