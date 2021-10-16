package requerimiento2y3;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
	
	    //Creamos una variable est�tica para el m�ximo numero de emails que admitir� la lista (este valor no se puede cambiar).	
		public final static int MAX_ELEMENTOS = 5;
		
		//En el buffer se acumular�n todos los mensajes.
		private Queue<Email> cola = new LinkedList<>();

		public synchronized void addEmail(Email email){
			
			// Meteremos todos los emails en el buffer siempre que email del destinatario no sea pikachu@gmail.com, en ese caso
			// imprimiremos un mensaje informando de que el email no ha sido a�adido.
			if (!email.getDestinatario().equals("pikachu@gmail.com")){
				
				while(cola.size() == MAX_ELEMENTOS){
					try {
						wait();					
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				
				cola.offer(email);
				System.out.println("Se ha producido el email: " + email.toString());
				
				notify();
			}else {
				System.out.println("\n****************** EL EMAIL " + email.getId() + " NO SE GUARDA EN LA COLA. NO ENVIAMOS EMAILS A PIKACHU@GMAIL.COM ******************\n");
			}

		}
		
		public synchronized Email getEmail(){
			
			//Mientras que el buffer est� vacio, los consumidores se quedan en espera.
			while(cola.size() == 0){
				try {
					wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			
			//Cuando el buffer tenga emails, el consumidor podr� acceder y aquel que estuviese en espera ser� llamado.
			Email e = cola.poll();

			notify();
			return e;
		}
		

}