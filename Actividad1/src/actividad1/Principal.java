package actividad1;

import java.util.Scanner;

public class Principal implements Runnable{

	public static void main(String[] args) {
		Primos primo1 = new Primos();
		Primos primo2 = new Primos();
		Primos primo3 = new Primos();
		Primos primo4 = new Primos();
		
		Scanner sc = new Scanner (System.in);
		primo1.setNumero(sc.nextInt());
		primo2.setNumero(sc.nextInt());
		primo3.setNumero(sc.nextInt());
		primo4.setNumero(sc.nextInt());
		sc.close();
		
		System.out.println("El número " + primo1.getNumero() +" es primo: " + primo1.esPrimo());
		System.out.println("El número " + primo2.getNumero() +" es primo: " + primo2.esPrimo());
		System.out.println("El número " + primo3.getNumero() +" es primo: " + primo3.esPrimo());
		System.out.println("El número " + primo4.getNumero() +" es primo: " + primo4.esPrimo());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
