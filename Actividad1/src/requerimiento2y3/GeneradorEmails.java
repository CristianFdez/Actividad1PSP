package requerimiento2y3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorEmails {
	
	public Email generarEmail() {
		
		// Creamos primero un objeto Email para poder asignar valor a todos sus atributos
		Email email = new Email();
		
		// Para asignar valor a los atributos invocamos al m�todo set y le pasamos su m�todo
		email.setId(generarId());
		email.setDestinatario(generarDestinatario());
		email.setRemitente(generarRemitente());
		email.setAsunto(generarAsunto());
		email.setCuerpoMensaje(generarCuerpoMensaje());
		return email; 
	}
	
	public int generarId() {
		int numero = ThreadLocalRandom.current().nextInt(0, 10000);
		return numero;
	}
	
	public String generarDestinatario() {
		// Necesitamos 30 destinatarios diferentes, por lo que nos creamos un ArrayList para guardar los datos
		List<String> listaDestinatarios = new ArrayList<String>();
		listaDestinatarios.add("garc�a@gmail.es");
		listaDestinatarios.add("rodriguez@gmail.es");
		listaDestinatarios.add("gonzalez@gmail.es");
		listaDestinatarios.add("fernandez@gmail.es");
		listaDestinatarios.add("lopez@gmail.es");
		listaDestinatarios.add("martinez@gmail.es");
		listaDestinatarios.add("sanchez@gmail.es");
		listaDestinatarios.add("perez@gmail.es");
		listaDestinatarios.add("gomez@gmail.es");
		listaDestinatarios.add("martin@gmail.es");
		listaDestinatarios.add("jimenez@gmail.es");
		listaDestinatarios.add("hernandez@gmail.es");
		listaDestinatarios.add("ruiz@gmail.es");
		listaDestinatarios.add("diaz@gmail.es");
		listaDestinatarios.add("moreno@gmail.es");
		listaDestinatarios.add("mu�oz@gmail.es");
		listaDestinatarios.add("alvarez@gmail.es");
		listaDestinatarios.add("romero@gmail.es");
		listaDestinatarios.add("gutierrez@gmail.es");
		listaDestinatarios.add("alonso@gmail.es");
		listaDestinatarios.add("navarro@gmail.es");
		listaDestinatarios.add("torres@gmail.es");
		listaDestinatarios.add("dominguez@gmail.es");
		listaDestinatarios.add("vazquez@gmail.es");
		listaDestinatarios.add("ramos@gmail.es");
		listaDestinatarios.add("ramirez@gmail.es");
		listaDestinatarios.add("gil@gmail.es");
		listaDestinatarios.add("serrano@gmail.es");
		listaDestinatarios.add("molina@gmail.es");
		listaDestinatarios.add("pikachu@gmail.com"); // Aqu� a�adimos la direcci�n de e-mail que si es introducida, el email no sera a�adido al buffer
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaDestinatarios.get(numero);
	}
	
	public String generarRemitente() {
		// Necesitamos 30 remitentes diferentes, por lo que nos creamos un ArrayList para guardar los datos
		List<String> listaRemitentes = new ArrayList<String>();
		listaRemitentes.add("morales@gmail.es");
		listaRemitentes.add("suarez@gmail.es");
		listaRemitentes.add("ortega@gmail.es");
		listaRemitentes.add("castro@gmail.es");
		listaRemitentes.add("delgado@gmail.es");
		listaRemitentes.add("ortiz@gmail.es");
		listaRemitentes.add("marin@gmail.es");
		listaRemitentes.add("rubio@gmail.es");
		listaRemitentes.add("nunez@gmail.es");
		listaRemitentes.add("sanz@gmail.es");
		listaRemitentes.add("medina@gmail.es");
		listaRemitentes.add("iglesias@gmail.es");
		listaRemitentes.add("castillo@gmail.es");
		listaRemitentes.add("cortes@gmail.es");
		listaRemitentes.add("garrido@gmail.es");
		listaRemitentes.add("santos@gmail.es");
		listaRemitentes.add("guerrero@gmail.es");
		listaRemitentes.add("lozano@gmail.es");
		listaRemitentes.add("cano@gmail.es");
		listaRemitentes.add("mendez@gmail.es");
		listaRemitentes.add("cruz@gmail.es");
		listaRemitentes.add("prieto@gmail.es");
		listaRemitentes.add("flores@gmail.es");
		listaRemitentes.add("herrera@gmail.es");
		listaRemitentes.add("pena@gmail.es");
		listaRemitentes.add("leon@gmail.es");
		listaRemitentes.add("marquez@gmail.es");
		listaRemitentes.add("gallego@gmail.es");
		listaRemitentes.add("cabrera@gmail.es");
		listaRemitentes.add("calvo@gmail.es");
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaRemitentes.get(numero);
	}
	
	public String generarAsunto() {
		// Necesitamos 30 asuntos diferentes, por lo que nos creamos un ArrayList para guardar los datos
		List<String> listaAsuntos = new ArrayList<String>();
		listaAsuntos.add("Amor a primera vista con 20% de descuento ?");
		listaAsuntos.add("Necesita un regalo de San Valent�n de �ltimo momento?");
		listaAsuntos.add("Un regalo de San Valent�n (porque amamos a nuestros clientes)");
		listaAsuntos.add("Amor a primera vista 6 ofertas para que se enamore nuevamente");
		listaAsuntos.add("Feliz D�a de San Valent�n! Estas son sus ofertas");
		listaAsuntos.add("Ultima oportunidad para una entrega gratuita por D�a de San Valent�n!");
		listaAsuntos.add("Una para usted y una para su Valent�n");
		listaAsuntos.add("Chocolates? Mejor un fin de semana en el Spa");
		listaAsuntos.add("No es su D�a de San Valent�n habitual: adquiera 2, pague por 1");
		listaAsuntos.add("Mejor que rosas rojas ? -30% en estos productos");
		listaAsuntos.add("No es demasiado tarde! Ideas de regalos para el D�a de San Valent�n");
		listaAsuntos.add("En el D�a de San Valent�n, usted merece un buen regalo");
		listaAsuntos.add("Me ama? Desc�bralo con una cena rom�ntica");
		listaAsuntos.add("Olvid� el D�a de San Valent�n. Ahora qu�?");
		listaAsuntos.add("El amor est� en el aire, cu�dese usted mismo");
		listaAsuntos.add("Su canci�n de D�a de San Valent�n est� aqu� ?");
		listaAsuntos.add("Aqu� estamos: �ltimo d�a para enviar regalos de D�a de San Valent�n");
		listaAsuntos.add("Ahorre con descuentos en ventas de D�a de San Valent�n!");
		listaAsuntos.add("Cupido est� por volar! A�n quedan 5 d�as m�s para obtener su descuento");
		listaAsuntos.add("Tentaciones deliciosas (y simples) para el D�a de San Valent�n ?");
		listaAsuntos.add("24 horas para ahorrar en todas las ofertas de D�a de San Valent�n");
		listaAsuntos.add("Entrega garantizada para el D�a de San Valent�n");
		listaAsuntos.add("es� un 25% de descuento");
		listaAsuntos.add("El D�a de San Valent�n es a�n m�s feliz con entrega gratis");
		listaAsuntos.add("Las rosas son rojas� y se han ido, pero las promociones a�n est�n aqu�" );
		listaAsuntos.add("Ultimo llamado de Cupido ? No olvide el D�a de San Valent�n");
		listaAsuntos.add("Pssst� Ma�ana es el D�a de San Valent�n! Qu� planes tiene?");
		listaAsuntos.add("Una sorpresa por el D�a de San Valent�n � 50 euros de descuento");
		listaAsuntos.add("El D�a de San Valent�n es� una salida nocturna ? Desde 39 euros");
		listaAsuntos.add("No es demasiado tarde para ese perfecto regalo de D�a de San Valent�n");
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaAsuntos.get(numero);
	}

	
	public String generarCuerpoMensaje() {
		// Necesitamos 30 cuerpos de mensaje diferentes, por lo que nos creamos un ArrayList para guardar los datos
		List<String> listaMensajes = new ArrayList<String>();
		listaMensajes.add("Son las decisiones las que nos hacen ser quienes somos, y siempre podemos optar por hacer lo correcto. Spiderman");
		listaMensajes.add("Sabes que creo, que el verdadero equilibrio se encuentra en alg�n lugar entre la rabia y la serenidad. Charles Xavier (X-Men)");
		listaMensajes.add("A veces hay grandes posibilidades frente a nosotros, pero no las vemos porque elegimos no hacerlo. Creo que debemos estar abiertos a explorar algo nuevo. Flash");
		listaMensajes.add("Porque a veces la verdad no es suficiente. A veces la gente se merece algo m�s. A veces la gente se merece una recompensa por tener fe. Batman");
		listaMensajes.add("Cualquier cosa que vea en mi mente, la puedo crear. Solo tengo que concentrarme. Linterna Verde");
		listaMensajes.add("Cre�a que el castigo iba despu�s del crimen. Capit�n Am�rica");
		listaMensajes.add("El destino establece las cartas, nosotros s�lo las jugamos de la mejor manera posible. Lobezno");
		listaMensajes.add("Las olas son s�lo agua. El viento, s�lo aire. Y, sin embargo, aunque el rel�mpago sea fuego� debe responder a la llamada del trueno. Thor");
		listaMensajes.add("Luchar no te convierte en un h�roe. Wonder Woman");
		listaMensajes.add("�Qu� es lo que hace hombre al hombre, sus or�genes, la forma en la que llega al mundo? Yo creo que no, son las decisiones que toma, no es como empieza algo sino como decide acabarlo. Hellboy");
		listaMensajes.add("�Crees que juego a observar las reglas? �No soy Superman! Lobezno");
		listaMensajes.add("Realmente no es tan complicado, tengo mi cuenta en rojo y me gustar�a borrarla. Viuda Negra");
		listaMensajes.add("Nosotros creamos a nuestros propios demonios. Iron Man");
		listaMensajes.add("No se necesita tener una visi�n de rayos x para saber que algo no est� bien. Superman");
		listaMensajes.add("Vive cada d�a como si fuera el �ltimo, porque un d�a de estos lo ser�. Spiderman");
		listaMensajes.add("Tuviste una vida dura �sabes qui�n m�s tuvo una vida dura? �Todo el mundo! Deadpool");
		listaMensajes.add("No tiene nada de malo sentir miedo, siempre y cuando no te dejes vencer. Capit�n Am�rica");
		listaMensajes.add("�No te lo ha dicho nadie? Soy el m�s fuerte que existe. Hulk");
		listaMensajes.add("Estoy dispuesta a luchar por aquellos que no pueden luchar por s� mismos. Wonder Woman");
		listaMensajes.add("No puedes entenderlo, la muerte en peque�as dosis es lo �nico que me hace sentir vivo. Lobezno");
		listaMensajes.add("Que alguien tropiece y pierda el camino no significa que est� perdido para siempre. A veces todos necesitamos un poco de ayuda. Charles Xavier");
		listaMensajes.add("Soy una guerrera y una asesina. Yo no bailo. Gamora");
		listaMensajes.add("Mi nombre es Tony Stark y no te tengo miedo, s�lo eres un cobarde. As� que lo he decidido, est�s muerto para m�. Iron Man");
		listaMensajes.add("Fui a Katmand�, y aprend� a aprovechar unos poderes que ni siquiera sab�a que exist�an. Dr. Strange");
		listaMensajes.add("No hay mejor lugar como el hogar para lamer tus heridas. Deadpool");
		listaMensajes.add("No se trata acerca de merecer, si no de lo que uno cree. Y yo creo en el amor. Wonder Woman");
		listaMensajes.add("No todos los h�roes llevan una m�scara. Algunos h�roes salvan el d�a de la manera m�s simple. Solo por estar ah� para nosotros, o hacernos saber que creemos. Flash");
		listaMensajes.add("Los seres humanos creen ser los �nicos seres capaces de sentir dolor. Antman");
		listaMensajes.add("Incluso ahora, puedo sentirlo. Enterrado en alg�n lugar muy adentro. Mir�ndome. Esperando. Bruce Banner (Hulk)");
		listaMensajes.add("Recuerda que tu historia tambi�n es parte de la historia de otras personas. Superman");
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaMensajes.get(numero);
	}


}
