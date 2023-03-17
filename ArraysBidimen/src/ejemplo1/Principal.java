package ejemplo1;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int colum=2, fila=2, desde=1, hasta=10;
		int[] [] notas= new int [fila] [colum];
		Random note= new Random (System.nanoTime());
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				
				notas[i][j]= note.nextInt(hasta-desde+1)+desde;
			}
			
		}
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				System.out.print(notas[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
