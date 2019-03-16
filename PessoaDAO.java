package br.com.bancodados2;

import java.util.List;

public interface PessoaDAO {
	public void Cadastra(Pessoa pessoa);
	public void Excluir(Pessoa pessoa);
	public Pessoa ObtemPessoaPor(String nome);
	public List<Pessoa> TodasAsPessoas();
	

}
