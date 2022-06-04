package br.adsis5s.gateway;

import br.adsis5s.adapters.repository.MatrimonioRepositoryAdapter;
import br.adsis5s.adapters.repository.PessoaRepositoryAdapter;
import br.adsis5s.usecases.CriarMatrimonioUseCase;
import br.adsis5s.usecases.data.input.NoivosInput;

public class MatrimonioGateway {

	private PessoaRepositoryAdapter pessoaRepositoryAdapter;
	private MatrimonioRepositoryAdapter matrimonioRepositoryAdapter;

	public MatrimonioGateway(PessoaRepositoryAdapter pessoaRepositoryAdapter, MatrimonioRepositoryAdapter matrimonioRepositoryAdapter) {
		this.pessoaRepositoryAdapter = pessoaRepositoryAdapter;
		this.matrimonioRepositoryAdapter = matrimonioRepositoryAdapter;
	}

	public void executar(CriarMatrimonioCommand command) {
		var input = new NoivosInput(command.getNomePessoa1(), command.getNomePessoa2());
		var useCase = new CriarMatrimonioUseCase(pessoaRepositoryAdapter, matrimonioRepositoryAdapter);
		useCase.criarMatrimonio(input);
	}
}
