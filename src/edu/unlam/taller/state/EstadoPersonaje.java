package edu.unlam.taller.state;

import edu.unlam.taller.elementos.Paracaidas;

public abstract class EstadoPersonaje {
	
	public EstadoPersonaje hit() {
		return this;
	}

	public void recojerParacaidas(Paracaidas paracaidas) {
		paracaidas.equipar();
	}
	
	

}
