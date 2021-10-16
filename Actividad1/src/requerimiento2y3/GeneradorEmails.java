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
		listaDestinatarios.add("rodrigogon54@gmail.es");
		listaDestinatarios.add("asuncion4567@gmail.es");
		listaDestinatarios.add("sipodemos68@gmail.es");
		listaDestinatarios.add("fdefernando90@gmail.es");
		listaDestinatarios.add("lucashernandez@gmail.es");
		listaDestinatarios.add("martinamartina@gmail.org");
		listaDestinatarios.add("sergiosergiosergio@gmail.com");
		listaDestinatarios.add("perez@gmail.es");
		listaDestinatarios.add("gomez@gmail.es");
		listaDestinatarios.add("martin@gmail.es");
		listaDestinatarios.add("jimenez@gmail.es");
		listaDestinatarios.add("hernandezhernandez@gmail.com");
		listaDestinatarios.add("joseruiz@gmail.es");
		listaDestinatarios.add("luisdiaz@gmail.es");
		listaDestinatarios.add("Azucarmoreno@gmail.es");
		listaDestinatarios.add("Davidmuñoz@gmail.es");
		listaDestinatarios.add("Nuñezalvarez@gmail.es");
		listaDestinatarios.add("romeroSantos354@gmail.es");
		listaDestinatarios.add("gustavogutierrez@gmail.es");
		listaDestinatarios.add("fernandoalonso@gmail.es");
		listaDestinatarios.add("bombanavarro@gmail.es");
		listaDestinatarios.add("fernandotorres@gmail.es");
		listaDestinatarios.add("dominguez@gmail.es");
		listaDestinatarios.add("kevinvazquez@gmail.es");
		listaDestinatarios.add("luciaramos@gmail.es");
		listaDestinatarios.add("albertoramirez@gmail.es");
		listaDestinatarios.add("luciagil@gmail.es");
		listaDestinatarios.add("carlosserrano@gmail.es");
		listaDestinatarios.add("tirsodemolina@gmail.org");
		listaDestinatarios.add("pikachu@gmail.com"); // este email lo añadimos pero no queremos que se meta en la cola.
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaDestinatarios.get(numero);
	}
	
	public String generarRemitente() {
		// Necesitamos 30 remitentes diferentes, por lo que nos creamos un ArrayList para guardar los datos
		List<String> listaRemitentes = new ArrayList<String>();
		listaRemitentes.add("morales@gmail.es");
		listaRemitentes.add("luissuarez@gmail.es");
		listaRemitentes.add("davidortega@gmail.es");
		listaRemitentes.add("luiscastro@gmail.es");
		listaRemitentes.add("javierdelgado@gmail.es");
		listaRemitentes.add("olgaortiz@gmail.es");
		listaRemitentes.add("gustavomarin@gmail.es");
		listaRemitentes.add("tomasrubio@gmail.es");
		listaRemitentes.add("nunez@gmail.es");
		listaRemitentes.add("carlossainz@gmail.es");
		listaRemitentes.add("halaandmedina@gmail.es");
		listaRemitentes.add("rodrigoiglesias@gmail.es");
		listaRemitentes.add("pantanocastillo@gmail.es");
		listaRemitentes.add("jolisincortes@gmail.es");
		listaRemitentes.add("kolongarrido@gmail.es");
		listaRemitentes.add("inglissantos@gmail.es");
		listaRemitentes.add("estherguerrero@gmail.es");
		listaRemitentes.add("lucaslozano@gmail.es");
		listaRemitentes.add("nuriacano@gmail.es");
		listaRemitentes.add("oscarmendez@gmail.es");
		listaRemitentes.add("mariamarcruz@gmail.es");
		listaRemitentes.add("luisprieto@gmail.es");
		listaRemitentes.add("lolaflores@gmail.es");
		listaRemitentes.add("herrera@gmail.es");
		listaRemitentes.add("pena@gmail.es");
		listaRemitentes.add("leon@gmail.es");
		listaRemitentes.add("marcmarquez@gmail.es");
		listaRemitentes.add("luciagallego@gmail.es");
		listaRemitentes.add("joseangelcabrera@gmail.es");
		listaRemitentes.add("peinadocalvo@gmail.es");
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaRemitentes.get(numero);
	}
	
	public String generarAsunto() {
		// Necesitamos 30 asuntos diferentes, por lo que nos creamos un ArrayList para guardar los datos
		List<String> listaAsuntos = new ArrayList<String>();

		
		listaAsuntos.add("Usted a sido sancionado por mala actitud");
		listaAsuntos.add("sus mejores llantas al 20% de descuento");
		listaAsuntos.add("vive un halloween de locura");
		listaAsuntos.add("Si no reformas tu casa es porque no quieres, nosotros le facilitamos todo");
		listaAsuntos.add("Regalamos un viaje para dos personas con todo incluido a las maldivas");
		listaAsuntos.add("bet365");
		listaAsuntos.add("su banco bbva le notifica");
		listaAsuntos.add("Consiga ya su oferta en quieromioferta.com");
		listaAsuntos.add("su cuenta para comegusanos");
		listaAsuntos.add("vivefeliz.com");
		listaAsuntos.add("compratusentradas.com");
		listaAsuntos.add("san valentin viene ya");
		listaAsuntos.add("orange");
		listaAsuntos.add("Sportium");
		listaAsuntos.add("conoce tu madrid");
		listaAsuntos.add("nos transladamos");
		listaAsuntos.add("Lidl");
		listaAsuntos.add("yoigo");
		listaAsuntos.add("Bonoloto te espera");
		listaAsuntos.add("chocolateria loles");
		listaAsuntos.add("finalizar inscripcion");
		listaAsuntos.add("Amazon");
		listaAsuntos.add("Mercadona");
		listaAsuntos.add("tu restaurante Ribs");
		listaAsuntos.add("Axe" );
		listaAsuntos.add("el paraiso tu local de celebraciones");
		listaAsuntos.add("pescaderia paco");
		listaAsuntos.add("regalasonrisas.com");
		listaAsuntos.add("Mtuning performace");
		listaAsuntos.add("Concesionarios BMW");
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaAsuntos.get(numero);
	}

	
	public String generarCuerpoMensaje() {
		// Necesitamos 30 cuerpos de mensaje diferentes, por lo que nos creamos un ArrayList para guardar los datos
		List<String> listaMensajes = new ArrayList<String>();
	
		listaMensajes.add("Policia nacional infraccion");
		listaMensajes.add("ahora por realizar una compra en tienda se llevara un 20% en nuestra llantas");
		listaMensajes.add("en el parque de atraccion invitamos a su acompañante para que disfruteis de una noche epica!!");
		listaMensajes.add("en reformatucasa le ofrecemos los mejores precios para reformar su casa");
		listaMensajes.add("ahora con su tarjeta mastercard entrara en un sorteo para este fabuloso viaje");
		listaMensajes.add("Su apuesta de bet365 a sido detreminada con un importe de 34.76€");
		listaMensajes.add("Su informe del banco bbva a siod actualizado");
		listaMensajes.add("introduzca sus datos personales en este formulacion y nosotros nos encargamos de todo");
		listaMensajes.add("su cuenta para comegusanos a sido creada pinvhe aqui para meterse en nuestra web");
		listaMensajes.add("El mejor momento es estar a nuestro lado por eso queremos compensarle con 20€ de descuento");
		listaMensajes.add("Entradas compradas para el concierto de myke towers");
		listaMensajes.add("En el Día de San Valentín, usted merece un buen regalo");
		listaMensajes.add("quiere usted cambiar su telefono movil, contactenos");
		listaMensajes.add("ya tiene su bonus descuento para apuesta de 5€");
		listaMensajes.add("es usted de madrid y aun no lo conoce ven con nostros a disfrutarlo!!!");
		listaMensajes.add("Su tienda de boutique para el automvil se translada a calle ferran barreiros 11");
		listaMensajes.add("corra y ahorre con nosotros en nuestros supermecados Lidl");
		listaMensajes.add("no esta contento con su tarifa plana de movil llamenos al 678787860");
		listaMensajes.add("la suerte le quiere sonreir eche hoy su bonoloto y gane un bote de 1.000.000€");
		listaMensajes.add("te tenta el chocolate nosotros tenemos los mejores");
		listaMensajes.add("24 horas para finalidad su inscripcion");
		listaMensajes.add("compra realizada a amazon");
		listaMensajes.add("compra realizada a mercadona");
		listaMensajes.add("quiere usted cenar gratis hoy jueves 2X1 en cenas");
		listaMensajes.add("harto de oler mal consiga nuestro desodorantpor menos de lo que piensas" );
		listaMensajes.add("su local de confianza para realizar sus eventos");
		listaMensajes.add("ya llego el pescado mas fresco del mar cantabrico a su pescaderia");
		listaMensajes.add("el mejor regalo para su pareja lo encontrara en nuestra web");
		listaMensajes.add("Su silencioso akrapovik por el modico precio de 299.99€");
		listaMensajes.add("se quiere levantar todos los dias con una sonrisa pues acuda a nuestros concesionarios bmw y llevate un coche");
		
		int numero = ThreadLocalRandom.current().nextInt(0,30);
		
		return listaMensajes.get(numero);
	}


}