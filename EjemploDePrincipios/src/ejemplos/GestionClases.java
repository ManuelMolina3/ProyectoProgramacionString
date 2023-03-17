package ejemplos;

public class GestionClases {
	public void eliminarAlumno (Alumno c) {
		c.setAlta(false);
	}
	public void aniadirAlumno (Alumno c) {
		c.setAlta(true);
	}
	public void cambiarNombre (Alumno c, String nuevoNombre) {
		c.setNombreAlumno(nuevoNombre);
	}
	public void cambiarApellido (Alumno c, String nuevoApellido) {
		c.setApellidoAlumno(nuevoApellido);
	}
	public void cambiarEdad (Alumno c, int nuevaEdad) {
		c.setEdad(nuevaEdad);
	}
	
}
