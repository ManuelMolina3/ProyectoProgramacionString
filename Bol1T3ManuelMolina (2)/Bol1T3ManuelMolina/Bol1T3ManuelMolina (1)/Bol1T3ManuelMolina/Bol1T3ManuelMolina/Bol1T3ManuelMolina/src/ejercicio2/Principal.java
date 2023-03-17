package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Operaciones op= new Operaciones();
		System.out.println("Diga un número");
		num=Leer.datoInt();
		op.comproPos(num);
		op.imprimir(op.comproPos(num));
		
	}

}
//Forma 1: no es tan buena
//arriba boolean res;
//abajo de todo res=op.comproPos(num);
//syso(res);
//Forma2: la mejor Esta no guarda
//op.comproPos(num);
//syso(op.comproPos(num)); ESTO NO
//op.imprimir(op.comproPos(num)); ESTO SI
//Forma3: esta si guarda
//res=op.comproPos(num);
//op.imprimir(res);