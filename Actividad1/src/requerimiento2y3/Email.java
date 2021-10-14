package requerimiento2y3;

public class Email {

	// Atributos de la clase
	private int id;
	private String destinatario; // nombre del destinatario	
	private String remitente; // nombre del remitente
	private String asunto; // tema del email
	private String cuerpoMensaje;
	
	public Email() {
		super();
		
	}

	// Los valores para cada atributo los meteremos automáticamente llamando a la clase GeneradorEmails
	// Por esta razon no nos hace falta generar un constructor

/**
 * Getter y setter
 */
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}


	public String getRemitente() {
		return remitente;
	}


	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}


	public String getAsunto() {
		return asunto;
	}


	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}


	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}


	public void setCuerpoMensaje(String cuerpoMensaje) {
		this.cuerpoMensaje = cuerpoMensaje;
	}


	@Override
	public String toString() {
		return "\n\tEmail id: " + id + "\n\tDestinatario: " + destinatario + "\n\tRemitente: " + remitente + "\n\tAsunto : " + asunto
				+ "\n\tCuerpoMensaje : " + cuerpoMensaje + ".";
	}
	
	

	
}
