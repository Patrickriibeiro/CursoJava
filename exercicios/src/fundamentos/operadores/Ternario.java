package fundamentos.operadores;

public class Ternario {
public static void main(String[] args) {
	double media = 7.6;
	
    String resultadoParcial = media >= 5.0 ? "Recupera��o" : "Reprovado";
	
	String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial; 
	
	System.out.println("O aluno est� " + resultadoFinal);
	
	boolean BomComportamento = false;
	boolean passouPorMedia = media >= 7.0;
	boolean TemDesconto = BomComportamento && passouPorMedia;
	
	String Resultado = TemDesconto ? "Sim" : "N�o";
	
	System.out.printf("Tem desconto ? %s " , Resultado);
}
}
 