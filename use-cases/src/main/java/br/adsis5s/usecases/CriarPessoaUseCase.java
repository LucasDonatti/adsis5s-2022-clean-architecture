package br.adsis5s.usecases;

import br.adsis5s.entities.Pessoa;
import br.adsis5s.repository.PessoaRepository;
import br.adsis5s.usecases.data.input.CriarPessoaInput;

public class CriarPessoaUseCase {

	private PessoaRepository repository;

	public CriarPessoaUseCase(PessoaRepository repository) {
		this.repository = repository;
	}

	public void criarPessoa(CriarPessoaInput input) {
		var pessoa = new Pessoa(input.getNome());
		repository.salvar(pessoa);
	}
}
