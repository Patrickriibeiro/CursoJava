package Classe;

public class AreaCirc {
	
	double raio;
	
	static double PI = 3.14;
	
	AreaCirc(double raioInicial){
		raio = raioInicial; 

	}
	
	AreaCirc(){
		
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
    static double area(double raio) {
    	return PI * Math.pow(raio, 2);
    }
}


