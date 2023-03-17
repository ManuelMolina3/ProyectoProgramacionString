package ejercicio2;

public class Habitacion {
	/* ATRIBUTOS */
	String tipo;
	double precio;
	boolean extra;
	String nombreCli;
	int dias;
	int ocupado;
	String nombreHab;

	public Habitacion(String tipo, double precio, boolean extra, String nombreCli, int dias, int ocupado,
			String nombreHab) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.extra = extra;
		this.nombreCli = nombreCli;
		this.dias = dias;
		this.ocupado = ocupado;
		this.nombreHab = nombreHab;
	}

	public Habitacion(String tipo, double precio, boolean extra, String nombreCli, int dias, String nombreHab) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.extra = extra;
		this.nombreCli = nombreCli;
		this.dias = dias;
		this.nombreHab = nombreHab;
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precio=" + precio + ", extra=" + extra + ", nombreCli=" + nombreCli
				+ ", dias=" + dias + ", ocupado=" + ocupado + ", nombreHab=" + nombreHab + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isExtra() {
		return extra;
	}

	public void setExtra(boolean extra) {
		this.extra = extra;
	}

	public String getNombreCli() {
		return nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getOcupado() {
		return ocupado;
	}

	public void setOcupado(int ocupado) {
		this.ocupado = ocupado;
	}

	public String getNombreHab() {
		return nombreHab;
	}

	public void setNombreHab(String nombreHab) {
		this.nombreHab = nombreHab;
	}
}
