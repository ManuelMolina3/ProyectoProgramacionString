package ejercicio;

import java.util.Comparator;

public class CompararPorDuracion implements Comparator<Cancion>{

	@Override
	public int compare(Cancion c1, Cancion c2) {
		if(c1.getDuracion()<c2.getDuracion()) {
			return -1;
		}else if(c1.getDuracion()>c2.getDuracion()) {
			return 1;
		}
		return 0;
	}
	
}
