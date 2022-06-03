package br.adsis5s.entities;

import java.util.Objects;

public class Pessoa {

	private String nome;

	public Pessoa(String nome) {
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

		Pessoa pessoa = (Pessoa) o;

		return Objects.equals(nome, pessoa.nome);
	}

	@Override
	public int hashCode() {
		return nome != null ? nome.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				'}';
	}
}
