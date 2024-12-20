package questao_4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite 1 número inteiro: ");
		
		int a = sc.nextInt();
		
		imprimeDecrescente(a);
		
		sc.close();

	}
	
	
	public static void imprimeDecrescente(int x) {
		
		if (x < 0) {
			System.out.printf("O número %d é negativo, portanto, não pode decrescer até 0.", x);
			return;
		}
		
		while(x >= 0) {
			System.out.printf("%d ", x--);
		}
	}

}
