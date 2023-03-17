package ejercicioExamen;

public class Producto {
	// atributos
	private String nombre;
	private double precioBase;
	private String seccion;
	private int rebajas;
	private double pvp;

	// constructor
	public Producto(String nombre, double precioBase, String seccion, int rebajas) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.seccion = seccion;
		this.rebajas = rebajas;

	}

	// gettersAndSetters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public double getRebajas() {
		return rebajas;
	}

	public void setRebajas(int rebajas) {
		this.rebajas = rebajas;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	// toString
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", seccion=" + seccion + ", rebajas="
				+ rebajas + ", pvp=" + pvp + "]";
	}

	// metodos
	// PVP
	public double calcularPVP(int ganancia) {
		int porciento = 100;
		int porcentGana = 0;
		porcentGana = ganancia * porciento;
		pvp = precioBase + (precioBase * porcentGana);

		return pvp;

	}

	public void imprimirPVP() {
		System.out.printf("Su precio de venta al publico es de: %.2f", pvp);
	}

	// Descuento
	public boolean quererRebajas(double descuento) {
		if (pvp <= 0) {
			return false;
		} else {
			if (rebajas == 1) {
				int porciento = 100;
				descuento = rebajas * porciento;
				this.pvp = pvp - (descuento * pvp);
				return true;
			} else {
				return false;
			}
		}
	}

	public void imprimirRebajas(boolean b) {
		if (b) {
			System.out.printf("Operación aceptada");
		} else {
			System.out.println("Este producto no admite descuento");
		}
	}

	// Cambio a libras esterlinas
	public double calcularPVPLibras(double libras) {
		double precioLibras = 0;
		precioLibras = pvp * libras;
		return precioLibras;
	}

	public void imprimirLibras(double precioLibras) {
		System.out.printf("Su precio en libras esterlinas es: %.2f", precioLibras);
	}

	// cartelera
	public void cartelera() {
		int preciomin = 3;
		if (pvp > preciomin) {
			System.out.println("******************************");
			System.out.printf("%S en MEGA-GANGA", nombre);
			System.out.println("******************************");
		} else {

		}
	}
}
