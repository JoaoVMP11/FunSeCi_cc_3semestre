package baula6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class DES {
	private static String encriptar(String texto, String chave) throws Exception {
		Cipher objCifra = Cipher.getInstance("DESede");
		SecretKey objChave = new SecretKeySpec(chave.getBytes("UTF-8"), "DESede");
		objCifra.init(Cipher.ENCRYPT_MODE, objChave);
		byte[] vetor = objCifra.doFinal(texto.getBytes("UTF-8"));
		return Base64.getEncoder().encodeToString(vetor);
	}
	
	private static String decriptar(String cifra, String chave) throws Exception{
		Cipher objCifra = Cipher.getInstance("DESede");
		SecretKey objChave = new SecretKeySpec(chave.getBytes("UTF-8"), "DESede");
		objCifra.init(Cipher.DECRYPT_MODE, objChave);
		byte[] vetor = objCifra.doFinal(Base64.getDecoder().decode(cifra));
		return new String(vetor, "UTF-8");
	}
	
	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			System.out.print("digite um texto: ");
			String texto = leitor.readLine();
			
			System.out.print("Digite uma chave: ");
			String chave = leitor.readLine();
			
			String cifra = encriptar(texto, chave);
			
			System.out.println(cifra);
			System.out.println(decriptar(cifra, chave));
			
		} catch (Exception erro) {
			System.out.println(erro);
		}
	}
}
