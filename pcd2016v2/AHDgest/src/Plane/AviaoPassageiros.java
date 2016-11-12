package Plane;

public class AviaoPassageiros extends Aviao {

	private int lotacaoMaxima;
	
	public AviaoPassageiros(String designacao, int capacidadeDoDeposito, int combustivelActual,
			int consumo, int lotacaoMaxima) {
		super(TipoDeAviao.PASSAGEIROS, designacao, capacidadeDoDeposito, combustivelActual, consumo);
		this.lotacaoMaxima = lotacaoMaxima;
	}
	
	public int getLotacaoMaxima() {
		return lotacaoMaxima;
	}


	public String toString() {
		return "Aviao Passageiros: " + designacao + " " + capacidadeDoDeposito + " " + combustivelActual + " " + consumo
				+ " " + lotacaoMaxima;
	}
	
}
