package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
    	
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguardar(2.3); // double -> Double;
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixab = new CaixaObjeto();
		caixab.aguardar(2.3); // double -> Double;
		
		String coisab = (String) caixaA.abrir();
		System.out.println(coisab);
	}
}
