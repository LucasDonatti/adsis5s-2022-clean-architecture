package br.adsis5s.repository;

import br.adsis5s.entities.Matrimonio;
import br.adsis5s.entities.Pessoa;

import java.util.Optional;

public interface MatrimonioRepository {
	void salvar(Matrimonio matrimonio);

	Optional<Matrimonio> encontrarMatrimonioAtivo(Pessoa pessoa);
}
