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
		int cont = 0;
		int numDivisiblesPrimo = 2;
		long inicio = System.currentTimeMillis();
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				cont++;				
			}			
		}
		
		if(cont == numDivisiblesPrimo) {
			System.out.println("El número " + this.numero + " es primo");
		} else {
			System.out.println("El número " + this.numero + " no es primo");
		}
		
		long fin = System.currentTimeMillis();
		int tiempo = (int) ((fin - inicio));
		System.out.println("Hilo: " + Thread.currentThread().getName() + " acabado y ha tardado: " + tiempo + " milisegundos");

	}

}
