package JavaLabs2;

import java.util.Scanner;

public class JavaBasico17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o salrio mensal");
		
		double salario = scan.nextDouble();
		System.out.println("O valor do seu salario atual é" + salario);
		int percentual = 0;
		if(salario <= 280) {
			percentual = 20; 
		}else if(salario >= 280 && salario <= 700 ) {
			percentual = 15;
			
		}else if( salario >= 700 && salario <= 1500 ) {
			percentual = 10; 
			
		}else if (salario > 1500 ) {
			percentual = 5; 
			
		}
		
		double aumento = (salario /100) * percentual;
		double novoSalario = salario + aumento; 
		
		System.out.println("O valor do reajuste é R$"+ percentual); 
		System.out.println("O valor do aumento é " + aumento + "%");
		System.out.println("O valor do novo salario será R$"+ novoSalario);

	}
	

}
