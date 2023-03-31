package controleRemoto;

public class ControleRemoto implements Controlador {//ligando com a interface 
	//atributos
	public int volume;
	private boolean ligado;
	private boolean tocando;
	//metodos especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	//Metodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.isLigado()) {
			System.out.println("-------MENU--------");
			System.out.println("Está ligado? " + this.isLigado());
			System.out.println("Está tocando? " + this.isTocando());
			System.out.print("Volume: " + this.getVolume());
			for(int i = 0; i<= this.getVolume(); i+=10) {
				System.out.print("|");
			}
		} else {
			System.out.println("Ligue a TV primeiro");
		}
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu");
	}

	@Override
	public void maisVolume() {
		if(this.isLigado() == true) {
			this.setVolume(getVolume()+5);
		} else {
			System.out.println("Impossível aumentar volume");
		}
	}

	@Override
	public void menosVolume() {
		if(this.isLigado() == true) {
			this.setVolume(getVolume()-5);
		} else {
			System.out.println("Impossível deminuir volume");
		}
	}

	@Override
	public void ativarMudo() {
		if(this.isLigado() == true && this.getVolume()>0) {
			this.setVolume(0);
			System.out.println("MUDO!");
		}
	}

	@Override
	public void desativarMudo() {
		if(this.isLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
			System.out.println("Play");
		}
	}

	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando()) {
			this.setTocando(false);
			System.out.println("Pause");
		}
	}


}
