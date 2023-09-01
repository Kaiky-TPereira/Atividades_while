package while_atividade;

import java.util.*;

import java.text.*;

public class while4 {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("R$ #0.00");
		
		
		System.out.println("Adicionar um novo curso? Insira o X para finalizar.");
		String merc =  s.next();
		
		double cod_Curso = 0;
		double num_vagas = 0;
		double num_vagas_fem = 0;
		double num_vagas_masc = 0;
		double per_fem = 0;
		double per_masc = 0;
		
		while(!merc.equalsIgnoreCase("X")){
		System.out.println("Insira o código do curso: ");
		 cod_Curso = s.nextDouble();
		
		System.out.println("Insira o números de vagas: ");
		 num_vagas = s.nextDouble();
		
		System.out.println("Insira o número de vagas femeninas: ");
		 num_vagas_fem = s.nextDouble();
		
		System.out.println("Insira o número de vagas masculinas: ");
		 num_vagas_masc = s.nextDouble();
		
		System.out.println("Adicionar um novo curso? Insira o X para finalizar.");
		 merc =  s.next();
		
		 per_fem = ((num_vagas - num_vagas_fem)/ num_vagas)*100;
			System.out.println(per_fem+"%");
			
			 per_masc = ((num_vagas - num_vagas_masc)/ num_vagas)*100;
				System.out.println(per_fem+"%");
		}

		
		
		System.out.println("Preenchidas "+ num_vagas+ " vagas");
		System.out.println("Preenchidas "+ num_vagas_fem+ " vagas femininas com o percential de "+ per_fem+ "%");
		System.out.println("Preenchidas "+ num_vagas_masc + " vagas masculinas com o percential de "+ per_masc+ "%");
		
		if(num_vagas_fem > num_vagas_masc){
			System.out.println("Exixtem mais vagas femininas");
		}
			else
				if(num_vagas_masc > num_vagas_fem) {
					System.out.println("Exixtem mais vagas masculinas");
				}
				else {
					System.out.println("Exixtem vagas iguais entre ambos os gêneros.");
				}
			
		
		}

	}

