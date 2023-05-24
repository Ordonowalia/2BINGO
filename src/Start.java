
public class Start {

	public static void main(String[] args) {

		Carton pepe = new Carton("pepe");
		Carton juan = new Carton("juan");
		Carton rubo = new Carton("pringao");
		Carton javi = new Carton("javi");
		Carton wa = new Carton("wa");
		boolean hayGanador = false;

		Bombo partida = new Bombo();
		while (!hayGanador) {
			int numero=partida.devolverNumero();
			pepe.tacharNumero(numero);
			juan.tacharNumero(numero);
			rubo.tacharNumero(numero);
			javi.tacharNumero(numero);
			wa.tacharNumero(numero);
			if(pepe.esGanador()) {
				System.out.println("el ganador es:"+pepe.getNombre());
				hayGanador = true;
			}
			if(juan.esGanador()) {
				System.out.println("el ganador es:"+juan.getNombre());
				hayGanador = true;
			}
			if(rubo.esGanador()) {
				System.out.println("el ganador es:"+rubo.getNombre());
				hayGanador = true;
			}
			if(javi.esGanador()) {
				System.out.println("el ganador es:"+javi.getNombre());
				hayGanador = true;
			}
			if(wa.esGanador()) {
				System.out.println("el ganador es:"+wa.getNombre());
				hayGanador = true;
			}
			
		}
	}

}
