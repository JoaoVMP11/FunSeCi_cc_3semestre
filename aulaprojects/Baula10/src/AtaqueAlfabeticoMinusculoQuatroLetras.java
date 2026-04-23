
public class AtaqueAlfabeticoMinusculoQuatroLetras extends Thread {
	public void run() {
		for (int i = 97; i < 123 ; i++) {
			for (int j = 97; j < 123 ; j++) {
				for (int k = 97; k < 123; k++) {
					for (int l = 97; l < 123; l++) {
						String senha = "" + ((char) i) + ((char) j) + ((char) k) + ((char) l);
						CrackDeSenhas.procurarUsuario(senha);
						
					}
				}
			}

		}
	}
}
