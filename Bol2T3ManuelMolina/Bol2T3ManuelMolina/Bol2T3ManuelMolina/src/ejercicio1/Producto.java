package ejercicio1;

public class Producto {
	/*Atributos*/
	private double precioFabri;
	private String nombre;
	private String categoria;
	private boolean fragilidad;
	private int ganancia;
	
	public Producto(double precioFabri, String nombre, String categoria, boolean fragilidad, int ganancia) {
		super();
		this.precioFabri = precioFabri;
		this.nombre = nombre;
		this.categoria = categoria;
		this.fragilidad = fragilidad;
		this.ganancia = ganancia;
	}

	public Producto() {
		super();
	}

	@Override
	public String toString() {
		return "Producto [precioFabri=" + precioFabri + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", fragilidad=" + fragilidad + ", ganancia=" + ganancia + "]";
	}

	public double getPrecioFabri() {
		return precioFabri;
	}

	public void setPrecioFabri(double precioFabri) {
		this.precioFabri = precioFabri;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isFragilidad() {
		return fragilidad;
	}

	public void setFragilidad(boolean fragilidad) {
		this.fragilidad = fragilidad;
	}

	public int getGanancia() {
		return ganancia;
	}

	public void setGanacia(int ganancia) {
		this.ganancia = ganancia;
	}
	
	
	
	
}
