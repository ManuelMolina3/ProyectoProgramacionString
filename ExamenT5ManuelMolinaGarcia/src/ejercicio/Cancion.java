package ejercicio;


public class Cancion implements Comparable <Cancion>{
	private int id;
	private String titulo;
	private String interprete;
	private int numEscuchadas;
	private boolean gratisPago;
	private double duracion;
	public Cancion(int id, String titulo, String interprete, int numEscuchadas, boolean gratisPago, double duracion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.interprete = interprete;
		this.numEscuchadas = numEscuchadas;
		this.gratisPago = gratisPago;
		this.duracion = duracion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getNumEscuchadas() {
		return numEscuchadas;
	}
	public void setNumEscuchadas(int numEscuchadas) {
		this.numEscuchadas = numEscuchadas;
	}
	public boolean isGratisPago() {
		return gratisPago;
	}
	public void setGratisPago(boolean gratisPago) {
		this.gratisPago = gratisPago;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", interprete=" + interprete + ", numEscuchadas="
				+ numEscuchadas + ", gratisPago=" + gratisPago + ", duracion=" + duracion + "]";
	}
	@Override
	public int compareTo(Cancion c) {
		
		return -(this.interprete.compareTo(c.interprete));
	}
	
	
	
	
	

}
