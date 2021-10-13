package OO.Encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
        Pessoa p1 = new Pessoa(105 , "Pedro" , "Cardo" , "Cardozo");
        
       System.out.println(p1.getIdade());   
       
       p1.setIdade(-30);
       
       System.out.println(p1.toString());
       
       System.out.println(p1.nomeCompleto());
	}
}
