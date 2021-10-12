package requerimiento1;

public class Primos implements Runnable{

	public int numero;

	
	public Primos() {
		super();
	}

	public Primos(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		
		this.numero = numero;
	}
	
	// Para saber si un número es primo debe ser divisible solo 
	// por si mismo y por 1
	
	@Override
	public void run() {
		int contador = 0;
		int numDivisiblesPrimo = 2;
		long inicioHilo = System.currentTimeMillis();
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				contador++;				
			}			
		}
		
		if(contador == numDivisiblesPrimo) {
			System.out.println("El número " + this.numero + " es primo");
		} else {
			System.out.println("El número " + this.numero + " no es primo");
		}
		
		long finalHilo = System.currentTimeMillis();
		int duracionHilo = (int) ((finalHilo - inicioHilo));
		System.out.println(" El hilo: " + Thread.currentThread().getName() + " acaba de terminar y ha tardado: " + duracionHilo + " milisegundos");

	}

}
