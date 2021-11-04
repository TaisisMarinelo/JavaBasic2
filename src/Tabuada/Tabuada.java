package Tabuada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		char op;
		int numero, i;
		Scanner entrada = new Scanner(System.in);

		do {
			
			try {
				System.out.println("Informe o n�mero que deseja a tabuada: ");
				numero = entrada.nextInt();
				for ( i = 0; i < 11; i++) {
					System.out.println(numero + " * " + i + " = " + i * numero);
				}
			} catch (InputMismatchException e) {
				System.err.println("Digite um n�mero inteiro!");
				entrada.next();
				//System.out.println(e);
			}
			
			System.out.println("Deseja continuar: [S-Sim/N-N�o]");
			op = entrada.next().charAt(0);
		} while (op == 's' || op == 'S');

		entrada.close();
	}


}
