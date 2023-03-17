package ejemplos;

public class Alumno {
	private String nombreAlumno;
	private String apellidoAlumno;
	private int edad;
	private boolean alta;
	public Alumno(String nombreAlumno, String apellidoAlumno, int edad, boolean alta) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumno = apellidoAlumno;
		this.edad = edad;
		this.alta = alta;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getApellidoAlumno() {
		return apellidoAlumno;
	}
	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isAlta() {
		return alta;
	}
	public void setAlta(boolean alta) {
		this.alta = alta;
	}
	@Override
	public String toString() {
		return "Alumno [nombreAlumno=" + nombreAlumno + ", apellidoAlumno=" + apellidoAlumno + ", edad=" + edad
				+ ", programador=" + alta + "]";
	}
	
}
