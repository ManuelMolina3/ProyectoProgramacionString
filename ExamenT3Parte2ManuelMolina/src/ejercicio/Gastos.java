package ejercicio;

public class Gastos {
	
	public String concepto;
	public double cantidadGastada;
	public String idGasto;
	public Gastos(String concepto, double cantidadGastada, String idGasto) {
		super();
		this.concepto = concepto;
		this.cantidadGastada = cantidadGastada;
		this.idGasto = idGasto;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getCantidadGastada() {
		return cantidadGastada;
	}
	public void setCantidadGastada(double cantidadGastada) {
		this.cantidadGastada = cantidadGastada;
	}
	public String getIdGasto() {
		return idGasto;
	}
	public void setIdGasto(String idGasto) {
		this.idGasto = idGasto;
	}
	@Override
	public String toString() {
		return "Gastos [concepto=" + concepto + ", cantidadGastada=" + cantidadGastada + ", idGasto=" + idGasto + "]";
	}
	
}
