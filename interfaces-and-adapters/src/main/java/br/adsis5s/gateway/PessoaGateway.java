package br.adsis5s.gateway;

import br.adsis5s.adapters.repository.PessoaRepositoryAdapter;
import br.adsis5s.usecases.CriarPessoaUseCase;
import br.adsis5s.usecases.data.input.CriarPessoaInput;

public class PessoaGateway {

	private PessoaRepositoryAdapter pessoaRepositoryAdapter;

	public PessoaGateway(PessoaRepositoryAdapter pessoaRepositoryAdapter) {
		this.pessoaRepositoryAdapter = pessoaRepositoryAdapter;
	}

	public void executar(CriarPessoaCommand command) {
		var input = new CriarPessoaInput(command.getNome());
		var criarPessoaUseCase = new CriarPessoaUseCase(pessoaRepositoryAdapter);
		criarPessoaUseCase.criarPessoa(input);
	}
}
