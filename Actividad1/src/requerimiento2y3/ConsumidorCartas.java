package requerimiento2y3;

public class ConsumidorCartas implements Runnable{
	String nombre;
	ColaCartas cola;

	
	public ConsumidorCartas(String nombre, ColaCartas cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}

	public void run(){
		
		for(int i = 1;i <= 15;i++){
			
			Email email = cola.getEmail();
			System.out.println(nombre + " ha enviado un email con los siguientes datos: " + email.toString());
		
		}
	}

}
