package OO.heranca.desafio;

public class Carroteste {

	public static void main(String[] args) {
		

		Carro c1 = new Civic();
		c1.acelerar();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(400);
		
		c2.acelerar();
		c2.ligarTurbo();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
			
		
}
}
