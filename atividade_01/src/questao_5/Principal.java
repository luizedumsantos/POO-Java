package questao_5;

public class Principal {

	public static void main(String[] args) {
		
		int somaImpar = 0;
		long multiPar = 1;
		
		for (int i = 1; i <= 30; i++) {
			
			if (i % 2 != 0) {
				somaImpar += i;
			}
		}
		System.out.printf("%d ", somaImpar);
		
		for (int i = 1; i <= 30; i++) {
			
			if (i % 2 == 0) {
				multiPar *= i;
			}
		}
		System.out.printf("%d ", multiPar);

	}

}
