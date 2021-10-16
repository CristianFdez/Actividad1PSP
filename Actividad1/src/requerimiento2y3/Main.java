package requerimiento2y3;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el objeto cola donde almacenaremos los emails.
		Cola cola = new Cola();
		
		//Creamos los Productores que serán los encargados de crear el email e introducirlo en la cola.
		Productor p1 = new Productor("Productor 1", cola);
		Productor p2 = new Productor("Productor 2", cola);
		Productor p3 = new Productor("Productor 3", cola);
		
		//Aquí asociamos cada Productor a su hilo correspondiente.
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		//Creamos los Consumidores que serán los encargados de retirar el email de la cola y enviarlo.
		Consumidor c1 = new Consumidor("Consumidor 1",cola);
		Consumidor c2 = new Consumidor("Consumidor 2",cola);
		
		//Aquí asociamos cada Consumidor a su hilo correspondiente.
		Thread t4 = new Thread(c1);
		Thread t5 = new Thread(c2);
		
		//Iniciamos los hilos para que se ejecuten todos a la vez.
		t1.start();
		t2.start();
		t3.start();		
		t4.start();
		t5.start();


	}

}