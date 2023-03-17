package ejercicio;

import java.util.ArrayList;

import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0;
		String interprete;
		Cancion c1= new Cancion(1, "MA", "Paco", 3, true, 3.5);
		Cancion c2= new Cancion(2, "PA", "Pepe", 4, true, 4.5);
		Cancion c3= new Cancion(3, "LA", "Pedro", 5, false, 5.5);
		Cancion c4= new Cancion(4, "CA", "Antonio", 6, true, 6.5);
		Cancion c5= new Cancion(5, "XA", "Victor", 7, false, 1.5);
		List <Cancion> listado= new ArrayList <Cancion>();
		listado.add(c1);
		listado.add(c2);
		listado.add(c3);
		listado.add(c4);
		listado.add(c5);
		MiMusica musica= new MiMusica(listado);
		System.out.println("Bienvenido al programa");
		do {
			System.out.println("///////////////////////////");
			System.out.println("1. Buscar las canciones gratis");
			System.out.println("2. Buscar las canciones con mayor duración");
			System.out.println("3. Buscar todas las canciones del cantante que quieras");
			System.out.println("4. Buscar tu cancion mas escuchada");
			System.out.println("5. Modificar si quieres que una cancion cambie de pago a gratis o viceversa");
			System.out.println("6. Ordenar la lista por el nombre del cantante");
			System.out.println("7. Ordenar la lista por la duracion de la canción");
			System.out.println("8. Crear una lista aleatoria con el numero de canciones que digas");
			System.out.println("9. Calcular la media de duracion de todas las canciones");
			System.out.println("10. Imprimir toda la lista");
			System.out.println("0. Salir del programa");
			System.out.println("///////////////////////////");
			op=Leer.datoInt();
			switch(op) {
				case 1:
						
					break;
				case 2:
						System.out.println("La cancion que mas veces has escuchado es: "+ musica.FindbyMasEsc(c1));
					break;
				case 3:
						System.out.println("Digame el interprete que te gustaria ver sus canciones");
						interprete=Leer.dato();
						musica.FindByInterprete(interprete);
					break;
				case 4:
					musica.FindbyMasEsc(c1);
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
						
					break;
				case 8:
						
					break;
				case 9:
					System.out.printf("La media total de todas las canciones es de: %.2f", musica.mediaDuracion());
					break;
				case 10:
					musica.imprimirTodo();
					break;
				case 0:
						
					break;
				default:
					System.out.println("Opción no disponible");
					break;
			}
			
			
		}while(op!=0);
		System.out.println("Gracias por usar este programa");
		
	}

}
