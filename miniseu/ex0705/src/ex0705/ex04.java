package ex0705;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		int num =1, cont=1,loop,reserva=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		loop = in.nextInt();
		
		while(loop>cont) {
			System.out.println(num);
			
			num = num + reserva;
			reserva = num - reserva;
			
			cont++;
		}
		
	}

}
