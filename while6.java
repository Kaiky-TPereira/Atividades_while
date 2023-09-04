package ativ_while;

import java.util.*;

import java.text.*;

public class while6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("R$ #0.00");
		
		System.out.println("Deseja começar? Insira o X para finalizar.");
		String iniciar =  s.next();
		
		int numero_quant =0;
		
		while(!iniciar.equalsIgnoreCase("X")){
			numero_quant =0;
			
		System.out.println("Digite um número: ");
		double numero = s.nextDouble();
		
		int impar = 1;
		
		while(numero != 0) {
			
			numero = numero - impar;
			numero_quant = numero_quant + 1;
			impar = impar + 2;
			
			if(numero == 1 || numero < 0) {
				System.out.println("Essa raiz é inváida");
				break;
			}
				else
					if(numero == 0) {
						System.out.println("O valor da raiz é: "+ numero_quant);
					}
			
			
		}
		
		
		System.out.println("Deseja começar? Insira o X para finalizar.");
		iniciar =  s.next();
		
		
		}
		
			System.out.println("\nFIM");

	}
	
	}
