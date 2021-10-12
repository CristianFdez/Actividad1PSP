package requerimiento2;

public class Productor implements Runnable {
	
	String nombre;
	Cola cola;
	Email email;
	
	@Override
	public void run() {
		for(int i = 1;i <= 10;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			//Email email = new Email
			
			String mensaje = "El nombre del remitente es: " + nombre + " y su ID es: " + email.getId();
			cola.addMensaje(mensaje);
		}
		
	}

}
