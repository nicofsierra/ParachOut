

public class Paracaidas {
	private static int maxParacaidas = 10;//cantidad maxima de vidas que puede tener
	private int cant;
	
	public Paracaidas() {
		cant = 3; //cantidad inicial de vidas, se vera
	}
	
	public void equipar() {
		if(cant < maxParacaidas) {
			cant++; //no dejamos que se pase del limite
		}
	}
	
	public void desequipar() {
		if(cant == 1) {
			throw new RuntimeException("No se puede tener 0 paracaidas");//deberia estar muerto
		}
		
		cant--;
	}
	
	public int equipos() {
		return cant;
	}
	
}
