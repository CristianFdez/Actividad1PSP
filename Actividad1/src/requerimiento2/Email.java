package requerimiento2;

public class Email {
	String id, asunto, cuerpo;
	Productor remitente;
	Consumidor destinatario;
	
	public Email(String id, String asunto, String cuerpo, Productor remitente, Consumidor destinatario) {
		super();
		this.id = id;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		this.remitente = remitente;
		this.destinatario = destinatario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Productor getRemitente() {
		return remitente;
	}

	public void setRemitente(Productor remitente) {
		this.remitente = remitente;
	}

	public Consumidor getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Consumidor destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", asunto=" + asunto + ", cuerpo=" + cuerpo + ", remitente=" + remitente
				+ ", destinatario=" + destinatario + "]";
	}
	
	
	
}

