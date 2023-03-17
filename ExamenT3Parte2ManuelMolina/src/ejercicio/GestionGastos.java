package ejercicio;

import java.util.Arrays;

public class GestionGastos {
	
	public Gastos [] gastos;
	public double gastosTotales;
	
	public GestionGastos(Gastos[] gastos) {
		super();
		this.gastos = gastos;
	}
	public GestionGastos(Gastos[] gastos, double gastosTotales) {
		super();
		this.gastos = gastos;
		this.gastosTotales = gastosTotales;
	}
	public Gastos[] getGastos() {
		return gastos;
	}
	public void setGastos(Gastos[] gastos) {
		this.gastos = gastos;
	}
	public double getGastosTotales() {
		return gastosTotales;
	}
	public void setGastosTotales(double gastosTotales) {
		this.gastosTotales = gastosTotales;
	}
	@Override
	public String toString() {
		return "GestionGastos [gastos=" + Arrays.toString(gastos) + ", gastosTotales=" + gastosTotales + "]";
	}
	public void add (Gastos g, int posicion) {
		
		gastos [posicion]= g;
	}
	public double calcularTotal () {
		for (int i = 0; i < gastos.length && gastos[i]!=null; i++) {
			gastosTotales+=gastos[i].getCantidadGastada();
			
		}
		setGastosTotales(gastosTotales);
		return gastosTotales;
		
	}
	public void imprimirTodosGastos () {
		for (int i = 0; i < gastos.length; i++) {
			System.out.println((i+1)+ ". " + gastos[i]);
		}
	}
	public void imprimirGasto () {
		for (int i = 0; i < gastos.length && gastos[i]!=null; i++) {
			System.out.printf("%s : %.2f euros \n", gastos[i].getConcepto(), gastos[i].getCantidadGastada());
		}
	}
	public double calcularGastoPresupuesto (double presupuesto) {
			
		return presupuesto-getGastosTotales();
	}
	public int findById (String idB) {
		int i=0;
		boolean encontrado=false;
		while (i< gastos.length && !encontrado) {
			Gastos lista= gastos[i];
			if(lista.getIdGasto().equalsIgnoreCase(idB))
				encontrado=true;
			else
				i++;
		}
		if (encontrado)
			return i;
		else
			return -1;
	}
	public void editGastos (String idB, double cantidadN) {
		int index = findById(idB);
		if(index<=0)
			gastos[index].setCantidadGastada(cantidadN);
	}
	public Gastos BuscarGasto (String conceptoN) {
		int i=0;
		boolean encontrado=false;
		while (i<gastos.length && !encontrado) {
			Gastos lista =gastos[i];
			if(lista.getConcepto().equalsIgnoreCase(conceptoN)) {
				encontrado = true;
			}else
				i++;
		}
		if (encontrado)
			return gastos[i];
		else 
			return null;
		
		
		
	}
}
