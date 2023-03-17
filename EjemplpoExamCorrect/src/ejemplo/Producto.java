package ejemplo;

public class Producto {
	private String nombre;
	private String seccion;
	private double precioBase;
	private boolean rebajado;
	private double pvp;

	// constructores
	public Producto() {

	}

	public Producto(String nombre, String seccion, double precioBase, boolean rebajado, double pvp) {
		this.nombre = nombre;
		this.seccion = seccion;
		this.precioBase = precioBase;
		this.rebajado = rebajado;
		this.pvp = pvp;
	}

	public Producto(String nombre, String seccion, double precioBase, boolean rebajado) {
		this.nombre = nombre;
		this.seccion = seccion;
		this.precioBase = precioBase;
		this.rebajado = rebajado;
	}

	// Getters and Setters
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

	public boolean isRebajado() {
		return rebajado;
	}

	public void setRebajado(boolean rebajado) {
		this.rebajado = rebajado;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	// ToString
	public String toString() {
		return "Producto [nombre=" + nombre + ", seccion=" + seccion + ", precioBase=" + precioBase + ", rebajado="
				+ rebajado + ", pvp=" + pvp + "]";
	}

	// metodos
	public double calcularPVP(double ganancia) {
		double cien = 100;
		pvp = precioBase + precioBase * ganancia / cien;
		return pvp;
	}

	public double calcularebaja(double porcentajerebaja) {
		double cien = 100;
		if (rebajado) {
			pvp = pvp - pvp * porcentajerebaja / cien;
		}
		return pvp;
	}

	public double calcularLibras(double libras) {

		return pvp * libras;// se hace cuando son operaciones simples y no hace falta crear otra variable

	}

	public void imprimirGanga(double precioMax) {

		if (pvp < precioMax) {
			System.out.println("*******");
			System.out.println("MEGAGANGA");
			System.out.println("********");
		}
	}

	public double calcularCaro(double[] precio) {
		double mayor = 0.00;
		for (int i = 0; i < precio.length; i++) {
			if (precio[i] > mayor)
				mayor = precio[i];
		}
		return mayor;
	}

	// IMPORTANTE PONER EN LA DEVOLUCION LOS CORCHETES SINO NO FUNCIONA
	public double[] calcularArraysLibras(double libras, double[] precio) {
		for (int i = 0; i < precio.length; i++) {
			precio[i] = precio[i] * libras;
		}
		return precio;
	}

	public void imprimirEnLibras(double[] precio) {
		for (int i = 0; i < precio.length; i++) {
			System.out.printf("\t %.2f", precio[i]);
		}
	}
}
