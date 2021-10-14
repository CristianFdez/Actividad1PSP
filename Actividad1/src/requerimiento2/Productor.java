package requerimiento2;

public class Productor implements Runnable {
	
	String nombre;
	Cola cola;

	
	public Productor(String nombre, Cola cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}


	@Override
	public void run() {
		
		GeneradorEmails ge = new GeneradorEmails();
		
		for(int i = 1;i <= 10;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			Email email = ge.generarEmail();		
			cola.addEmail(email);
			
			if (!email.getDestinatario().contains("pikachu@gmail.com")){
				System.out.println(nombre + " ha producido el email " + email.toString());					
			}else {
				i--;
			}
							
		}
		
	}

}
