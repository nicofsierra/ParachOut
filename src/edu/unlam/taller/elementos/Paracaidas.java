package edu.unlam.taller.elementos;

public class Paracaidas {
	
	private boolean equipado = false;
	
	public void equipar() {
		this.equipado = true;
	}
	
	public boolean estaEquipado() {
		return this.equipado;
	}

}
