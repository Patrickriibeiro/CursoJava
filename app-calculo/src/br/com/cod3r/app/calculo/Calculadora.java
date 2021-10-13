package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {
	
	private OperacoesAritmeticas apAritimeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return apAritimeticas.soma(nums);
	}
	
	
}
