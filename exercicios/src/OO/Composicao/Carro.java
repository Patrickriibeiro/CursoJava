package OO.Composicao;

public class Carro {
  
   Motor motor ;
   
   Carro(){
	  this.motor = new Motor(this); 
   }
   
   
   void acelerar() {
	   if(motor.FatodeInjecao > 2.6) {
	   motor.FatodeInjecao += 0.4;
	   }
   }
   void frear() {
	   if(motor.FatodeInjecao > 0.5) {
		   motor.FatodeInjecao -= 0.4;   
	   }
	  
   }
   void ligar() {
	   motor.ligado = true; 
   }
   void desligar() {
	   motor.ligado = false;
   }
   boolean estaligado() {
	   return motor.ligado;
   }
}
