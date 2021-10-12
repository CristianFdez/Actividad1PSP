package requerimiento2;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
	
		public final static int MAX_ELEMENTOS = 5;

		private Queue<String> cola = new LinkedList<>();

		public synchronized void addMensaje(String mensaje){

			while(cola.size() == MAX_ELEMENTOS){
				try {
					wait();					
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

			cola.offer(mensaje);
			notify();
		}
		
		public synchronized String getMensaje(){
			while(cola.size() == 0){
				try {
					wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
			String s = cola.poll();

			notify();
			return s;
		}
		

}
