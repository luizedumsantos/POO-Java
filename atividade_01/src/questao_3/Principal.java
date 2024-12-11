package questao_3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite 2 números inteiros: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		imprimirMaiorValor(a, b);
		
		sc.close();

	}

	public static void imprimirMaiorValor(int x, int y) {
	    if (x > y) {
	        System.out.printf("O maior número é o %d.", x);
	    } else if (y > x) {
	        System.out.printf("O maior número é o %d.", y);
	    } else {
	        System.out.printf("Os dois números possuem o mesmo valor, que é %d.", x);
	    }
	}
	
}
