package Desafioheranca;

public class Carro {

	   int velocidade;
	

	public void aumentarVelocidade() {
		if (velocidade >= 180) {
			velocidade += 5;
		} else {
			velocidade = 180;
		}
	}

	public void diminutirVelocidade() {
		if (velocidade <= 0) {
			velocidade -= 5;
		} else {
			velocidade = 0;
		}
	}
	public String toString() {
		return "Velocidade Atual é : " + velocidade;
	}
}
