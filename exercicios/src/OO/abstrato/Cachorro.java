package OO.abstrato;

public class Cachorro extends Mamifero{
	@Override
	public String mover() {
		return "Usando Patas";
	}
	@Override
	public String mamar() {
	  return "Usando leite";
	}
}