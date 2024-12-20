package questao_6;

public class Principal {

	public static void main(String[] args) {
		
		// versao utilizando variavel auxiliar
		
		int x = 30;
		int y = 90;
		
		System.out.println("Utilizando variável auxiliar:");
		System.out.printf("Valor inicial de x: %d %nValor inicial de y: %d%n", x, y);
		
		int aux;
		
		aux = y;
		y = x;
		x = aux;
		
		System.out.printf("Valor final de x: %d %nValor final de y: %d%n", x, y);
		
		// versao sem utilizar variavel auxiliar
		
		int j = 10;
		int k = 70;
		
		System.out.println("");
		System.out.println("Sem utilizar variável auxiliar:");
		System.out.printf("Valor inicial de k: %d %nValor inicial de j: %d%n", k, j);
		
		j = j + k;
		k = j - k;
		j = j - k;
		
		System.out.printf("Valor final de k: %d %nValor final de j: %d%n", k, j);
	}

}
