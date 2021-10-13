package requerimiento2;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
	
		public final static int MAX_ELEMENTOS = 5;

		private Queue<Email> cola = new LinkedList<>();

		public synchronized void addEmail(Email email){

			while(cola.size() == MAX_ELEMENTOS){
				try {
					wait();					
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			
			if (email.getDestinatario() != "pikachu@gmail.com") {
				cola.offer(email);
				notify();
			}else {
				System.out.println("El destinatario del siguiente email es pikachu@gmail.com, por lo que no se añadirá a la cola");
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
