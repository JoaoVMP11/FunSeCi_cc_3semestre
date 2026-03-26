package aula07;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Visao extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JTextArea txtTexto = new JTextArea();
	private JScrollPane jspTexto = new JScrollPane(txtTexto);
	
	private JTextField txtResumo = new JTextField();
	
	private JButton btnCalcular = new JButton("Calcular");
	
	public static void main(String[] args) {
		
	new Visao().setVisible(true);
		
	}
	
	//metodo construtor da classe
	
	public Visao() {
		
		setTitle("Calculo de Resumo Unidirecional SHA-256");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Configuraçao da area de texto
		 jspTexto.setBounds(10, 10, 465, 280);
		 add(jspTexto);
		 txtTexto.setLineWrap(true);
		 
		 //Configuraçao da área de resumo
		 txtResumo.setBounds(10, 300, 465, 20);
		 add(txtResumo);
		 
		 // Configuracao do botao de calcular
		 btnCalcular.setBounds(190, 330, 100, 20);
		 add(btnCalcular);
		 btnCalcular.addActionListener(new ControladorCalcular(txtTexto, txtResumo));
		 
		 
	}

}
