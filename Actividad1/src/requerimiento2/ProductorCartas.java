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
		
		GeneradorEmails generEmails = new GeneradorEmails();
		
		for(int i = 1;i <= 10;i++){
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
			Email email = generEmails.generarEmail();		
			cola.addEmail(email);
			
			if (!email.getDestinatario().contains("pikachu@gmail.com")){
				System.out.println(nombre + " ha producido el email con los siguientes datos: " + email.toString());					
			}else {
				i--;
			}
							
		}
		
	}

}