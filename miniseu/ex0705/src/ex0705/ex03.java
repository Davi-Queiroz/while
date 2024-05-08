package ex0705;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		int fat, cont = 1, mult = 1;
		Scanner in = new Scanner(System.in);

		System.out.println("Digite um valor");
		fat = in.nextInt();

		if (fat > 0) {
		
				while (fat != cont) {
					mult = mult * fat;
					fat--;
				}
				System.out.println(mult);
			
		
		}else if(fat==0) {
			System.out.println(1);
			
		}
		
		else
			System.out.println("Valor invalido");

	}

}
