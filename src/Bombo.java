
import java.util.ArrayList;

public class Bombo {

	private ArrayList<Integer> numeros;

	public Bombo() {
		this.setNumeros(new ArrayList<Integer>());
	}

	public int devolverNumero() {
		int numero = (int) (Math.random() * 90+1);
		while(numeros.contains(numero)) {
			numero = (int) (Math.random() * 90+1);
		}
		numeros.add(numero);
		return numero;

	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

}