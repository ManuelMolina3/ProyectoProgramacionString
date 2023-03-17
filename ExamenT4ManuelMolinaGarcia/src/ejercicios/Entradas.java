package ejercicios;

public class Entradas implements IDesglosable{
	private int zona;
	private int numAsiento;
	private int numFila;
	public Entradas(int zona, int numAsiento, int numFila) {
		super();
		this.zona = zona;
		this.numAsiento = numAsiento;
		this.numFila = numFila;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getNumAsiento() {
		return numAsiento;
	}
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	public int getNumFila() {
		return numFila;
	}
	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}
	@Override
	public String toString() {
		return "Entradas [zona=" + zona + ", numAsiento=" + numAsiento + ", numFila=" + numFila + "]";
	}
	@Override
	public double calcularIva(double porcentajeIva, double precio1, double precio2) {
		int cien=100;
		if (zona==1) {
			return precio1*porcentajeIva/cien;
		}else if(zona==2){
			return precio2*porcentajeIva/cien;
			}
		else 
			return 0;
	}
	public double calcularPrecioEnt (double porcentajeIva, double precio1, double precio2, double porcentajeDes, double cantidadFija) {
		
		if (zona==1) {
			return precio1+calcularIva(porcentajeIva, precio1, precio2);
		}else if(zona==2){
			return precio2+calcularIva(porcentajeIva, precio2, precio1);
		}else 
			return 0;
	}
	

}
