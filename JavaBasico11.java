package JavaLabs2;

import java.util.Scanner;

public class JavaBasico11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a letra correspondente ao seu sexo, M(masculino) F(feminino)"); 
		
		String sexo = scan.nextLine();
		
		if(sexo.equalsIgnoreCase("m")){
			System.out.println("Sexo Masculino");		
		}else if(sexo.equalsIgnoreCase("f")){
			System.out.println("Sexo femino");
		}else {
			System.out.println("informação invalida");		}
		
	}

}
