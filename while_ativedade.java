package while_atividade;

import java.util.Scanner;

public class while_ativedade {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
	
	System.out.println("Informe um valor? S/N ");
	String resposta = s.next();
	
	int soma = 0;
	String resp = s.next();
	
	while(resp.equalsIgnoreCase("S")) {
		System.out.println("Informe um valor");
		int valor = s.nextInt();
		soma += valor;
		
		System.out.println("Informe valor? S/N");
		resp = s.next();
	}
	
	System.out.println("Soma " + soma);
	
	}

}
