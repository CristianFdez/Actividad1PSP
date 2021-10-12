package requerimiento2;

public class Email {
	String id, asunto, cuerpo;
	
	public Email(String id, String asunto, String cuerpo) {
		super();
		this.id = id;
		this.asunto = asunto;
		this.cuerpo = cuerpo;
		
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

	@Override
	public String toString() {
		return "Email [id=" + id + ", asunto=" + asunto + ", cuerpo=" + cuerpo + "]";
	}	
	
}

