package OO.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligaar;
	private boolean ligarturbo;

	Ferrari() {
		super(315);
	}

	Ferrari(int velocidadedeMaxima) {
		super(velocidadedeMaxima);
		setDelta(15);
	}

	void acelerar() {
		super.acelerar();

	}

	public void ligarTurbo() {
		ligarturbo = true;

	}

	public void desligarTurbo() {
		ligarturbo = false;

	}

	public void ligarArcondicionado() {
		ligaar = true;
	}

	public void desligarArcondicionado() {
		ligaar = false;
	}
	@Override
	public int getDelta() {
		if(ligarturbo && !ligaar) {
			return 35;
		}else if(ligarturbo && ligaar) {
			return 30;
		} else if(!ligarturbo && ligaar) {
			return 20;
		}else {
			return 15;
		}
	}
}
