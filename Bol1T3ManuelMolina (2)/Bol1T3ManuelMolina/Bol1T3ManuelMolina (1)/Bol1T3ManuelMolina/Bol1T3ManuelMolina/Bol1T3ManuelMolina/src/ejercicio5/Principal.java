package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5. Crear una clase llamada Generadora sin atributos, pero con varios métodos que generen aleatoriamente
		distintos números o resultados según las características del sorteo o para qué se vaya a usar, por ejemplo,
		generar 1, x, 2 para una quiniela, generar par o impar para jugar a pares o nones, generar 1, 2 o 3 para jugar
		a los "chinos", del 1 al 49 para el sorteo de primitiva... Crear una clase principal donde se prueben todos
		los métodos pidiendo los datos necesarios para cada generación*/
		int op=0, partidos=0, num1=0, piedras=0, piedrastu=0;
		Generadora quini= new Generadora();
		Generadora chinos= new Generadora();
		Generadora parNon= new Generadora();
		Generadora primitiva= new Generadora();
		
		System.out.println("Bienvenido al programa multijuegos de azar");
		
		do{
			
			System.out.println("\nPulse 1 para jugar a la quiniela\n"
						+ "Pulse 2 para jugar a pares o nones\n"
						+ "Pulse 3 jugar a los chinos\n"
						+ "Pulse 4 para jugar a la primitiva\n"
						+ "Pulse 0 para salir\n");
			System.out.println("Por favor digame al minijuego que quiere jugar");
			op=Leer.datoInt();
			switch(op) {
				case 1:
					System.out.println("Bienvenido a la quiniela\n");
					System.out.println("Digame a cuántos partidos le quiere echar\n");
					partidos=Leer.datoInt();
					quini.imprimirQuiniela(quini.generarQuiniela(partidos));
					break;
					
				case 2:
					System.out.println("Bienvenido a pares o nones");
					System.out.println("Digame un número");
					num1=Leer.datoInt();
					parNon.imprimirImparPar(parNon.generarPN(num1));
					
					break;
					
				case 3:
					System.out.println("Bienvenido al juego de los chinos");
					System.out.println("Digame el número de piedras que tiene tú");
					piedrastu=Leer.datoInt();
					System.out.println("Digame cuántas piedra crees que teneis en total");
					piedras=Leer.datoInt();
					chinos.imprimirChinos(chinos.generarPiedras(piedras,piedrastu));
					break;
					
				case 4:
					System.out.println("Bienvenido a la primitiva");
					primitiva.generarPrimitiva();
					System.out.println("Mucha suerte");
					break;
					
				case 0:
					
					break;
					
				default:
					System.out.println("Opción no existente");
			}
			
		}while(op!=0);
			System.out.println("Gracias por usar este programa de multijuegos, espero que te hayas divertido");
	}

}
