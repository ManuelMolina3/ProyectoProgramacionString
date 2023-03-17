package ejemploEntreClases;

public class Cuenta {
	//atributos
	private long numero;
	private Cliente c;
	private float saldo;
	private float interes;
	//constructor
	public Cuenta(long numero, Cliente c, float saldo, float interes) {
		this.numero = numero;
		this.c = c;
		this.saldo = saldo;
		this.interes = interes;
	}
	//ToString
	
	public String toString() {
		return "Cuenta [numero=" + numero + ", c=" + c + ", saldo=" + saldo + ", interes=" + interes + "]";
	}
	
	//gettersandsetters
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Cliente getC() {
		return c;
	}
	public void setC(Cliente c) {
		this.c = c;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getInteres() {
		return interes;
	}
	public void setInteres(float interes) {
		this.interes = interes;
	}
	public float calcularIngreso(int tope) {
		saldo=c.imprimirSenior(tope)+saldo;//asi se llama el metodo de otra clase
		return saldo;
	}
	public float calcularIngresoV2 (int tope, Cliente c) {//si no tuviera cliente como atributo habria que meterlo como parametro
		saldo=c.imprimirSenior(tope)+saldo;//asi se llama el metodo de otra clase
		return saldo;
	}
}
