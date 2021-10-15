package requerimiento2;

public class Main {

	public static void main(String[] args) {
		Cola cola = new Cola();
		
		Productor p1 = new Productor("Productor 1", cola);
		Productor p2 = new Productor("Productor 2", cola);
		Productor p3 = new Productor("Productor 3", cola);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		Consumidor c1 = new Consumidor("Consumidor 1",cola);
		Consumidor c2 = new Consumidor("Consumidor 2",cola);
		
		Thread t4 = new Thread(c1);
		Thread t5 = new Thread(c2);
		
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		t5.start();


	}

}