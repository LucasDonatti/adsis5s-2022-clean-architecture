package br.adsis5s.interfaces.persistence;

import java.util.Objects;

public class PessoaPO {
	private String nome;

	public PessoaPO(String nome) {
		this.nome = nome;
	}

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
		PessoaPO pessoaPO = (PessoaPO) o;
		return Objects.equals(nome, pessoaPO.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public String toString() {
		return "PessoaPO{" +
				"nome='" + nome + '\'' +
				'}';
	}
}
