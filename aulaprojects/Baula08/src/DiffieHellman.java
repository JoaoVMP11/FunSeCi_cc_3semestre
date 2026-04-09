import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DiffieHellman {
	private static final BigInteger PRIMO = new BigInteger("102031405123416071809152453627382938465749676859789");
	private static final BigInteger BASE = new BigInteger("1234567890123456789012345");
	
	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(
				new InputStreamReader(System.in));
		
		try {
			System.out.print("Escolha a sua chave secreta: ");
			BigInteger chaveSecreta = new BigInteger(leitor.readLine());
			
			BigInteger chavePublica = BASE.modPow(chaveSecreta, PRIMO);
			System.out.println(chavePublica);
			
			System.out.print("Digite a chave publica do comunicante: ");
			BigInteger chaveComunicante = new BigInteger(leitor.readLine());
			
			BigInteger chaveCompartilhada = chaveComunicante.modPow(chaveSecreta, PRIMO);
			System.out.println(chaveCompartilhada);
			
			} catch (Exception e) {}
	}
}
