package StudioPilates;

public class Professor extends Pessoa {

	private char funcao;
	private int id_professor;

	public char getFuncao() {
		return funcao;
	}

	public void setFuncao(char funcao) {
		if ((funcao != 'p') && (funcao != 'm')) {
			throw new IllegalArgumentException("Função inválida");
		} else {
			this.funcao = funcao;
		}
	}

	public int getId_professor() {
		return id_professor;
	}

	public void setId_professor(int id_professor) {
		this.id_professor = id_professor;
	}
}
