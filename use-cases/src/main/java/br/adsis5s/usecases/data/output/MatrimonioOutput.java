package br.adsis5s.usecases.data.output;

import java.time.LocalDateTime;
import java.util.Objects;

public class MatrimonioOutput {

	private String nomePessoa1;
	private String nomePessoa2;
	private LocalDateTime dataHoraCelebracao;

	public MatrimonioOutput(String nomePessoa1, String nomePessoa2, LocalDateTime dataHoraCelebracao) {
		this.nomePessoa1 = nomePessoa1;
		this.nomePessoa2 = nomePessoa2;
		this.dataHoraCelebracao = dataHoraCelebracao;
	}

	public String getNomePessoa1() {
		return nomePessoa1;
	}

	public String getNomePessoa2() {
		return nomePessoa2;
	}

	public LocalDateTime getDataHoraCelebracao() {
		return dataHoraCelebracao;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MatrimonioOutput that = (MatrimonioOutput) o;
		return Objects.equals(nomePessoa1, that.nomePessoa1) && Objects.equals(nomePessoa2, that.nomePessoa2) && Objects.equals(dataHoraCelebracao, that.dataHoraCelebracao);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomePessoa1, nomePessoa2, dataHoraCelebracao);
	}

	@Override
	public String toString() {
		return "MatrimonioOutput{" +
				"nomePessoa1='" + nomePessoa1 + '\'' +
				", nomePessoa2='" + nomePessoa2 + '\'' +
				", dataHoraCelebracao=" + dataHoraCelebracao +
				'}';
	}
}
