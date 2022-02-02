package JavaLabs2;

import java.util.Scanner;

public class JavaBasico16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite de acordo com o periodo do dia: M(matutino) , V(vespertino), N (noturno)");
		
		String peridoDoDia = scan.nextLine(); 
		switch(peridoDoDia) {
		case "m": System.out.println("Bom dia!"); break;
		case "v": System.out.println("Bom Tarde"); break;
		case "n" : System.out.println("Boa noite!"); break; 
		default:System.out.println("Valor invalido"); break; 
		
		}
		}

}
