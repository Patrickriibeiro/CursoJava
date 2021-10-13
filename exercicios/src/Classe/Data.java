package Classe;

public class Data {
	
       
	int dia ;
       int mes ;
       int ano ;
       
       
       Data(){
         // dia = 1;
    	 // mes = 1;
    	 //ano = 1970;
    	 this(1,1,1970);  
       }
       Data(int Dia , int Mes , int Ano){
    	  this.dia = Dia;
    	  this.mes = Mes;
    	  this.ano = Ano;
       }
       
      String ObterDataFormatada() {
    	final String formato = "%d/%d/%d";
    	return String.format(formato + this.dia ,this.mes , this.ano);     
}
      void imprimirDataFormatada() {
    	  System.out.println(this.ObterDataFormatada());
      }
}
