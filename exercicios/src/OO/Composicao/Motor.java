package OO.Composicao;

public class Motor {
     Carro carro;
	 boolean ligado = false;
	 double FatodeInjecao = 1;
	 
	 Motor(Carro carro){
		 
		 this.carro = carro;
	 }
	 
	 int giros() {
		 if(!ligado) {
		    
			 return 0; 
		 }else {
			return (int) Math.round(FatodeInjecao * 3000); // Arredendo para cima;
		}
	 } 
}
