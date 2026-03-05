package Baula04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearFeedbackShiftRegister {
	private static void inicializar(boolean[] registrador, String chave) {
	
		// Pegar uma  letra de cada vez
		for (int i = 0; i < 4 ; i++) {
			// Pega o decimal que representa o char na posicao i da string chave
			int decimal = chave.charAt(i);
			// Pega o numero decimal e transforma ele em uma string de 0 e 1
			String binario = Integer.toBinaryString(decimal);
			
			// varre o binario (que possui 8 bits)
			for (int j = 0; j < (8 - binario.length()) ; j++) {
				binario = ("0" + binario);
			}
			
			for (int j = 0; j < 8; j++) {
				
				registrador[j + (8 * i)] = (binario.charAt(j) == '1');
			}
		}
		
	}
	
	private static boolean rotacionar(boolean[] registrador, boolean tipo) {
		boolean retorno = registrador [0];
		
		boolean novoBit = retorno;
		if (! tipo) {
			novoBit = (novoBit ^ registrador[31] ^ registrador[6]
					 ^ registrador[4]  ^ registrador[2]
					 ^ registrador[1]  ^ registrador[0]);
		} else {
			novoBit = (novoBit ^ registrador[31] ^ registrador[6]
					 ^ registrador[5]  ^ registrador[1]);
		}
		
		for (int i = 0 ; (i < registrador.length - 1); i++) {
			registrador[i] = registrador[i + 1];
			
		}
		registrador[31] = novoBit;
			return retorno;
	}
	
	public static void main(String[] args) {
		// Declaraçao de variaveis
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(System.in));
		boolean[] cabeca = new boolean[32];
		boolean[] registrador0 = new boolean[32];
		boolean[] registrador1 = new boolean[32];
		
		// Entrada de dados
		try {
			System.out.print("Digite 4 letras da chave; ");
			inicializar(cabeca, leitor.readLine());
			
			System.out.print("Digite 4 letras da chave; ");
			inicializar(registrador0, leitor.readLine());
			
			System.out.print("Digite 4 letras da chave; ");
			inicializar(registrador1, leitor.readLine());
		} catch (Exception e) {}
		
		// Processamento
		
		String letra = "";
		while (true) {
			boolean bit0 = registrador0[0];
			boolean bit1 = registrador1[0];

			if (! rotacionar(cabeca, false)) {
				bit0 = rotacionar(registrador0, false);
			} else {
				bit1 = rotacionar(registrador1, true);
			}
			letra += ((bit0 ^ bit1) ? "1" : "0");
			
			if (letra.length() == 8) {
				System.out.print((char) Integer.parseInt(letra, 2));
				letra = "";		}
		}
	}
	

}
