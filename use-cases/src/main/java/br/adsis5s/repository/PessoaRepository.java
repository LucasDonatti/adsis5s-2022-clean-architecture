package br.adsis5s.repository;

import br.adsis5s.entities.Pessoa;

public interface PessoaRepository {
	void salvar(Pessoa pessoa);

	Pessoa pessoaPeloNome(String nome);
}
