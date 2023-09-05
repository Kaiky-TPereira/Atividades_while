package ativ_while;

import java.util.*;

import java.text.*;

public class while7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("R$ #0.00");
		
		int numero = 1000;
		
		while(numero < 9999) {
			numero++;
			
				int dezporcento = numero / 100;
				
				int resto =  numero % 100  ;
				
				int dezresto = dezporcento + resto;
				
				int numeroquadrado = dezresto * dezresto;
				
				if(numero == numeroquadrado) {
					System.out.println("Valores legais: "+numeroquadrado);
				}
				
					
			}
			
	}
}