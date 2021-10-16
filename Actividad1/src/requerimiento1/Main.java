package requerimiento1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creamos los objetos para guardar los numeros que mas tarde pediremos por consola
		// y asociar un hilo a cada objeto creado.
		Primos primo1 = new Primos();
		Thread t1 = new Thread(primo1); //Aquí asociamos el numero al hilo correspondiente.
		t1.setName("Primo1");
		
		Primos primo2 = new Primos();
		Thread t2 = new Thread(primo2);
		t2.setName("Primo2");
		
		Primos primo3 = new Primos();
		Thread t3 = new Thread(primo3);
		t3.setName("Primo3");
		
		Primos primo4 = new Primos();
		Thread t4 = new Thread(primo4);
		t4.setName("Primo4");
		
		//Introduciremos por consola los números que queramos que se comprueben.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce 4 números:");
		primo1.setNumero(sc.nextInt());		
		primo2.setNumero(sc.nextInt());
		primo3.setNumero(sc.nextInt());
		primo4.setNumero(sc.nextInt());
		sc.close();
		
		//Iniciamos los hilos para que se ejecuten todos a la vez.
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}