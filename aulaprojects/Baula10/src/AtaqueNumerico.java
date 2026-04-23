
public class AtaqueNumerico extends Thread {
	public void run() {
		for (int i = 0; i < 1000000000 ; i++) {
			String senha = "" + i;
			CrackDeSenhas.procurarUsuario(senha);
		}
	}
}
