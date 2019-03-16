package br.com.bancodados2;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAOList implements PessoaDAO {
	List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void Cadastra(Pessoa pessoa) {
		pessoas.add(pessoa);
	}

	public void Excluir(Pessoa pessoa) {
		pessoas.remove(pessoa);

	}

	public Pessoa ObtemPessoaPor(String nome) {
		Pessoa buscada = null;
		for (int i = 0; i < pessoas.size(); i++) {
			if (nome.equals(pessoas.get(i).get_nome())) {
				buscada = pessoas.get(i);

			}
		}
		return buscada;
	}

	public List<Pessoa> TodasAsPessoas() {
		// TODO Auto-generated method stub
		return this.pessoas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * DESENVOLVEDOR=WALNEY NEGREIROS GOMES
	 * CURSO=BANCO DE DADOS 2
	 * 
	 * 
	 * 
	 * *
	 */

}
