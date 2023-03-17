 package ejercicio;

import java.util.Arrays;
import java.util.Random;

public class Pasteleria {
	//atributos
	private String sabor;
	private double precioLitro;
	private double volumenTarta;
	private boolean extra;
	private int cantidadTartas[];
	public Pasteleria(String sabor, double precioLitro, double volumenTarta, boolean extra, int[] cantidadTartas) {
		this.sabor = sabor;
		this.precioLitro = precioLitro;
		this.volumenTarta = volumenTarta;
		this.extra = extra;
		this.cantidadTartas = cantidadTartas;
	}
	public Pasteleria() {
		
	}
	
	public Pasteleria(String sabor, double precioLitro, double volumenTarta, boolean extra) {

		this.sabor = sabor;
		this.precioLitro = precioLitro;
		this.volumenTarta = volumenTarta;
		this.extra = extra;
	}
	public String toString() {
		return "Pasteleria [sabor=" + sabor + ", precioLitro=" + precioLitro + ", volumenTarta=" + volumenTarta
				+ ", extra=" + extra + ", cantidadTartas=" + Arrays.toString(cantidadTartas) + "]";
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPrecioLitro() {
		return precioLitro;
	}
	public void setPrecioLitro(double precioLitro) {
		this.precioLitro = precioLitro;
	}
	public double getVolumenTarta() {
		return volumenTarta;
	}
	public void setVolumenTarta(double volumenTarta) {
		this.volumenTarta = volumenTarta;
	}
	public boolean isExtra() {
		return extra;
	}
	public void setExtra(boolean extra) {
		this.extra = extra;
	}
	public int[] getCantidadTartas() {
		return cantidadTartas;
	}
	public void setCantidadTartas(int[] cantidadTartas) {
		this.cantidadTartas = cantidadTartas;
	}
	//metodos
	public int []generarNumTartas (int hasta, int desde, int tam ){
		Random num= new Random (System.nanoTime());
		
		for (int i=0; i<cantidadTartas.length; i++) {
			cantidadTartas[i]=num.nextInt(hasta-desde+1)+desde;	
		}
		return cantidadTartas;
	}
	public void imprimirNumTartas (int tam) {
		for(int i=0; i<cantidadTartas.length; i++) {
			System.out.println("Dia [i]"  +cantidadTartas[i] +"tartas");
		}
	}
	public double calcularPrecioFabri () {
		double precioFabri=0.00;
		precioFabri=precioLitro*volumenTarta;
		return precioFabri;
	}
	public void imprimirPrecioFabri (double precioFabri) {
		
		System.out.printf("El precio que le saldria hacer una tarta seria de: %.2f euros", precioFabri);
	}
	public double calcularPVP (int ganancia, double precioFabri) {
		int cien=100;
		double pvp;
		pvp=precioFabri+ precioFabri*ganancia/cien;
		return pvp;
	}
	public void imprimirPVP (double pvp) {
		
		System.out.printf("El precio de venta al publico seria: %.2f euros", pvp);
	}
	public double calcularExtra(double pvp, double precioExtra) {
		pvp+=precioExtra;
		return pvp;	
		}
	public void imprimirPrecioExtra (double pvp) {
		System.out.printf("el precio de las tartas con el extra añadido es de: %.2f euros", pvp);
	}
	public int calcularTotal (int tam) {
		int cantidadTotal=0;
		for (int i = 0; i < cantidadTartas.length; i++) {
			cantidadTotal=+cantidadTartas[i];
			
		}
		return cantidadTotal;
	}
	public void imprimirTotal(double cantidadTotal) {
		
	}
	}
	
	

