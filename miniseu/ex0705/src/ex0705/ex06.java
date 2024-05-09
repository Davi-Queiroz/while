package ex0705;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		double num =1, cont=1,loop=1,reserva = 0,raiz;
		Scanner in = new Scanner(System.in);

		System.out.println("Digite um numero");
		cont=in.nextDouble();
		
		while(loop<cont){
			raiz = Math.sqrt(loop);
			
			reserva = reserva + (loop/raiz);
			loop++;
			num++;
			System.out.println(String.format("%.2f", reserva));
			
		}
	}

}
