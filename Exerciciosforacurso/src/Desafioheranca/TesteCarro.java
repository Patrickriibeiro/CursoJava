package Desafioheranca;

public class TesteCarro {
	public static void main(String[] args) {

		Carro ferrari = new Ferrari();
		Carro civic = new Civic();
		

		civic.aumentarVelocidade();
		civic.aumentarVelocidade();
		civic.aumentarVelocidade();

		ferrari.aumentarVelocidade();
		ferrari.aumentarVelocidade();
		ferrari.aumentarVelocidade();
		
		System.out.println(ferrari);
		
		
		
	}
}
