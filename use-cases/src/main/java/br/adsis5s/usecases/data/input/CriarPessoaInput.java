package br.adsis5s.usecases.data.input;

import java.util.Objects;

public class CriarPessoaInput {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CriarPessoaInput that = (CriarPessoaInput) o;
		return Objects.equals(nome, that.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public String toString() {
		return "CriarPessoaInput{" +
				"nome='" + nome + '\'' +
				'}';
	}
}
