package br.com.aula7a;

public abstract class Item {

	private int posX;
	private int posY;
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public abstract void pegar();

}
