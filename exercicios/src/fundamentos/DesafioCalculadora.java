package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
	
	
	Scanner Entrada = new Scanner(System.in);
	
	System.out.print("Informe o número : ");
	double num1 = Entrada.nextDouble();
	
	System.out.print("Informe o número : ");
	double num2 = Entrada.nextDouble();
	
	System.out.print("Informe o operador : ");
	String Op = Entrada.next();
 
	//Lógica
	
	double resultado = "+".equals(Op) ? num1 + num2 : 0;
	resultado = "-".equals(Op) ? num1 - num2 : resultado;
	resultado = "*".equals(Op) ? num1 * num2 : resultado;
	resultado = "/".equals(Op) ? num1 / num2 : resultado;
	resultado = "%".equals(Op) ? num1 % num2 : resultado;
	
	System.out.printf(" %.2f %s %.2f = %.2f" , num1, Op, num2,resultado);
	
	Entrada.close();
	
	
	

}
}