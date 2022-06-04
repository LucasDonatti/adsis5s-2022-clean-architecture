package br.adsis5s.gateway;

public class CriarMatrimonioCommand {

	private String nomePessoa1;
	private String nomePessoa2;

	public CriarMatrimonioCommand(String nomePessoa1, String nomePessoa2) {
		this.nomePessoa1 = nomePessoa1;
		this.nomePessoa2 = nomePessoa2;
	}

	public String getNomePessoa1() {
		return nomePessoa1;
	}

	public String getNomePessoa2() {
		return nomePessoa2;
	}
}
