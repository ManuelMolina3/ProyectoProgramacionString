package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alum1= new Alumno (15, 7.8, "Manuel", 19);
		
		Alumno alum2= new Alumno (25, "Antonio");
		
		System.out.println("El nombre es: " +alum1.nombre +" Su nota media es: "+alum1.notaMedia);
		System.out.println("Su edad es: "+alum1.edad +" Su número de clase es: " +alum1.numDeClase);
	}

}
