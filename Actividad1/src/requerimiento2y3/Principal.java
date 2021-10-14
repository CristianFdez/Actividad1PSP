package requerimiento2y3;

public class Principal {

	public static void main(String[] args) {
		BufferCartas buffer = new BufferCartas();
		
		Productor p1 = new Productor("Productor 1", buffer);
		Thread tp1 = new Thread(p1);
		
		Productor p2 = new Productor("Productor 2", buffer);
		Thread tp2 = new Thread(p2);
		
		Productor p3 = new Productor("Productor 3", buffer);
		Thread tp3 = new Thread(p3);
		
		ConsumidorEmails c1 = new ConsumidorEmails("Consumidor 1", buffer);
		Thread tc1 = new Thread(c1);
		
		ConsumidorEmails c2 = new ConsumidorEmails("Consumidor 2", buffer);
		Thread tc2 = new Thread(c2);
		
		tp1.start();
		tp2.start();
		tp3.start();
		
		tc1.start();
		tc2.start();
	}

}
