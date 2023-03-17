package ejercicio8;


	import java.util.Arrays;
	import java.util.Random;
	public class Sorteo {
		//atributos
		int numCli[];
		int numGan[];
		public Sorteo(int[] numCli, int[] numGan) {
			this.numCli = numCli;
			this.numGan = numGan;
		}
		public int[] getNumCli() {
			return numCli;
		}
		public void setNumCli(int[] numCli) {
			this.numCli = numCli;
		}
		public int[] getNumGan() {
			return numGan;
		}
		public void setNumGan(int[] numGan) {
			this.numGan = numGan;
		}
		@Override
		public String toString() {
			return "Sorteo [NumCli=" + Arrays.toString(numCli) + ", numGan=" + Arrays.toString(numGan) + "]";
		}
		public void GenerarNumGan () {
			int tam=6, desde=0, hasta=9;
			Random num= new Random (System.nanoTime());
			for (int i=0; i<tam; i++) {
				numGan[i]=num.nextInt(hasta-desde+1)-desde;
				
			}
			
		}
		public boolean comparar () {
			int tam=6;
			for(int i=0; i<tam; i++)
			if (numGan[i]==numCli[i]) {
				return true;
			}else {
				return false;
			}
		}

	
}
