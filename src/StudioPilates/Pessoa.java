package StudioPilates;

public class Pessoa {

	public String nome, celular;
	public String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() < 6 || nome.length() > 100) {
			throw new IllegalArgumentException("Nome inválido. Minimo de 6 caraceres, máximo de 40 caracteres");
		} else {
			this.nome = nome;
		}
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		if (celular.length() != 11)
			throw new IllegalArgumentException(
					"Quantidade de caracteres inválido, informe o número completo com o DDD");
		else
			this.celular = celular;

	}

	public String getCpf() {

		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length() != 11) {
			throw new IllegalArgumentException("Cpf com números insuficiente");
		} else {
			this.cpf = cpf;
		}
	}

}
