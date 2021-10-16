package requerimiento2y3;

public class Productor implements Runnable {
	
	//Atributos de la clase
	String nombre;
	Cola cola;

	//Constructor con todo
	public Productor(String nombre, Cola cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}


	@Override
	public void run() {
		
		//Cuando se llama al hilo productor se genera un email y se añade un mensaje y
		//cada hilo puede producir un máximo de 10 emails 
		
		GeneradorEmails ge = new GeneradorEmails();
		
		for(int i = 1;i <= 10;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			Email email = ge.generarEmail();		
			cola.addEmail(email);
										
		}
		
	}

}
