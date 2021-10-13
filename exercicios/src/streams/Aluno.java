package streams;

public class Aluno {

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (comportamento == null) {
			if (other.comportamento != null)
				return false;
		} else if (!comportamento.equals(other.comportamento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}

	final String nome;
	final double nota;
	final Boolean comportamento;

	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, double nota, Boolean comportamento) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.comportamento = comportamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comportamento == null) ? 0 : comportamento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public String ToString() {
		return nome + " tem nota " + nota;
	}

}
