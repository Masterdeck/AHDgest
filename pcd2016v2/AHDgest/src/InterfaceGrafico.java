import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InterfaceGrafico {
	
	private JFrame frame;
	private Servidor servidor;
	private Cliente cliente;

	public InterfaceGrafico(Servidor servidor) {
		

		
		frame = new JFrame("Servidor");
	

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		DefaultListModel<String> listModel = new DefaultListModel<String>();

		JPanel painellLista = new JPanel();
		painellLista.setLayout(new BorderLayout());
		JLabel avioesEmEspera = new JLabel("Aviões em espera");
		painellLista.add(avioesEmEspera, BorderLayout.NORTH);
		JList<String> listaDeAvioes = new JList<String>(listModel);
		painellLista.add(listaDeAvioes, BorderLayout.CENTER);
		frame.add(painellLista, BorderLayout.CENTER);
		servidor.carregaListaDeAvioesDoFicheiro(listModel);
		
		
		JPanel painelPistas = new JPanel();
		painelPistas.setLayout(new GridLayout(7, 1));
		JLabel Pistas = new JLabel("Pistas");
		painelPistas.add(Pistas);
		JLabel Pista_1 = new JLabel("Pista 1");
		painelPistas.add(Pista_1);
		JTextField Pista1Text = new JTextField();
		painelPistas.add(Pista1Text);
		JCheckBox aberta1 = new JCheckBox("aberta");
		aberta1.setEnabled(false);
		painelPistas.add(aberta1);
		JLabel Pista_2 = new JLabel("Pista 2");
		painelPistas.add(Pista_2);
		JTextField Pista2Text = new JTextField();
		painelPistas.add(Pista2Text);
		JCheckBox aberta2 = new JCheckBox("aberta");
		aberta2.setEnabled(false);
		painelPistas.add(aberta2);
		frame.add(painelPistas, BorderLayout.EAST);
		
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.setLayout(new GridLayout(3,1));
		JLabel PistasEmFuncionamento = new JLabel("Pistas em funcionamento:");
		painelBotoes.add(PistasEmFuncionamento);
		JButton Pista1Btn = new JButton("Pista 1");
		painelBotoes.add(Pista1Btn);
		JButton Pista2Btn = new JButton("Pista 2");
		painelBotoes.add(Pista2Btn);
		frame.add(painelBotoes, BorderLayout.SOUTH);
		
		frame.setSize(500, 400);
		

		
	}

	
	public InterfaceGrafico(Cliente cliente) {
	
			frame = new JFrame("Consola Remota");
		

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		DefaultListModel<String> listModel = new DefaultListModel<String>();

		JPanel painellLista = new JPanel();
		painellLista.setLayout(new BorderLayout());
		JLabel avioesEmEspera = new JLabel("Aviões em espera");
		painellLista.add(avioesEmEspera, BorderLayout.NORTH);
		JList<String> listaDeAvioes = new JList<String>(listModel);
		painellLista.add(listaDeAvioes, BorderLayout.CENTER);
		frame.add(painellLista, BorderLayout.CENTER);
		
		
		
		JPanel painelPistas = new JPanel();
		painelPistas.setLayout(new GridLayout(7, 1));
		JLabel Pistas = new JLabel("Pistas");
		painelPistas.add(Pistas);
		JLabel Pista_1 = new JLabel("Pista 1");
		painelPistas.add(Pista_1);
		JTextField Pista1Text = new JTextField();
		painelPistas.add(Pista1Text);
		JCheckBox aberta1 = new JCheckBox("aberta");
		aberta1.setEnabled(false);
		painelPistas.add(aberta1);
		JLabel Pista_2 = new JLabel("Pista 2");
		painelPistas.add(Pista_2);
		JTextField Pista2Text = new JTextField();
		painelPistas.add(Pista2Text);
		JCheckBox aberta2 = new JCheckBox("aberta");
		aberta2.setEnabled(false);
		painelPistas.add(aberta2);
		frame.add(painelPistas, BorderLayout.EAST);
		
		frame.setSize(400, 300);
	}
	
	

	public void open() {
		frame.setVisible(true);
	}
}
