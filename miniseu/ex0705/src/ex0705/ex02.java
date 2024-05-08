package ex0705;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		int num, cont = 1, maior = 0, user;
		user = 0;
		Scanner in = new Scanner(System.in);

		

		do{
			System.out.println("Digite um numero: ");
			num = in.nextInt(); 
			
			while (cont <= 10) {
				System.out.println(num + " * " + cont + " = " + num * cont);
				cont++;				
			}
			
			cont=1;
			System.out.println("Digite 1 para incerrar a aplicação");
			user = in.nextInt();
		} while(user!=1);
		System.out.println("Aplicação incerrada");

		in.close();
	}

}
