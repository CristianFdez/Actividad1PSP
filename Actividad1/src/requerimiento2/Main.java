package requerimiento2;

public class Main {

	public static void main(String[] args) {
		ColaCartas cola = new ColaCartas();
		
		ProductorCartas p1 = new ProductorCartas("Productor 1", cola);
		ProductorCartas p2 = new ProductorCartas("Productor 2", cola);
		ProductorCartas p3 = new ProductorCartas("Productor 3", cola);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		ConsumidorCartas c1 = new ConsumidorCartas("Consumidor 1",cola);
		ConsumidorCartas c2 = new ConsumidorCartas("Consumidor 2",cola);
		
		Thread t4 = new Thread(c1);
		Thread t5 = new Thread(c2);
		
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		t5.start();


	}

}