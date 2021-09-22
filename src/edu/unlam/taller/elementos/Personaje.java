
public class Personaje {

	private int velocidad;
	private EstadoPersonaje estado;
	private Paracaidas paracaidas;

	public Personaje() {

		velocidad = 100;
		estado = new PersonajeNormal();
		paracaidas = new Paracaidas();
	}

	public void recojerParacaidas() {
		paracaidas.equipar();
	}

	public void hit() {

		if (estaMuerto()) {
			throw new RuntimeException("Personaje ya muerto, no se deberia poder golpear");
		}
		// como era lento, le dividi por dos la velocidad, ahora la multiplico por 2
		// para revertir cambios
		if (estado.getClass().equals(new PersonajeLento().getClass())) {
			velocidad *= 2;
			// pasa a personaje normal
			estado = estado.hit();
			return;
		}

		// paracaidas funcionando como para aguantar el golpe
		if (paracaidas.equipos() > 1) {
			paracaidas.desequipar();
		} else {
			estado = estado.hit(); // muere
		}

	}

	public void enlentecer() {
		// cuando enlentece, lo hace por la mitad,
		// pero el factor puede cambiar
		velocidad /= 2;
		estado = new PersonajeLento();
	}

	public boolean estaMuerto() {
		return estado.getClass().equals(new PersonajeMuerto().getClass());
	}

}
