package aula07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

	//Propriedades da classe

	public class ControladorCalcular implements ActionListener {
		private JTextArea txtTexto = null;
		private JTextField txtResumo = null;
		
		// metodo construtor da classe
		public ControladorCalcular(JTextArea txtTexto, JTextField txtResumo) {
			super();
			this.txtTexto = txtTexto;
			this.txtResumo = txtResumo;
		}
		
		// metodo implementado da interface
		public void actionPerformed(ActionEvent e) {
			try {txtResumo.setText(SHA256.calcularHash(txtTexto.getText()));
			} catch (Exception erro) {}
		}
}

