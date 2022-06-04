package br.adsis5s.gateway;

public class CriarPessoaCommand {

	private String nome;

	public CriarPessoaCommand() {
	}

	public CriarPessoaCommand(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
