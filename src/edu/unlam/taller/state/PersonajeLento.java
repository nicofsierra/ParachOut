package edu.unlam.taller.state;

public class PersonajeLento extends EstadoPersonaje{

	private Integer duracion = 10;
	
	@Override
	public EstadoPersonaje hit() {
		return new PersonajeNormal();
	}
	
}
