package generics;

public class Par<C, V> {

	private C Chave;
	private V valor;

	public Par() {

	}

	public Par(C chave, V valor) {
		super();
		Chave = chave;
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Chave == null) ? 0 : Chave.hashCode());
		return result;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par other = (Par) obj;
		if (Chave == null) {
			if (other.Chave != null)
				return false;
		} else if (!Chave.equals(other.Chave))
			return false;
		return true;
	}

	public C getChave() {
		return Chave;
	}

	public void setChave(C chave) {
		Chave = chave;
	}

	public V getValor() {
		return valor;
	}

	public void setValor(V valor) {
		this.valor = valor;
	}

}
