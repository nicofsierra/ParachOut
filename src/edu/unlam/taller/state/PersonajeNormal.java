package edu.unlam.taller.state;


public class PersonajeNormal extends EstadoPersonaje {

	@Override
	public EstadoPersonaje hit() {
		return new PersonajeMuerto(); // ver el tema de las vidas
	}

}
