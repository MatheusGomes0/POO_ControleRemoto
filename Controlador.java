package controleRemoto;

public interface Controlador {
	//metodos abstratos
	public abstract void ligar();
	public abstract void desligar();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ativarMudo();
	public abstract void desativarMudo();
	public abstract void play();
	public abstract void pause();
}
