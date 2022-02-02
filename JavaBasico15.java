package JavaLabs2;

import java.util.Scanner;

public class JavaBasico15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira 3 numeros"); 
		int num1  = scan.nextInt(); 
		int num2 = scan.nextInt(); 
		int num3 = scan.nextInt(); 
		
		if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
			System.out.println(num3 + "-" + num2 + "-" +num1); 
		}else if(num1 <= num2 && num1 <= num3 && num3 <= num2) {
			System.out.println(num2 + "-" + num3 + "-" + num1);
		}else if(num2 <= num1 && num2 <= num3 && num1 <= num3) {
			System.out.println(num3 + "-" + num1 + "-" + num2);
		}
	}

}
