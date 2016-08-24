import java.util.Scanner;

public class MenorValor {
	
	public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
		int valor1;
		int valor2;
		int valor3;
		int menorValor;
		
		System.out.println("***Sistema de comparação de valores***");
		System.out.println("Entre com o primeiro valor");
		System.out.print("R:");
		valor1 = teclado.nextInt();
		System.out.println("Entre com o segundo valor");
		System.out.print("R:");
		valor2 = teclado.nextInt();
		System.out.println("Entre com o terceiro valor");
		System.out.print("R:");
		valor3 = teclado.nextInt();
		
		if (valor1 < valor2 && valor1 < valor3){
			menorValor = valor1;
		}else if(valor2 < valor3){
			menorValor = valor2;
		}else{
			menorValor = valor3;
		}
		System.out.println("O número de menor valor, é : "+menorValor);
	}

}
