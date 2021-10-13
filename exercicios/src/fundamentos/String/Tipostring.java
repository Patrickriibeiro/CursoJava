package fundamentos.String;

public class Tipostring {
	
	public static void main(String[] args) {
		System.out.println("olá pessoal".charAt(0));
		
		String S = "Boa tarde";
		System.out.println(S.concat("!!!!"));
		System.out.println(S + "!!!!");
		System.out.println(S.startsWith("Boa"));
		System.out.println(S.toLowerCase().startsWith("boa"));
		System.out.println(S.toUpperCase().endsWith("tarde"));
		System.out.println(S.length());
		System.out.println(S.toLowerCase().equals("Boa tarde"));
		System.out.println(S.equalsIgnoreCase("Boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.789;
		
		System.out.println("Nome : " + nome +"\n sobrenome : " + sobrenome + "\n idade : " + idade + " \n salario : " + salario );
		
		System.out.printf("O senhor: %S %S", nome , sobrenome);
		
		String frase = String.format("O senhor: %S %S", nome , sobrenome);
		
		System.out.println(frase);
		
		System.out.println("Frase Qualquer".contains("Qualquer"));
		System.out.println("Frase Qualquer".indexOf("qual"));
		System.out.println("Frase Qualquer".substring(6));
		System.out.println("Frase Qualquer".substring(6,8));
		
		
	}

}
