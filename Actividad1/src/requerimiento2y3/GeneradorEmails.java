package requerimiento2y3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorEmails {
	
	public Email generarEmail() {
		
		// Creamos primero un objeto Email para poder asignar valor a todos sus atributos
		Email email = new Email();
		
		// Para asignar valor a los atributos invocamos al método set y le pasamos su método
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
		listaDestinatarios.add("garcía@gmail.es");
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
		listaDestinatarios.add("muñoz@gmail.es");
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
		listaDestinatarios.add("pikachu@gmail.com"); // Aquí añadimos la dirección de e-mail que si es introducida, el email no sera añadido al buffer
		
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
		listaAsuntos.add("Necesita un regalo de San Valentín de último momento?");
		listaAsuntos.add("Un regalo de San Valentín (porque amamos a nuestros clientes)");
		listaAsuntos.add("Amor a primera vista 6 ofertas para que se enamore nuevamente");
		listaAsuntos.add("Feliz Día de San Valentín! Estas son sus ofertas");
		listaAsuntos.add("Ultima oportunidad para una entrega gratuita por Día de San Valentín!");
		listaAsuntos.add("Una para usted y una para su Valentín");
		listaAsuntos.add("Chocolates? Mejor un fin de semana en el Spa");
		listaAsuntos.add("No es su Día de San Valentín habitual: adquiera 2, pague por 1");
		listaAsuntos.add("Mejor que rosas rojas ? -30% en estos productos");
		listaAsuntos.add("No es demasiado tarde! Ideas de regalos para el Día de San Valentín");
		listaAsuntos.add("En el Día de San Valentín, usted merece un buen regalo");
		listaAsuntos.add("Me ama? Descúbralo con una cena romántica");
		listaAsuntos.add("Olvidó el Día de San Valentín. Ahora qué?");
		listaAsuntos.add("El amor está en el aire, cuídese usted mismo");
		listaAsuntos.add("Su canción de Día de San Valentín está aquí ?");
		listaAsuntos.add("Aquí estamos: último día para enviar regalos de Día de San Valentín");
		listaAsuntos.add("Ahorre con descuentos en ventas de Día de San Valentín!");
		listaAsuntos.add("Cupido está por volar! Aún quedan 5 días más para obtener su descuento");
		listaAsuntos.add("Tentaciones deliciosas (y simples) para el Día de San Valentín ?");
		listaAsuntos.add("24 horas para ahorrar en todas las ofertas de Día de San Valentín");
		listaAsuntos.add("Entrega garantizada para el Día de San Valentín");
		listaAsuntos.add("es… un 25% de descuento");
		listaAsuntos.add("El Día de San Valentín es aún más feliz con entrega gratis");
		listaAsuntos.add("Las rosas son rojas… y se han ido, pero las promociones aún están aquí" );
		listaAsuntos.add("Ultimo llamado de Cupido ? No olvide el Día de San Valentín");
		listaAsuntos.add("Pssst… Mañana es el Día de San Valentín! Qué planes tiene?");
		listaAsuntos.add("Una sorpresa por el Día de San Valentín … 50 euros de descuento");
		listaAsuntos.add("El Día de San Valentín es… una salida nocturna ? Desde 39 euros");
		listaAsuntos.add("No es demasiado tarde para ese perfecto regalo de Día de San Valentín");
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaAsuntos.get(numero);
	}

	
	public String generarCuerpoMensaje() {
		// Necesitamos 30 cuerpos de mensaje diferentes, por lo que nos creamos un ArrayList para guardar los datos
		List<String> listaMensajes = new ArrayList<String>();
		listaMensajes.add("Son las decisiones las que nos hacen ser quienes somos, y siempre podemos optar por hacer lo correcto. Spiderman");
		listaMensajes.add("Sabes que creo, que el verdadero equilibrio se encuentra en algún lugar entre la rabia y la serenidad. Charles Xavier (X-Men)");
		listaMensajes.add("A veces hay grandes posibilidades frente a nosotros, pero no las vemos porque elegimos no hacerlo. Creo que debemos estar abiertos a explorar algo nuevo. Flash");
		listaMensajes.add("Porque a veces la verdad no es suficiente. A veces la gente se merece algo más. A veces la gente se merece una recompensa por tener fe. Batman");
		listaMensajes.add("Cualquier cosa que vea en mi mente, la puedo crear. Solo tengo que concentrarme. Linterna Verde");
		listaMensajes.add("Creía que el castigo iba después del crimen. Capitán América");
		listaMensajes.add("El destino establece las cartas, nosotros sólo las jugamos de la mejor manera posible. Lobezno");
		listaMensajes.add("Las olas son sólo agua. El viento, sólo aire. Y, sin embargo, aunque el relámpago sea fuego… debe responder a la llamada del trueno. Thor");
		listaMensajes.add("Luchar no te convierte en un héroe. Wonder Woman");
		listaMensajes.add("¿Qué es lo que hace hombre al hombre, sus orígenes, la forma en la que llega al mundo? Yo creo que no, son las decisiones que toma, no es como empieza algo sino como decide acabarlo. Hellboy");
		listaMensajes.add("¿Crees que juego a observar las reglas? ¡No soy Superman! Lobezno");
		listaMensajes.add("Realmente no es tan complicado, tengo mi cuenta en rojo y me gustaría borrarla. Viuda Negra");
		listaMensajes.add("Nosotros creamos a nuestros propios demonios. Iron Man");
		listaMensajes.add("No se necesita tener una visión de rayos x para saber que algo no está bien. Superman");
		listaMensajes.add("Vive cada día como si fuera el último, porque un día de estos lo será. Spiderman");
		listaMensajes.add("Tuviste una vida dura ¿sabes quién más tuvo una vida dura? ¡Todo el mundo! Deadpool");
		listaMensajes.add("No tiene nada de malo sentir miedo, siempre y cuando no te dejes vencer. Capitán América");
		listaMensajes.add("¿No te lo ha dicho nadie? Soy el más fuerte que existe. Hulk");
		listaMensajes.add("Estoy dispuesta a luchar por aquellos que no pueden luchar por sí mismos. Wonder Woman");
		listaMensajes.add("No puedes entenderlo, la muerte en pequeñas dosis es lo único que me hace sentir vivo. Lobezno");
		listaMensajes.add("Que alguien tropiece y pierda el camino no significa que esté perdido para siempre. A veces todos necesitamos un poco de ayuda. Charles Xavier");
		listaMensajes.add("Soy una guerrera y una asesina. Yo no bailo. Gamora");
		listaMensajes.add("Mi nombre es Tony Stark y no te tengo miedo, sólo eres un cobarde. Así que lo he decidido, estás muerto para mí. Iron Man");
		listaMensajes.add("Fui a Katmandú, y aprendí a aprovechar unos poderes que ni siquiera sabía que existían. Dr. Strange");
		listaMensajes.add("No hay mejor lugar como el hogar para lamer tus heridas. Deadpool");
		listaMensajes.add("No se trata acerca de merecer, si no de lo que uno cree. Y yo creo en el amor. Wonder Woman");
		listaMensajes.add("No todos los héroes llevan una máscara. Algunos héroes salvan el día de la manera más simple. Solo por estar ahí para nosotros, o hacernos saber que creemos. Flash");
		listaMensajes.add("Los seres humanos creen ser los únicos seres capaces de sentir dolor. Antman");
		listaMensajes.add("Incluso ahora, puedo sentirlo. Enterrado en algún lugar muy adentro. Mirándome. Esperando. Bruce Banner (Hulk)");
		listaMensajes.add("Recuerda que tu historia también es parte de la historia de otras personas. Superman");
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaMensajes.get(numero);
	}


}
