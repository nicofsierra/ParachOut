package edu.unlam.taller.state;

public class PersonajeLento extends EstadoPersonaje {

	private int duracion = 10;

	@Override
	public EstadoPersonaje hit() {
		return new PersonajeNormal();
	}

}
