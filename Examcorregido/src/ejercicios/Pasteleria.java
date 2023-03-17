package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Pasteleria {
	//atributos
		private String sabor;
		private double precioLitro;
		private double volumenTarta;
		private boolean extra;
		private int cantidadTartas[];
		//constructores
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
		//toString
		public String toString() {
			return "Pasteleria [sabor=" + sabor + ", precioLitro=" + precioLitro + ", volumenTarta=" + volumenTarta
					+ ", extra=" + extra + ", cantidadTartas=" + Arrays.toString(cantidadTartas) + "]";
		}
		//gettersandsetters 
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
		//Metodos
		public void rellenarTartas (int hasta,int desde ) {
			int uno=1;
			Random num= new Random(System.nanoTime());
			for (int i = 0; i < cantidadTartas.length; i++) {
				cantidadTartas[i]=num.nextInt(hasta-desde+uno)+desde;
			}
		}
		public void imprimirTartas () {
			System.out.println("SEMANA");
			for (int i = 0; i < cantidadTartas.length; i++) {
				System.out.println("DÍA"+ (i+1) +cantidadTartas[i]+ "tartas");
			}
		}
		public double calcularTartas () {
			
			return volumenTarta*precioLitro;
			
		}
		
		public double calcularPVP (int ganancia) {
			int cien=100;
			
		return calcularTartas()*(calcularTartas()*ganancia/cien);
			
		}
		public double calcularExtra(double porcentaje, int ganancia) {//importanten ponerlo en el if y en el else
			
			if (extra) {
				return calcularPVP(ganancia)*porcentaje;
				
			}else {
				return calcularPVP(ganancia);
			}
			
		}
		public int calcularTotal () {
			int cantidadTotal=0;
			for (int i = 0; i < cantidadTartas.length; i++) {
				cantidadTotal+=cantidadTartas[i];
				
			}
			return cantidadTotal;
			
		}
}
	