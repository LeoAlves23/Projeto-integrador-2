package StudioPilates;

public class Aluno extends Pessoa {

	private String email, objetivo, obs, id_aluno;

	public String getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(String id_aluno) {
		this.id_aluno = id_aluno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		if (objetivo.length() > 255) {
			throw new IllegalArgumentException("Quantidade de caracteres inválidos.");
		} else {
			this.objetivo = objetivo;
		}
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		if (obs.length() > 255) {
			throw new IllegalArgumentException("Quantidade de caracteres inválidos.");
		} else {
			this.obs = obs;
		}
	}
}
