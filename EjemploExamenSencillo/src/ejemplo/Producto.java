package ejemplo;

public class Producto {
	// Atributos
	String nombre;
	String seccion;
	double precioBase;
	int rebaja;
	double pvp;

	//construcctores
	
	public Producto(String nombre, String seccion, double precioBase, int rebaja) {

		this.nombre = nombre;
		this.seccion = seccion;
		this.precioBase = precioBase;
		this.rebaja = rebaja;
	}
	
	//gettersandsetters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getRebaja() {
		return rebaja;
	}

	public void setRebaja(int rebaja) {
		this.rebaja = rebaja;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	
	//ToString
	
	public String toString() {
		return "Producto [nombre=" + nombre + ", seccion=" + seccion + ", precioBase=" + precioBase + ", rebaja="
				+ rebaja + ", pvp=" + pvp + "]";
	}

	// metodos
	// PVP
	public double generarpvp(int ganancia) {
		int porciento = 100;
		double ganar;
		ganar = ganancia / porciento;
		pvp = precioBase + (precioBase * ganar);
		return pvp;
	}

	public void imprimirpvp() {
		System.out.printf("El precio de %s es %.2f", nombre, pvp);
	}

	// REBAJAS
	public boolean rebajar() {
		int porciento = 100, porcentaje = 0;
		double rebajas;
		rebajas = porcentaje / porciento;
		if (rebaja == 1) {
			pvp = pvp - (pvp * rebajas);
			return true;
		} else {
			return false;
		}

	}

	public void imprimirAprobado(boolean b) {
		if (pvp < 0) {
			System.out.println("Operacion realizada con exito");
		} else {
			System.out.println("Este producto no tiene rebaja");
		}
	}

	// CambioLibras
	public double generarLibra(double libra) {
		double pvpLibra;
		pvpLibra = pvp * libra;
		return pvpLibra;
	}

	public void imprimirLibra(double pvpLibra) {
		System.out.printf("El precio del %S es de %.2f libras esterlinas", nombre, pvpLibra);
	}

	// Cartel
	public void imprimirchollo() {
		int preciomax = 3;
		if (pvp > preciomax) {
			System.out.println("************");
			System.out.println("SUPER CHOLLO");
			System.out.println("************");
		} else {

		}
	}
}
