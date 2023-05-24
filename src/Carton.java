import java.util.HashMap;

public class Carton {

	private String nombre;

	private HashMap<Integer, Boolean> cartonNumeros;

	public Carton(String nombre, HashMap<Integer, Boolean> cartonNumeros) {
		super();
		this.nombre = nombre;
		this.cartonNumeros = cartonNumeros;
	}

	public Carton(String nombre) {
		this.nombre = nombre;
		this.cartonNumeros = new HashMap<Integer, Boolean>();
		for (int i = 1; i <= 9; i++) {
			int limiteInferior = (i * 10) - 9;
			int limiteSuperior = (i * 10);
			int numero1 = (int) (Math.random() * (limiteInferior - limiteSuperior) + limiteSuperior);
			cartonNumeros.put(numero1, false);
			int numero2 = (int) (Math.random() * (limiteInferior - limiteSuperior) + limiteSuperior);
			while (numero1 == numero2) {
				numero2 = (int) (Math.random() * (limiteInferior - limiteSuperior) + limiteSuperior);

			}
			cartonNumeros.put(numero2, false);
		}

	}

	public void tacharNumero(int numero) {
		if (cartonNumeros.containsKey(numero)) {
			cartonNumeros.put(numero, true);
		}
	}
	public boolean esGanador() {
		return !cartonNumeros.containsValue(false);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Integer, Boolean> getCartonNumeros() {
		return cartonNumeros;
	}

	public void setCartonNumeros(HashMap<Integer, Boolean> cartonNumeros) {
		this.cartonNumeros = cartonNumeros;
	}

	@Override
	public String toString() {
		return "Carton [nombre=" + nombre + ", cartonNumeros=" + cartonNumeros + "]";
	}

}
