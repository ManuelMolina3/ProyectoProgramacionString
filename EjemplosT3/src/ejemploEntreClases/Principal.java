package ejemploEntreClases;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre; 
		int edad, tope;
		Cliente c;
		long numero;
		float saldo, interes;
		Cuenta cu;
		System.out.println("Digame por favor su nombre");
		nombre=Leer.dato();
		System.out.println("Digame por favor su edad");
		edad=Leer.datoInt();
		c =new Cliente (nombre, edad);
		
		System.out.println("Digame su número de cuenta");
		numero=Leer.datoLong();
		System.out.println("Digame su saldo");
		saldo=Leer.datoFloat();
		System.out.println("Digame el tipo de intereses");
		interes=Leer.datoFloat();
		cu= new Cuenta (numero,c,saldo,interes);
		System.out.println("diga el tope de edad");
		tope=Leer.datoInt();
		System.out.println("Datos de la cuenta:"+cu);
		System.out.printf("Su saldo es de: %.2f", cu.calcularIngreso(tope));
		System.out.printf("Su saldo es de: %.2f", cu.calcularIngresoV2(tope, c));
	}

}
