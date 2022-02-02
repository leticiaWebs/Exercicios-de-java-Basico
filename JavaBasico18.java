package JavaLabs2;

import java.util.Scanner;

public class JavaBasico18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		System.out.println("Insira a quantidade de horas trabalhadas ");
		double horas   = scan.nextDouble();
		System.out.println("Insira o valor pela hora trabalhada ");
		double valor   = scan.nextDouble();
		double  salario = horas * valor; 
		System.out.println("O valor do salario bruto");
		double sindicato = 0; 
		double fgts = 0; 
		double ir = 0; 
		double inss = 0; 
		if(salario <= 900) {
			sindicato = 3;
			fgts = 11;
			ir = 0;
			inss = 10; 
		}else if(salario <= 1500) {
			sindicato = 3;
			fgts = 11;
			ir = 5;
			inss = 10;
		}else if(salario <= 2500) {
			sindicato = 3;
			fgts = 11;
			ir = 10;
			inss = 10;
		}else if (salario >= 2500) {
			sindicato = 3;
			fgts = 11;
			ir = 20;
			inss = 10;
		}
		double descontoir = (salario /100) * ir;
		double descontoInss = (salario / 100) * inss; 
		double descontoFgts = (salario / 100) * fgts; 
		double descontoSindicato = (salario / 100) *sindicato;
		double TotaldeDescontos = descontoir + descontoInss + descontoFgts + descontoSindicato; 
		double SalarioLiquido = salario -TotaldeDescontos; 
		
		System.out.println("Desconto IR (5%) = "+ descontoir);
		System.out.println("Desconto  INSS (10%) = "+ descontoInss);
		System.out.println("Desconto FGTS (11%) = "+ descontoFgts);
		System.out.println("Desconto Total de desconto  = "+ TotaldeDescontos);
		System.out.println("Salario Liquido  = "+ SalarioLiquido);
		
		
		
		

	}

}
