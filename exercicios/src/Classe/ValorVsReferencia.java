package Classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
	 
 double a = 2;
 double b = a; // atribui��o por valor (Tipo primitivo)
 
 System.out.println(a + " " + b);
 
 Data d1 = new Data(1,6,2022);
 Data d2 = d1; // Atribui��o por referencia (Objeto)
 
 d1.ano = 31 ;
 d2.mes = 12;
 
 d1.ano = 2025;
 
 System.out.println(d1.ObterDataFormatada());
 System.out.println(d2.ObterDataFormatada()); 
 
 voltarDataParaValorPadr�o(d1);
 
 System.out.println(d1.ObterDataFormatada());
 System.out.println(d2.ObterDataFormatada());
 
 int c = 5;
 alterarPrimitivo(c);
 System.out.println(c);
}
	static void voltarDataParaValorPadr�o(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	static void alterarPrimitivo(int c) {
		c++;
	}
	
}
