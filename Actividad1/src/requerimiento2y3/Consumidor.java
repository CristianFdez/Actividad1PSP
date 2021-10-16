package requerimiento2y3;

public class Consumidor implements Runnable{
	String nombre;
	Cola cola;

	
	public Consumidor(String nombre, Cola cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}

	public void run(){
		
		//Decimos que se salga del hilo cuando llegue a 30 ya que hay 3 hilos productores con un máximo de 10 emails cada uno.
		for(int i = 1;i <= 15;i++){
			
			Email email = cola.getEmail();
			System.out.println(nombre + " ha enviado un email con los siguientes datos: " + email.toString());
		
		}
	}

}