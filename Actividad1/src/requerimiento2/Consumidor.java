package requerimiento2;

public class Consumidor implements Runnable{
	String nombre;
	Cola cola;
	Email emails[];
	
	
	public Consumidor(String nombre, Cola cola, Email emails[]) {
		super();
		this.nombre = nombre;
		this.cola = cola;
		this.emails = emails;
		
	}

	public void run(){
		while(true) {
		//for(int i = 1;i <= 10;i++){
			for(int j=0; j<emails.length;j++) {
				String mensaje = "El nombre del remitente es: " + nombre + " y su ID es: " + emails[j].getId();
				cola.addMensaje(mensaje);
			}
		}
	}
}

