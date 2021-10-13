package fundamentos.numericos;

public class Tiposprimitivos {
	public static void main(String[] args) {
		// informações do funcionario
		
		// tipos de numéricos inteiros 
		
		byte anosdeempresa = 127;
		short numerodevoos = 542;
		int id = 56789;
		long pontosacumulados = 3_134_845_223L;
                     
		// Tipos numeros com pontos flutuantes
		
		float salario = 11_445_44F;
		
		double Vendasacumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		
		Boolean Estadeferias = false;
		
		//	tipo caractere
		
		char status = 'a'; //ativo
		
		//Dias de empresa
		
		System.out.println(anosdeempresa * 365);
		
		//numero de viagens
		
		System.out.println(numerodevoos / 2 );
		
		//Pontos por real 
		
		System.out.println(pontosacumulados / Vendasacumuladas );
		
		System.out.println(id + "ganha -> " + salario);
		System.out.println(Estadeferias + "Está de ferias");
		System.out.println(status + "status");
	}

}
