 package ejemploUd4;

public class Empleado extends  Trabajador {
 /*se le pone el extends para decir que empleado es la hija de trabajador*/
	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + ", toString()=" + super.toString() + "]";
	}
	public double calcularPaga(int numHijos) {
		double div=100.00;
		getNombre();
		return (sueldo +(sueldo-impuestos/div))+super.calcularPaga(numHijos);
	}

	
	
	
}
