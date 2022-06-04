package br.adsis5s.repository;

import br.adsis5s.entities.Pessoa;

import java.util.Optional;

public interface PessoaRepository {
	void salvar(Pessoa pessoa);

	Optional<Pessoa> pessoaPeloNome(String nome);
}
