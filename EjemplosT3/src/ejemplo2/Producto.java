package ejemplo2;

public class Producto {
	//atributos
	private double precio=0;
	private String nombre;
	
	//constructor
	public Producto (double precio, String nombre) {
		this.precio=precio;
		this.nombre=nombre;
	}
	//getters and setters
	public String getNombre (){
		return nombre;
		}
		public void setNombre (String nombre){
			this.nombre=nombre;
		}
		public double getPrecio (){
			return precio;
			}
			public void setPrecio (double precio){
				this.precio=precio;
			}
		
			//toString
			/*Nos devuelve una cadena con el valor de todos los atributos de todos los métodos.
			pulsamos source
			pulsamos generar toString 
			y despues le damos a generar*/
			@Override
			public String toString() {
				return "Producto [precio=" + precio + ", nombre=" + nombre + "]";
			}


}
