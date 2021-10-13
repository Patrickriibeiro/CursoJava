package Desafioheranca;

public class Civic extends Carro implements Modificadores {
	boolean ligarturbo;
	boolean desligarturbo;

	@Override
	public void aumentarVelocidade() {
		super.aumentarVelocidade();
	}

	@Override
	public void diminutirVelocidade() {
		// TODO Auto-generated method stub
		super.diminutirVelocidade();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void ligarTurbo() {
		ligarturbo = true;

	}

	@Override
	public void desligarTurbo() {
		desligarturbo = false;
	}
	@Override
	public String ligarArCondicionado(int temperatura) {
		// TODO Auto-generated method stub
		return Modificadores.super.ligarArCondicionado(temperatura);
	}
	@Override
	public String desligarArCondionado() {
		// TODO Auto-generated method stub
		return Modificadores.super.desligarArCondionado();
	}
	
	
}
