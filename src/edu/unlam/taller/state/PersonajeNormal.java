package edu.unlam.taller.state;

import edu.unlam.taller.elementos.Paracaidas;

public class PersonajeNormal extends EstadoPersonaje{

	@Override
	public EstadoPersonaje hit() {
		return new PersonajeMuerto(); // ver el tema de las vidas
	}
	
	@Override
	public void recojerParacaidas(Paracaidas paracaidas) {
		
	}

}
