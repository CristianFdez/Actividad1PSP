package requerimiento2y3;

public class ConsumidorEmails implements Runnable{
	
	public String nombre;
	public BufferCartas buffer;
	
	public ConsumidorEmails(String nombre, BufferCartas buffer) {
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	}
	
	public void run() {
		// Decimos que se salga del hilo cuando llegue a 30 ya que hay 3 hilos productores con un máximo de 10 emails cada uno
		for(int i=1; i<=15; i++) {
			Email email = buffer.getMensaje();
			System.out.println("\nEl " + nombre.toUpperCase() + " ha cogido el email: "+ email);
		}
	}
}
