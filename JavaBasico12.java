package JavaLabs2;

import java.util.Scanner;

public class JavaBasico12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
        System.out.println("Insira as notas parciais");
        
        double notaA = scan.nextDouble(); 
        double notaB = scan.nextDouble(); 
        
        double calcMedia = (notaA + notaB)/2; 
 
        if(calcMedia >= 7 & calcMedia <= 10) {
        	System.out.println("Aprovado" + calcMedia);     	
        }else if(calcMedia < 7 ) {
        	System.out.println("Reprovado"); 
        }else if(calcMedia >= 10) {
        	System.out.println("Aprovado com distinção"); 
        }
        
        
        }
	}


