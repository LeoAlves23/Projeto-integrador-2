package StudioPilates;

public class Modalidade {

	private int id_modalidade;
	private char tipo;

	public int getId_modalidade() {
		return id_modalidade;
	}

	public void setId_modalidade(int id_modalidade) {
		if (id_modalidade < 0) {
			throw new IllegalArgumentException("Id inválido");
		} else {
			this.id_modalidade = id_modalidade;
		}
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		if ((tipo != 'P') && (tipo != 'M')) {
			throw new IllegalArgumentException("Tipo inválido");
		} else {
		this.tipo = tipo;
	}

	

	}
}