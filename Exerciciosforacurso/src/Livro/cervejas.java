package Livro;

public class cervejas {
	public static void main(String[] args) {
		int cervejas = 99;
		String garrafas = "garrafas";

		while (cervejas > 0) {

			if (cervejas == 1) {
				garrafas = "garrafa";
			}

			System.out.println(cervejas + " " + garrafas + " de cerveja na parede");
			System.out.println("desce mais uma");
			System.out.println("Passe adiante");
			cervejas = cervejas - 1;

			if (cervejas == 0) {
				System.out.println("Não há mais garrafas de cerveja na parede");
			}
		}
	}
}
