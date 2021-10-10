package actividad1;

public class Primos {

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
	
	public boolean esPrimo() {
		boolean esPrimo = false;
		int cont = 0;
		int numDivisiblesPrimo = 2;
		
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) {
				cont++;				
			}			
		}
		
		if(cont == numDivisiblesPrimo) {
			esPrimo = true;
		}
		
		return esPrimo;
	}

}
