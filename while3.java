package while_atividade;

import java.util.Scanner;
import java.text.DecimalFormat;

public class while3 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		DecimalFormat d = new DecimalFormat("R$ ##,00");
		
		double totalPC = 0;
		double totalPV = 0;
		double lucro = 0;
		int contaMaior20 = 0;
		int contaMaior10 = 0;
		int contaMaior1020 = 0;
		
		System.out.println("Calcular nova mercadoria? Digite X para terminar ");
		String merc =  s.next();
		while(!merc.equalsIgnoreCase("X")){
			System.out.println("Informe o preço da mercadoria: ");
			double prC = s.nextDouble();
			totalPC += prC;
			
			System.out.println("Informe o preço de venda: ");
			double prV = s.nextDouble();
			totalPV += prV;
			
		
			lucro = ((prV - prC)/ prV)*100;
			System.out.println(lucro+"%");
			
			if(lucro > 20)
				contaMaior20++;
			else
				if(lucro > 10)
					contaMaior1020++;
				else
					contaMaior10++;

		System.out.println("Calcular nova mercadoria? Digite X para terminar ");
		merc =  s.next();
		}
		
		System.out.println("Total preços de compra: " + d.format(totalPC));
		System.out.println("Total preços de venda: " + d.format(totalPV));
		System.out.println("Total lucro: "+ d.format(lucro));
		System.out.println("Mercadoria com lucro menor 10%: "+ contaMaior10);
		System.out.println("Mercadoria com lucro menor 20%: "+ contaMaior20);
		System.out.println("Mercadoria com lucro menor entre 10% e 20%: "+ contaMaior1020);
		
	}
}
