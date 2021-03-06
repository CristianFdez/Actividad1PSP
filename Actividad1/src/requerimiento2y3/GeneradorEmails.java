package requerimiento2y3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorEmails {
	
	public Email generarEmail() {
		
		//Creamos primero un objeto Email para poder asignar valor a todos sus atributos.
		Email email = new Email();
		
		//Para asignar valor a los atributos invocamos al m?todo set y le pasamos su m?todo.
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
		
		//Creamos varias posibilidades y mediante la generaci?n del n?mero aleatorio,
		//recuperar? una posici?n u otra de ArrayList.
		List<String> listaNombres = new ArrayList<String>();
		
		listaNombres.add("Thor");
		listaNombres.add("Spiderman");
		listaNombres.add("Capit?n America");
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
		listaNombres.add("Ultr?n");
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