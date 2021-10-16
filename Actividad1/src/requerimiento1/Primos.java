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
		
		// Queremos saber cuanto tarda en calcular si es primo o no, por lo que inicializamos la variable inicio justo antes de iniciar el calculo.
		long inicio = System.currentTimeMillis();

		// Inicializamos i a 1 porque si lo inicializamos a 0 daría infinito el primer resultado.
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