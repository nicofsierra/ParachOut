package edu.unlam.taller.state;

import edu.unlam.taller.elementos.Paracaidas;

public class Personaje {
	
	private Integer velocidad = 100;
	private EstadoPersonaje estado = new PersonajeNormal();
	
	public void recojerParacaidas(Paracaidas paracaidas) {
		estado.recojerParacaidas(paracaidas);
	}
	
	public void hit() {
		estado = estado.hit();
	}
	
	public void setVelocidad( Integer velocidad ) {
		this.velocidad = velocidad/2; 
	}

}
