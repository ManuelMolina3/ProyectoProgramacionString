package ejercicio5;

import java.util.Random;

public class Generadora {
	//Atributos
	//No hay 
	//Constructores
	public Generadora() {
		
	}
	//metodos
	public int generarQuiniela (int partidos) {
		Random num= new Random (System.nanoTime());
		int desde=0, hasta=2;
		int[] quini= new int [partidos];
		for(int i=0; i<partidos; i++) {
			quini[i]=num.nextInt(hasta-desde+1)-desde;	
			
		}
		return quini;
	}
		
		public void imprimirQuiniela (int quini[i]) {
			
			for(int i=0; i<partidos.length; i++) {
			if (quini[i]==0) {
				System.out.println("X");
			}
			if (quini[i]==1) {
				System.out.println("1");
			}
			if (quini[i]==2) {
				System.out.println("2");
			}
			}

	}
	
	public boolean generarPN (int num1) {
		Random num2= new Random (System.nanoTime());
		int desde=0, hasta=5;
		int mano2=0, result=0;
		mano2= num2.nextInt(hasta-desde+1)-desde;
		result=num1+mano2;
		if(result%2==0) {
			return true;
		}else {
			return false;
		}
	}
		public void imprimirImparPar (boolean b) {
			if (b) {
				System.out.println("Pares");
			}else {
				System.out.println("Nones");
			}
		
		
	}
	public boolean generarPiedras (int piedras, int piedrastu) {
		Random pied= new Random (System.nanoTime());
		int desde=1, hasta=3;
		int piedras1=0, totalpiedras=0;
		piedras1=pied.nextInt(hasta-desde+1)-desde;
		totalpiedras=piedrastu+piedras1;
		if(totalpiedras==piedras) {
			return true;
		}else {
			return false;
		}
	
	}
	public void imprimirChinos (boolean c) {
		if (c) {
			System.out.println("Has ganado");
		}else {
			System.out.println("Has perdido");
		}
	}
	public int generarPrimitiva () {
		
		int desde=1, hasta=49;
		int numPrimi=0, numNum=6;
		System.out.print("Su número es el: ");
		Random primi= new Random (System.nanoTime());
		for(int i=0; i<numNum; i++) {
			numPrimi=primi.nextInt(hasta-desde+1)-desde;
			System.out.print(numPrimi +" ");
			
		}
	}
}
