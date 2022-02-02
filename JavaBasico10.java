package JavaLabs2;

import java.util.Scanner;

public class JavaBasico10 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite um numero");
		 double num_1 = scan.nextDouble();
		 
		 if(num_1 < 0 ) {
			 System.out.println(num_1+ " Este numero é negativo");
		 }else {
			 System.out.println(num_1 +" Este numero é positivo");
		 }
		 
		 

	}

}
