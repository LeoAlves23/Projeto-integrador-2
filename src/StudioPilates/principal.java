package StudioPilates;

import java.io.IOException;
import java.util.Scanner;

public class principal {

	public static void main(String args[]) throws IOException {

		Scanner leia = new Scanner(System.in);
		String nome, celular, cpf;
		char funcao;
		int id_professor;
		String email = null, objetivo = null, obs = null;
		int id_modalidade;
		char tipo;
		float hora;
		String data, usuario;
		int op = 0;
		
		try {
			Pessoa pessoa = new Pessoa();
			Professor professor = new Professor();
			Aluno aluno = new Aluno();

			System.out.println("Informe quem vai ser cadastrado : (A)- aluno ou (P)-Professor");
			System.out.println("9 = fechar o programa");
			usuario = leia.nextLine();

			switch (usuario) {

			case "a":

				System.out.print("Digite seu nome: ");
				nome = leia.nextLine();
				pessoa.setNome(nome);

				System.out.println("Informe o celular: ");
				celular = leia.nextLine();
				pessoa.setCelular(celular);

				System.out.println("Informe o cpf: ");
				cpf = leia.nextLine();
				pessoa.setCpf(cpf);

				System.out.println("Informe o email: ");
				email = leia.nextLine();
				aluno.setEmail(email);

				System.out.println("Informe o objetivo: ");
				objetivo = leia.nextLine();
				aluno.setObjetivo(objetivo);

				System.out.println("Informe a observação do aluno: ");
				obs = leia.nextLine();
				aluno.setObs(obs);

				System.out.println(
						"==========================================================================================================");
				System.out.println("Nome: " + nome);
				System.out.println("e-mail: " + email);
				System.out.println("celular: " + celular);
				System.out.println("Cadastro concluido");
				System.out.println(
						"==========================================================================================================");
				break;

			case "p":
				System.out.print("Digite seu nome: ");
				nome = leia.nextLine();
				pessoa.setNome(nome);

				System.out.println("Informe o celular: ");
				celular = leia.nextLine();
				pessoa.setCelular(celular);

				System.out.println("Informe o cpf: ");
				cpf = leia.nextLine();
				pessoa.setCpf(cpf);

				System.out.println("Infome a função (P) - Pilates ; (M)- Musculação: ");
				funcao = (char) System.in.read();
				professor.setFuncao(funcao);

				System.out.println("Informe o id do professor: ");
				id_professor = leia.nextInt();
				professor.setId_professor(id_professor);

				System.out.println(
						"==========================================================================================================");
				System.out.println("Nome: " + nome);
				System.out.println("celular: " + celular);
				System.out.println("Funçao: " + funcao);
				System.out.println("Cadastro concluido");
				System.out.println(
						"==========================================================================================================");

			}

		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());

		}
	}
}
