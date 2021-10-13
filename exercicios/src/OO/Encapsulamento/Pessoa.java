package OO.Encapsulamento;

public class Pessoa {
	private String nome;
	private String sobrenome;
    private String lastname; 
    
	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		lastname = lastName;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private int idade;

	public Pessoa(int idade,String nome , String sobrenome , String lastname) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
		setLastName(lastname);
	}

	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 110) {
			this.idade = novaIdade;
		}
	}
	public String toString() {
		return "Olá eu sou " + getNome() + getSobrenome() + "e tenho " + getIdade() + " anos.";
	}
	
	public String nomeCompleto() {
		return "´Primeiro nome : " + getNome() + " Segundo nome : " + getSobrenome() + " Ultimo nome : " + getLastName();
	}
}
