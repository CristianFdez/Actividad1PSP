package requerimiento2;

public class Productor implements Runnable {
	
	String nombre;
	Cola cola;
	Email emails[];
	
	
	
	public Productor(String nombre, Cola cola, Email emails[]) {
		super();
		this.nombre = nombre;
		this.cola = cola;
		this.emails = emails;
	}



	@Override
	public void run() {
		for(int i = 1;i <= 10;i++){
			
			try {
				//dormimos el hilo 0.5 segundos
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			//Email email = new Email
			for(int j=0; j<emails.length;j++) {
				String mensaje = "El nombre del remitente es: " + nombre + " y su ID es: " + emails[j].getId();
				cola.addMensaje(mensaje);
			}
			
			
		}
		
	}

}