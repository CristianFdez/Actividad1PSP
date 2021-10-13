package requerimiento2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorEmails {
	
	public Email generarEmail() {
		
		Email email = new Email();
		
		email.setId(generarId());
		email.setAsunto(generarAsunto());
		email.setCuerpo(generarCuerpo());
		email.setRemitente(generarRemitente());
		email.setDestinatario(generarDestinatario());
		
		return email;
	}
	
	public int generarId() {
		int numero = ThreadLocalRandom.current().nextInt(0, 10000);
		return numero;
	}
	
	public String generarAsunto() {
		
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("Thor");
		listaNombres.add("Spiderman");
		listaNombres.add("Capitán America");
		listaNombres.add("Hulk");
		listaNombres.add("IronMan");
		listaNombres.add("Doctor Strange");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}
	
	public String generarCuerpo() {
		
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("Duende Verde");
		listaNombres.add("Thanos");
		listaNombres.add("Venom");
		listaNombres.add("Ultrón");
		listaNombres.add("Loki");
		listaNombres.add("Mysterio");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}
	
	public String generarRemitente() {
		
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("superman@gmail.com");
		listaNombres.add("batman@gmail.com");
		listaNombres.add("wonder_woman@gmail.com");
		listaNombres.add("linterna_verde@gmail.com");
		listaNombres.add("flash@gmail.com");
		listaNombres.add("catwoman@gmail.com");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}
	
	public String generarDestinatario() {
		
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("pikachu@gmail.com");
		listaNombres.add("squirtle@gmail.com");
		listaNombres.add("charmander@gmail.com");
		listaNombres.add("bulbasur@gmail.com");
		listaNombres.add("moltres@gmail.com");
		listaNombres.add("zapdos@gmail.com");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return listaNombres.get(numero);
	}

}
