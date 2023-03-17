package ejemploUd4;

public class Consultor extends Trabajador {
	private int horas;
	private double tarifa;
	public Consultor(String nombre, String puesto, int horas, double tarifa) {
		super(nombre, puesto);
		this.horas = horas;
		this.tarifa = tarifa;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", toString()=" + super.toString() + "]";
	}
	
	public double calcularPaga (int numHijos) {
		return (horas*tarifa);
	}
}
