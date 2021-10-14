package requerimiento1;

import java.util.Scanner;

public class Principal {
	
	// No se porque funciona pero lo del tiempo me lo calcula mal

	public static void main(String[] args) {
		// Creamos los objetos para guardar los numeros que mas tarde pediremos por consola
		// y asociar un hilo a cada objeto creado
		HiloNumero num1 = new HiloNumero();
		Thread h1 = new Thread(num1); // aqui asociamos el numero al hilo correspondiente
		h1.setName("Hilo1");
		
		HiloNumero num2 = new HiloNumero();
		Thread h2 = new Thread(num2); 
		h2.setName("Hilo2");
		
		HiloNumero num3 = new HiloNumero();
		Thread h3 = new Thread(num3); 
		h3.setName("Hilo3");
		
		HiloNumero num4 = new HiloNumero();
		Thread h4 = new Thread(num4); 
		h4.setName("Hilo4");
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Dame cuatro números enteros");
	
		num1.setNumero(leer.nextInt());
		num2.setNumero(leer.nextInt());
		num3.setNumero(leer.nextInt());
		num4.setNumero(leer.nextInt());
		leer.close();
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
	

	}
}
