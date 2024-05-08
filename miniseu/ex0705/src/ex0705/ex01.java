package ex0705;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		int num,cont=1, maior=Integer.MIN_VALUE;
		Scanner in = new Scanner(System.in);
		
		while(cont <= 3) {
			System.out.println("Digite um numero");
			num = in.nextInt();
			
			if(num>maior)
				maior=num;
			
			cont++;
		}
		System.out.println(maior);
		in.close();
	}

}
