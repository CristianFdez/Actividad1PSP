package requerimiento2;

public class Consumidor implements Runnable{
	String nombre;
	Cola cola;
	Email email;
	
	public Consumidor(String nombre, Cola cola, Email email) {
		super();
		this.nombre = nombre;
		this.cola = cola;
		this.email = email;
	}

	public void run(){
		while(true) {
		//for(int i = 1;i <= 10;i++){
			String mensaje = cola.getMensaje();
			System.out.println("El nombre del destinatario es: " + nombre + " y los datos del email son: " + email.toString());
		}
	}

}
