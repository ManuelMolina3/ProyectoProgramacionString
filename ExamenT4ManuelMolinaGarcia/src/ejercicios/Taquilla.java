package ejercicios;

import java.util.Arrays;

public class Taquilla {
	private Entradas [] listaEntradas;

	public Taquilla(Entradas[] listaEntradas) {
		super();
		this.listaEntradas = listaEntradas;
	}

	public Entradas[] getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(Entradas[] listaEntradas) {
		this.listaEntradas = listaEntradas;
	}

	@Override
	public String toString() {
		return "Taquilla [listaEntradas=" + Arrays.toString(listaEntradas) + "]";
	}
	public double calcularTotal (double porcentajeIva, double precio1,double precio2, double porcentajeDes, double cantidadFija) {
		double ventaTotal=0;
		for (int i = 0; i < listaEntradas.length; i++) {
			ventaTotal=+listaEntradas[i].calcularPrecioEnt(porcentajeIva, precio1, precio2, porcentajeDes, cantidadFija);
		}
		return ventaTotal;
	}
	public double calcularVentaTotalZ1 (double porcentajeIva, double precio1, double precio2,double porcentajeDes, double cantidadFija) {
		double cantidadToZ1=0;
		for (int i = 0; i < listaEntradas.length; i++) {
			if(listaEntradas[i].getZona()==1)
				cantidadToZ1+=listaEntradas[i].calcularPrecioEnt(porcentajeIva, precio1, precio2, porcentajeDes, cantidadFija);
		}
		return cantidadToZ1;
	}
	public void ImprimirVips () {
		for (int i = 0; i < listaEntradas.length; i++) {
			if(listaEntradas[i] instanceof Vip)
				System.out.printf("%s ",((Vip)listaEntradas[i]).getNombPersona());
				((Vip)listaEntradas[i]).ImprimirRegalo();
				System.out.println("\n");
		}
	}
	public double [] CalcularIvaCadaEntrada(double porcentajeIva, double precio1, double precio2) {
		double[] ivaCada =new double [listaEntradas.length];
		for (int i = 0; i < ivaCada.length; i++) {
			ivaCada[i]= listaEntradas[i].calcularIva(porcentajeIva, precio1, precio2);
		}
		return ivaCada;
	}
	                                   

}
