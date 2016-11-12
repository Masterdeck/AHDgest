package Plane;

public class AviaoCarga extends Aviao {
	
	protected int tonelagem;

	public AviaoCarga(String designacao, int capacidadeDoDeposito, int combustivelActual,
			int consumo, int tonelagem) {
		super(TipoDeAviao.CARGA, designacao, capacidadeDoDeposito, combustivelActual, consumo);
		this.tonelagem = tonelagem;
	}
	
	public int getTonelagem() {
		return tonelagem;
	}

	public String toString() {
		return "Aviao Carga: " + designacao + " " + capacidadeDoDeposito + " " + combustivelActual + " " + consumo + " "
				+ tonelagem;
	}
	
}
