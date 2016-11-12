
public class Cliente {

	public Cliente() {
		InterfaceGrafico janela = new InterfaceGrafico(this);
		janela.open();
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
	}

}
