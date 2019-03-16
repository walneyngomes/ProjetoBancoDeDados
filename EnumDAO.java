package br.com.bancodados2;

public enum EnumDAO {
	JDBC("JDBC"), LISTA("listaDAOPessoa");

	public String tipo;

	EnumDAO(String tip) {
		this.tipo = tip;
	}

	public String getTipo() {
		return tipo;
	}
}
