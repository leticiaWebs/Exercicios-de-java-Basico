package JavaLabs2;

import java.util.Scanner;

public class JavaBasico14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Insira o valor dos produtos");
		
		double produto1 = scan.nextDouble();
		double produto2 = scan.nextDouble(); 
		double produto3 = scan.nextDouble(); 
		
		if(produto1 < produto2 & produto1 < produto3) {
			System.out.println("Compre o produto pelo valor de R$" + produto1);
		}else if(produto2 < produto1 & produto2 < produto3 ){
			System.out.println("compre o produto 2 pelo valor de R$" + produto2);			
		}else {
			System.out.println("compre o produto 3 pelo valor de R$" + produto3);
		}
	}

}
