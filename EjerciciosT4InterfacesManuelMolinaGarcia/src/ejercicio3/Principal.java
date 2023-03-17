package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = new double[10];
		ArrayReales array = new ArrayReales(num);
		System.out.println("***********************************");
		array.generarNum();
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + ". " + array.getNum()[i]);

		}

		System.out.println("*************************************");
		System.out.printf("El número mas bajo es %.2f", array.calcularMinimo());
		System.out.println("\n************************************");
		System.out.printf("El número mas alto es %.2f", array.calcularMaximo());
		System.out.println("\n************************************");
		System.out.printf("El número total de la suma de todos los número es %.2f", array.calcularSumatorio());
		System.out.println("**************************************");

	}

}
