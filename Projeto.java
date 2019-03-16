package br.com.bancodados2;

import java.io.EOFException;
import java.util.Scanner;

public class Projeto {
	public static void main(String[] args) throws EOFException {
		PessoaDAO pessoaDAO = null;
		Scanner sc1 = new Scanner(System.in);
		String teclado = sc1.nextLine();
		if ("jpdc".equals(teclado)) {
			pessoaDAO = FactoryPessoa.criarPessoa(EnumDAO.JDBC);
		} else if ("listaDAO".equals(teclado)) {
			pessoaDAO = FactoryPessoa.criarPessoa(EnumDAO.LISTA);

		}

		Pessoa pessoa = new Pessoa();
		pessoa.set_nome("Marta");
		pessoa.set_idade(60);
		pessoa.set_cpf("34412333-23");

		pessoaDAO.Cadastra(pessoa);

	}

}
