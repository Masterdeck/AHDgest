package Plane;

public class Aviao {
	protected TipoDeAviao tipoDeAviao;
	protected String designacao;
	protected int capacidadeDoDeposito;
	protected int combustivelActual;
	protected int consumo;
	
	public Aviao(TipoDeAviao tipoDeAviao, String designacao, int capacidadeDoDeposito, int combustivelActual,
			int consumo) {
		this.tipoDeAviao = tipoDeAviao;
		this.designacao = designacao;
		this.capacidadeDoDeposito = capacidadeDoDeposito;
		this.combustivelActual = combustivelActual;
		this.consumo = consumo;
	}

	public TipoDeAviao getTipoDeAviao(){
		return tipoDeAviao;
	}
	
	public String getDesignacao() {
		return designacao;
	}

	public int getCapacidadeDoDeposito() {
		return capacidadeDoDeposito;
	}

	public int getCombustivelActual() {
		return combustivelActual;
	}

	public int getConsumo() {
		return consumo;
	}

	@Override
	public String toString() {
		return "Aviao [designacao=" + designacao + ", capacidadeDoDeposito="
				+ capacidadeDoDeposito + ", combustivelActual=" + combustivelActual + ", consumo=" + consumo + "]";
	}
		
	
}
