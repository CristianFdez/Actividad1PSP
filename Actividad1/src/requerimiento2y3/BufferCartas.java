package requerimiento2y3;

import java.util.LinkedList;
import java.util.Queue;



public class BufferCartas {
	// Creamos una variable est�tica para el m�ximo numero de emails que admitir� la lista (este valor no se puede cambiar)
	public final static int MAX_EMAILS = 5;
	
	// En el buffer se acumular�n todos los mensajes 
	private Queue<Email> buffer = new LinkedList<>();
	
	public synchronized void addMensaje(Email email) {
		
		// Meteremos todos los emails en el buffer siempre que email del destinatario no sea pikachu@gmail.com, en ese caso
		// imprimiremos un mensaje informando de que el email no ha sido a�adido
		if (!email.getDestinatario().contains("pikachu@gmail.com")) {
			while(buffer.size() == MAX_EMAILS) {			
				try {
					wait();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			buffer.offer(email);
			notify();
		} else {
			System.out.println("\n****************** EL EMAIL " + email.getId() + " NO SE GUARDA. NO ENVIAMOS EMAILS A PIKACHU@GMAIL.COM ******************\n");
		}
		
	}
	
	public synchronized Email getMensaje() {
		Email c = null;
		
		// Mientras que el buffer est� vacio, los consumidores se quedan en espera 
		while(buffer.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// Cuando el buffer tenga emails, el consumidor podr� acceder y aquel que estuviese en espera ser� llamado
		c = buffer.poll();

		notify();
		return c;
	}
}
