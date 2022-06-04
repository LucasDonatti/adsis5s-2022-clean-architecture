package br.adsis5s.gateway;

public class CriarPessoaCommand {

	private String nome;

	public CriarPessoaCommand(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
