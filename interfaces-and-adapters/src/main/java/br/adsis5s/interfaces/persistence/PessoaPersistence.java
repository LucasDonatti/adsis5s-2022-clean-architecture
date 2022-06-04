package br.adsis5s.interfaces.persistence;

import java.util.Optional;

public interface PessoaPersistence {
	void salvar(PessoaPO pessoaPO);

	Optional<PessoaPO> pessoaPeloNome(String nome);
}
