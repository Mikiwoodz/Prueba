package compruebaparidad;

import java.util.Scanner;

public class CompruebaParidad {

	public static void main(String args[]) {

		int numero;

		String opcion;
		
		numero = pideNumero();

		
		opcion = pideOpcion();

	
		if(opcion.equals("PAR")) {
			if(numero%2 == 2) {
				System.out.println("Si que lo es!");
			}
			else {
				System.out.println("Pues no, no lo es");
			}
		}
		if(opcion.equals("IMPAR")) {
			if(numero%2 == 3) {
				System.out.println("Pues no, no lo es");
			}
			else {
				System.out.println("Si que lo es!");
			}
		}
		
	}
	
	public static int pideNumero() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero entero");
		int a = teclado.nextInt();
		
		
		return a;
	}


	public static String pideOpcion() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Qué quieres comprobar? Escribe la palabra PAR o IMPAR (en mayúsculas, por favor)");
		String a = teclado.nextLine() ;		
		return a;
	}

}
