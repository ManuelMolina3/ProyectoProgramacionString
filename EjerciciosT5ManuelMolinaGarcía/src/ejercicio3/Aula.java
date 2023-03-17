package ejercicio3;

import java.util.Iterator;
import java.util.Set;

public class Aula {
	private String nombre;
	private Set<Alumno> lista;

	public Aula(String nombre, Set<Alumno> lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Alumno> getLista() {
		return lista;
	}

	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + ", lista=" + lista + "]";
	}

	public void mostaraTodos() {
		for (Alumno alumn : lista) {
			System.out.println(alumn);
		}
	}

	public void mostaraTodosV2() {
		Iterator<Alumno> it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.hasNext());
		}
	}

	public double calcularNotaMedia() {
		double notaMedia = 0.00;
		for (Alumno a : lista) {
			notaMedia += a.getNotaMedia();
		}
		return notaMedia / lista.size();
	}

	public double calcularNumeroSuspensos() {
		int sus = 0;
		Iterator<Alumno> it = lista.iterator();
		while (it.hasNext()) {
			if (it.next().getNotaMedia() < 5)
				sus++;
		}
		return sus;
	}
}
