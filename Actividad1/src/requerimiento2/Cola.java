package requerimiento2;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
	
		public final static int MAX_ELEMENTOS = 5;

		private Queue<Email> cola = new LinkedList<>();

		public synchronized void addEmail(Email email){
			
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
			while(cola.size() == 0){
				try {
					wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			Email e = cola.poll();

			notify();
			return e;
		}
		

}
