package requerimiento2;

public class Main {

	public static void main(String[] args) {
		Cola cola = new Cola();
		
		Email email1 = new Email("1", "fractura pierna", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas en la pierna.");
		Email email2 = new Email("2", "miocarditis", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas de corazon.");
		Email email3 = new Email("3", "Pregunta Examen ", " hola profe relacionado con el examen de mañana queria preguntarte si hace falta entregarte tambien los trabajos");
		Email email4 = new Email("4", "miocarditis", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas de corazon.");
		Email email5 = new Email("5", "partido aplazado", " hola buenas queria comentar a las directivas de ambos equipos que mañana no se podra jugar el partido por condiciones meteorologicas.");
		Email email6 = new Email("6", "Pregunta Examen ", " Tambien queria comentarte profesor si al examen tambien se puede llevar calculadora cientifica");
		Email email7 = new Email("7", "Ganador Iphone 11 ", " Usted ha ganado el fabuloso movil de moda!!! vaya usted a recogerlo a la calle mirador de montepinar 25.");
		Email email8 = new Email("8", "Bet365", " Su apuesta a sido determinada como ganadora ya que el partido de NBA entre los LA.lakers vs Miami heat la ventaja de puntos a sido mayor a 20");
		Email email9 = new Email("9", "Mercadona", " Su compra de Mercadona ha sido confirmada la recibira en su domicilio en 24 horas. Gracias por su compromiso con nuestro supermercado.");
		
		Email email10 = new Email("10", "Policia Municipal", " Sr. Leonardo romani le comunicamos que ha sido sancionado por una conducta agresiva y desafiante ante la autoridad el dia 31/12/2020. El importe de la multa es: 1.479,89€. vaya usted a su comisaria mas cercana para realizar el pago. Un cordial saludo de su agente favorito.");
		Email email11 = new Email("1", "fractura pierna", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas en la pierna.");
		Email email12 = new Email("2", "miocarditis", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas de corazon.");
		Email email13 = new Email("3", "Pregunta Examen ", " hola profe relacionado con el examen de mañana queria preguntarte si hace falta entregarte tambien los trabajos");
		Email email14 = new Email("4", "miocarditis", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas de corazon.");
		Email email15 = new Email("5", "partido aplazado", " hola buenas queria comentar a las directivas de ambos equipos que mañana no se podra jugar el partido por condiciones meteorologicas.");
		Email email16 = new Email("6", "Pregunta Examen ", " Tambien queria comentarte profesor si al examen tambien se puede llevar calculadora cientifica");
		Email email17 = new Email("7", "Ganador Iphone 11 ", " Usted ha ganado el fabuloso movil de moda!!! vaya usted a recogerlo a la calle mirador de montepinar 25.");
		Email email18 = new Email("8", "Bet365", " Su apuesta a sido determinada como ganadora ya que el partido de NBA entre los LA.lakers vs Miami heat la ventaja de puntos a sido mayor a 20");
		Email email19 = new Email("9", "Mercadona", " Su compra de Mercadona ha sido confirmada la recibira en su domicilio en 24 horas. Gracias por su compromiso con nuestro supermercado.");
		
		Email email20 = new Email("10", "Policia Municipal", " Sr. Leonardo romani le comunicamos que ha sido sancionado por una conducta agresiva y desafiante ante la autoridad el dia 31/12/2020. El importe de la multa es: 1.479,89€. vaya usted a su comisaria mas cercana para realizar el pago. Un cordial saludo de su agente favorito.");
		Email email21 = new Email("1", "fractura pierna", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas en la pierna.");
		Email email22 = new Email("2", "miocarditis", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas de corazon.");
		Email email23 = new Email("3", "Pregunta Examen ", " hola profe relacionado con el examen de mañana queria preguntarte si hace falta entregarte tambien los trabajos");
		Email email24 = new Email("4", "miocarditis", " hola buenas queria comentarte que mañana no voy a poder asistir al trabajo por problemas de corazon.");
		Email email25 = new Email("5", "partido aplazado", " hola buenas queria comentar a las directivas de ambos equipos que mañana no se podra jugar el partido por condiciones meteorologicas.");
		Email email26 = new Email("6", "Pregunta Examen ", " Tambien queria comentarte profesor si al examen tambien se puede llevar calculadora cientifica");
		Email email27 = new Email("7", "Ganador Iphone 11 ", " Usted ha ganado el fabuloso movil de moda!!! vaya usted a recogerlo a la calle mirador de montepinar 25.");
		Email email28 = new Email("8", "Bet365", " Su apuesta a sido determinada como ganadora ya que el partido de NBA entre los LA.lakers vs Miami heat la ventaja de puntos a sido mayor a 20");
		Email email29 = new Email("9", "Mercadona", " Su compra de Mercadona ha sido confirmada la recibira en su domicilio en 24 horas. Gracias por su compromiso con nuestro supermercado.");
		Email email30 = new Email("10", "Policia Municipal", " Sr. Leonardo romani le comunicamos que ha sido sancionado por una conducta agresiva y desafiante ante la autoridad el dia 31/12/2020. El importe de la multa es: 1.479,89€. vaya usted a su comisaria mas cercana para realizar el pago. Un cordial saludo de su agente favorito.");
		
		Email[] array1= {email1,email2,email3,email4,email5,email6,email7,email8,email9,email10};
		Email[] array2= {email11,email12,email13,email14,email15,email16,email17,email18,email19,email20};
		Email[] array3= {email21,email22,email23,email24,email25,email26,email27,email28,email29,email30};
		
		Productor p1 = new Productor("Manolo72",cola,array1);
		Consumidor c1 = new Consumidor("Javinto benavente",cola,array1);
		
		
		Productor p2 = new Productor("Amancio Ortega",cola,array2);
		Consumidor c2 = new Consumidor("Paca pacheco",cola,array2);
		
		Productor p3 = new Productor("German palomares",cola,array3);

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		Thread t4 = new Thread(c1);
		Thread t5 = new Thread(c2);
		
		t1.start(); 
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}