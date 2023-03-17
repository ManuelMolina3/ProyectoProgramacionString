package ejercicio3;

import java.util.Arrays;
import java.util.Random;

public class ArrayReales implements IEstadisticas{
	private double [] num;
	

	public ArrayReales(double[] num) {
		super();
		this.num = num;
	}

	public double[] getNum() {
		return num;
	}

	public void setNum(double[] num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ArrayReales [num=" + Arrays.toString(num) + "]";
	}
	public void generarNum() {
		int desde=1, hasta=15;
		Random n = new Random (System.nanoTime());
		for (int i = 0; i < num.length; i++) {
			num[i]=n.nextInt(hasta-desde+1)+desde;
		}
		
	}

	@Override
	public double calcularMinimo() {
		double numMin=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]<=numMin)
				numMin=num[i];
		}
		return numMin;
	}

	@Override
	public double calcularMaximo() {
		double numMax=0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]>=numMax)
				numMax=num[i];
		}
		return numMax;
	}

	@Override
	public double calcularSumatorio() {
		double sumNum=0;
		for (int i = 0; i < num.length; i++) {
			sumNum+=num[i];
		}
		return sumNum;
	}
	
	
}
int op=0;
System.out.println("Bienvenido al programa");

do {
	System.out.println("");
	switch(op) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	case 5:
		break;
	default:
		System.out.println("Opción no encontrada");
		break;
	}
}while(op!=0);
System.out.println("Gracias por haber usado el programa");
}
