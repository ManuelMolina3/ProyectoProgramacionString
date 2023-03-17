package ejercicio;

import java.util.Iterator;
import java.util.List;

public class MiMusica {
	List <Cancion> lista;


	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}

	public MiMusica(List<Cancion> lista) {
		super();
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "MiMusica [lista=" + lista + "]";
	}
	public void imprimirTodo() {
		Iterator<Cancion> it= lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void FindGratis (boolean d) {
		Iterator<Cancion> it= lista.iterator();
		while(it.hasNext()) {
			
		}
	}
	public Cancion FindMayDuracion (Cancion c1) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getDuracion()>c1.getDuracion()) {
				c1=lista.get(i);
			}
			
		}
		return c1;
		
	}
	public Cancion FindByInterprete (String interprete) {
		for(Cancion c: lista) {
			if(c.getInterprete().toLowerCase().equalsIgnoreCase(interprete)) {
				return c;
			}
		}
		return null;
	}
	public Cancion FindbyMasEsc (Cancion c1) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getNumEscuchadas()>c1.getNumEscuchadas()) {
				c1= lista.get(i);
			}
			
		}
		return c1;
		
	}
	public void ModificarGratis (int id, boolean GratisPago) {
		lista.get(id).setGratisPago(GratisPago);
	}
	public void CrearPlaylist (int tam) {
		if (tam<lista.size()) {
			
		}else{
			
		}
	}
	public double mediaDuracion() {
		double mediaT=0.00;
		for (int i = 0; i < lista.size(); i++) {
			mediaT+=lista.get(i).getDuracion();
		}
		return mediaT/lista.size();
	}
	
	
	
}
