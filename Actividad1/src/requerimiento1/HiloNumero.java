package requerimiento1;

public class HiloNumero implements Runnable{
	private int numero;
	
	public HiloNumero() {
		super();
	}

	public HiloNumero(int numero) {
		super();
		this.numero = numero;
		
	}

	public int getNumero() { 
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Override
	public void run() {
		int cont = 0;
		int maxDivisoresPrimo = 2;
		// Queremos saber cuanto tarda en calcular si es primo o no, por lo que inicializamos la variable inicio justo antes de iniciar el calculo
		long inicio= System.currentTimeMillis();
		// Inicializamos i a 1 porque si lo inicializamos a 0 daría infinito el primer resultado
		for (int i = 1; i<=numero ; i++) {
			
			if (numero % i == 0) {
				cont++;
			}
		}
		long fin = System.currentTimeMillis();
		int tiempo = (int) (fin - inicio);
		if (cont == maxDivisoresPrimo) {
			System.out.println("El número " + this.numero + " es primo");
		} else {
			System.out.println("El número " + this.numero + " no es primo");;
		}
		
		
		System.out.println("El hilo " + Thread.currentThread().getName() + " ha tardado : " + tiempo + " milisegundos");
		
	}
	
}
