package br.adsis5s.usecases.data.input;

import java.util.Objects;

public class NoivosInput {

	private String nomePessoa1;
	private String nomePessoa2;

	public NoivosInput(String nomePessoa1, String nomePessoa2) {
		this.nomePessoa1 = nomePessoa1;
		this.nomePessoa2 = nomePessoa2;
	}

	public String getNomePessoa1() {
		return nomePessoa1;
	}

	public String getNomePessoa2() {
		return nomePessoa2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		NoivosInput that = (NoivosInput) o;
		return Objects.equals(nomePessoa1, that.nomePessoa1) && Objects.equals(nomePessoa2, that.nomePessoa2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomePessoa1, nomePessoa2);
	}

	@Override
	public String toString() {
		return "NoivosInput{" +
				"nomePessoa1='" + nomePessoa1 + '\'' +
				", nomePessoa2='" + nomePessoa2 + '\'' +
				'}';
	}
}
