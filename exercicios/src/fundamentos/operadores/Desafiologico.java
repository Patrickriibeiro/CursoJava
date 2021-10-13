package fundamentos.operadores;

public class Desafiologico {
	public static void main(String[] args) {
		
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário !
		
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("comprou tv 50\"?" + comprouTv50);
		System.out.println("comprou tv 32\"?" + comprouTv32);
		System.out.println("comprou tv 32\"Sorvete" + comprouSorvete);
		System.out.println("Mais saudável ?" + maisSaudavel);
		
	}

}
