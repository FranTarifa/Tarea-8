package Tarea_8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {			
		
		int[] numeros;
		numeros = new int [10];
		
		Integer  numeroRepetido = -1;
		int cantidad = 0;
		Integer mayorCantidad = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < 10; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		
		for (int i=0; i < 10; i++) {
				cantidad = 0;				
			for (int x = 0; x < 10; x++) {
				if (numeros[i] == numeros[x]) {
					cantidad++;
				}
				if (cantidad > mayorCantidad) {
					mayorCantidad = cantidad;
					numeroRepetido = numeros[i];
				}
			}
		}
		if (mayorCantidad == 1) {
			mayorCantidad = null;
			numeroRepetido = null;
		}
		System.out.println("El numero con mayor ocurrencia es: " + numeroRepetido + " y se repite " + mayorCantidad + " veces");
	}
}