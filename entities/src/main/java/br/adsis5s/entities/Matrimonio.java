package br.adsis5s.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Matrimonio {

	private Pessoa pessoa1;
	private Pessoa pessoa2;
	private LocalDateTime dataCelebracao;

	private LocalDateTime dataFinalizacao;

	public Matrimonio(Pessoa pessoa1, Pessoa pessoa2) {
		this.pessoa1 = pessoa1;
		this.pessoa2 = pessoa2;
		dataCelebracao = LocalDateTime.now();
	}

	public Pessoa getPessoa1() {
		return pessoa1;
	}

	public Pessoa getPessoa2() {
		return pessoa2;
	}

	public LocalDateTime getDataCelebracao() {
		return dataCelebracao;
	}

	public LocalDateTime getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void finalizar() {
		dataFinalizacao = LocalDateTime.now();
	}

	public void setDataCelebracao(LocalDateTime dataCelebracao) {
		this.dataCelebracao = dataCelebracao;
	}

	public void setDataFinalizacao(LocalDateTime dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Matrimonio that = (Matrimonio) o;
		return Objects.equals(pessoa1, that.pessoa1) && Objects.equals(pessoa2, that.pessoa2) && Objects.equals(dataCelebracao, that.dataCelebracao);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pessoa1, pessoa2, dataCelebracao);
	}

	@Override
	public String toString() {
		return "Matrimonio{" +
				"pessoa1=" + pessoa1 +
				", pessoa2=" + pessoa2 +
				", dataHoraCelebracao=" + dataCelebracao +
				'}';
	}
}
