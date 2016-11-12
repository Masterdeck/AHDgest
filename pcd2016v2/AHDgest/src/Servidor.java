import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;

import Plane.Aviao;
import Plane.AviaoCarga;
import Plane.AviaoMedico;
import Plane.AviaoPassageiros;
import Plane.TipoDeAviao;

public class Servidor {
	private ArrayList<Aviao> listaDeAvioes = new ArrayList<>();
	public Servidor() {
		InterfaceGrafico janela = new InterfaceGrafico(this);
		janela.open();
	}

	public void carregaListaDeAvioesDoFicheiro(DefaultListModel<String> listModel) {

		Scanner file = null;
		try {
			file = new Scanner(new BufferedReader(new FileReader("PlanoVoo.txt")));

			while (file.hasNext()) {
				String str = file.nextLine();
				listModel.addElement(str);
				criaAviao(str.charAt(0), str);

			}
		//###########################
			for (Aviao aviao : listaDeAvioes) {
				if (aviao.getTipoDeAviao().equals(TipoDeAviao.MEDICO)) 
				{
					System.out.println(aviao + " sou o aviao medico");
				}

			}
			
		//###########################

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	private void criaAviao(char c, String str) {
		ArrayList<String> arrayCaracteristicasAviao = new ArrayList<String>();

		for (String parametro : str.split(" ")) {
			arrayCaracteristicasAviao.add(parametro);
		}

		switch (c) {
		case 'U':
			AviaoMedico aviaoM = new AviaoMedico(arrayCaracteristicasAviao.get(0),
					Integer.parseInt(arrayCaracteristicasAviao.get(1)),
					Integer.parseInt(arrayCaracteristicasAviao.get(2)),
					Integer.parseInt(arrayCaracteristicasAviao.get(3)));
			listaDeAvioes.add(aviaoM);
			System.out.println(aviaoM);
			break;
		case 'C':
			AviaoCarga aviaoC = new AviaoCarga(arrayCaracteristicasAviao.get(0),
					Integer.parseInt(arrayCaracteristicasAviao.get(1)),
					Integer.parseInt(arrayCaracteristicasAviao.get(2)),
					Integer.parseInt(arrayCaracteristicasAviao.get(3)),
					Integer.parseInt(arrayCaracteristicasAviao.get(4)));
			listaDeAvioes.add(aviaoC);
			System.out.println(aviaoC);
			break;
		case 'P':
			AviaoPassageiros aviaoP = new AviaoPassageiros(arrayCaracteristicasAviao.get(0),
					Integer.parseInt(arrayCaracteristicasAviao.get(1)),
					Integer.parseInt(arrayCaracteristicasAviao.get(2)),
					Integer.parseInt(arrayCaracteristicasAviao.get(3)),
					Integer.parseInt(arrayCaracteristicasAviao.get(4)));
			listaDeAvioes.add(aviaoP);
			System.out.println(aviaoP);
			break;

		default:
			break;
		}

	}
	
	public static void main(String[] args) {
		Servidor servidor = new Servidor();

	}

}
