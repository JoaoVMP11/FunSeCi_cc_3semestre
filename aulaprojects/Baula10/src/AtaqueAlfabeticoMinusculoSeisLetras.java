
public class AtaqueAlfabeticoMinusculoSeisLetras extends Thread {
	public void run() {
		for (int i = 97; i < 123 ; i++) {
			for (int j = 97; j < 123 ; j++) {
				for (int k = 97; k < 123; k++) {
					for (int l = 97; l < 123; l++) {
						for (int m = 97; m < 123; m++) {
							for (int n = 97; n < 123; n++) {
								
								String senha = "" + ((char) i) + ((char) j) + ((char) k) + ((char) l) + ((char) m) + ((char) n);
								CrackDeSenhas.procurarUsuario(senha);
						
							}
						}
					}
				}
			}

		}
	}

}
