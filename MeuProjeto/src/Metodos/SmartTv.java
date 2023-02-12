package Metodos;

public class SmartTv {

	boolean ligada=false;
	int canal = 1;
	int volume = 25;
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	public void aumentarCanal() {
		canal++;
	}
	public void dominuirCanal() {
		canal--;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("aumentando o volume para: "+volume);
	}
	public void diminuirVolume() {
		volume--;
		System.out.println("diminuindo o volume para: "+volume);
	}
	public void ligar() {
		ligada = true;
		
	}
	void desligar() {
		ligada = false;
	}
}
