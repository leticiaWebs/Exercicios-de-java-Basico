package JavaLabs2;

import java.util.Scanner;

public class JavaBasico9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("escreva dois numeros"); 
        
       int num_1 = scan.nextInt(); 
       int num_2 = scan.nextInt(); 
       
       if(num_1 > num_2) {
    	   System.out.println("O maior numero digitado é " + num_1); 
       }else {
    	   System.out.println("O maior numero digitado é" + num_2);
       }
        
	}

}
