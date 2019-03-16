package br.com.bancodados2;

public class FactoryPessoa {
	private static FactoryPessoa fabrica = null;

	private FactoryPessoa() {
		System.out.print("UMA FABRICA");
	}

	public static PessoaDAO criarPessoa(EnumDAO tipo) {
		PessoaDAO pessoa = null;
		if ("JDBC".equals(tipo)) {
			pessoa = new JDBCPessoaDAO();
		} else if ("listaDAOPessoa".equals(tipo)) {
			pessoa = new PessoaDAOList();
		}

		return pessoa;
	}

	public static FactoryPessoa instanciaFactoryPessoa() {
		if (fabrica.equals(null)) {
			fabrica = new FactoryPessoa();
		}
		return fabrica;
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
