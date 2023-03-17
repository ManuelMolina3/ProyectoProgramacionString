package ejercicio7;

public class CuentaCorriente {
	// atributos
	private double saldo;
	private String nombre;

	// constructores
	public CuentaCorriente(double saldo, String nombre) {
		this.saldo = saldo;
		this.nombre = nombre;
	}

	// gettersandsetters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// toString
	@Override
	public String toString() {
		return "Banco [saldo=" + saldo + ", nombre=" + nombre + "]";
	}

	// metodos
	public double ingresarDinero(double saldoMas) {
		saldo += saldoMas;
		return saldo;
	}

	public boolean retirarDinero(double saldoMenos) {
		if (saldoMenos <= saldo) {
			saldo -= saldoMenos;
			return true;
		} else {
			return false;
		}
		
	}
	public void imprimirDinero (boolean d) {
		if(d) {
			System.out.println("Operación aceptada");
		}else {
			System.out.println("Operación rechazada");
		}
	}

	public double cambiarDolares() {
		double dolares = 1.03;
		double saldoDolares = 0;
		saldoDolares = saldo * dolares;
		return saldoDolares;
	}

	public void imprimirDolares(double saldoDolares) {
		System.out.printf("Su saldo en dolares es: %.2f", saldoDolares);
	}
}
