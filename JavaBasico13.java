package JavaLabs2;

import java.util.Scanner;

public class JavaBasico13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreve 3 numeros");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt(); 
		int num3 = scan.nextInt();
		
		if(num1 > num2 & num1 > num3) {
			System.out.println("O numero " + num1+ " é o maior");
		}else if(num2 > num1 || num2 > num3) {
			System.out.println("O numero " + num2 + " é o maior");
		}else {
			System.out.println("O numero " + num3 + " é o maior");
		}
	}

}
