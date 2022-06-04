package br.adsis5s.interfaces.persistence;

import java.time.LocalDateTime;
import java.util.Objects;

// PO stands for Persistence Object
public class MatrimonioPO {
	private final PessoaPO pessoa1;
	private final PessoaPO pessoa2;
	private final LocalDateTime dataCelebracao;
	private final LocalDateTime dataFinalizacao;

	public MatrimonioPO(PessoaPO pessoa1,
						PessoaPO pessoa2,
						LocalDateTime dataCelebracao,
						LocalDateTime dataFinalizacao) {
		this.pessoa1 = pessoa1;
		this.pessoa2 = pessoa2;
		this.dataCelebracao = dataCelebracao;
		this.dataFinalizacao = dataFinalizacao;
	}

	public PessoaPO getPessoa1() {
		return pessoa1;
	}

	public PessoaPO getPessoa2() {
		return pessoa2;
	}

	public LocalDateTime getDataCelebracao() {
		return dataCelebracao;
	}

	public LocalDateTime getDataFinalizacao() {
		return dataFinalizacao;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MatrimonioPO that = (MatrimonioPO) o;
		return Objects.equals(pessoa1, that.pessoa1) && Objects.equals(pessoa2, that.pessoa2) && Objects.equals(dataCelebracao, that.dataCelebracao) && Objects.equals(dataFinalizacao, that.dataFinalizacao);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pessoa1, pessoa2, dataCelebracao, dataFinalizacao);
	}

	@Override
	public String toString() {
		return "MatrimonioPO{" +
				"pessoa1=" + pessoa1 +
				", pessoa2=" + pessoa2 +
				", dataCelebracao=" + dataCelebracao +
				", dataFinalizacao=" + dataFinalizacao +
				'}';
	}
}
