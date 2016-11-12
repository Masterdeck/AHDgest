package Plane;

public class AviaoMedico extends Aviao {

	public AviaoMedico(String designacao, int capacidadeDoDeposito, int combustivelActual, int consumo) {
		super(TipoDeAviao.MEDICO, designacao, capacidadeDoDeposito, combustivelActual, consumo);
	}
	
	public String toString() {
		return "Aviao Medico: " + designacao + " " + capacidadeDoDeposito
				+ " " + combustivelActual + " " + consumo;

	}

}
