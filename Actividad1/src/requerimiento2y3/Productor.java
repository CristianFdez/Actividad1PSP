package requerimiento2y3;

public class Productor implements Runnable{
	// Atributos de clase
	public String nombre;
	public BufferCartas buffer;
	
	// Constructor con todo
	public Productor(String nombre, BufferCartas buffer) {
		super();
		this.nombre= nombre;
		this.buffer = buffer;
	}
	
	public void run() {
		
		// Cuando se llama al hilo productor se genera un email y se añade un mensaje
		// Cada hilo puede producir un máximo de 10 emails 
		GeneradorEmails ge = new GeneradorEmails();
		for(int i=1; i<=10; i++) {
			
			try {
				System.out.println("se queda esperando");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Email email = ge.generarEmail();
			buffer.addMensaje(email);
			System.out.println("\nEl " + nombre.toUpperCase() + " ha lanzado el siguiente email: " + email );
		}
		
	}
	
}
