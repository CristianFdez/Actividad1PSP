package requerimiento2;

public class Email {
	private int id;
	private String asunto, cuerpo, remitente, destinatario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", asunto=" + asunto + ", cuerpo=" + cuerpo + ", remitente=" + remitente
				+ ", destinatario=" + destinatario + "]";
	}
	
	
	
}

