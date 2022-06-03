package br.adsis5s.usecases;

import br.adsis5s.entities.Matrimonio;
import br.adsis5s.repository.MatrimonioRepository;
import br.adsis5s.repository.PessoaRepository;
import br.adsis5s.usecases.data.input.NoivosInput;
import br.adsis5s.usecases.data.output.MatrimonioOutput;

public class CriarMatrimonioUseCase {

	private PessoaRepository pessoaRepository;
	private MatrimonioRepository matrimonioRepository;

	public CriarMatrimonioUseCase(
			PessoaRepository pessoaRepository,
			MatrimonioRepository matrimonioRepository
	) {
		this.pessoaRepository = pessoaRepository;
		this.matrimonioRepository = matrimonioRepository;
	}

	public MatrimonioOutput criarMatrimonio(NoivosInput input) {
		var pessoa1 = pessoaRepository.pessoaPeloNome(input.getNomePessoa1());
		var pessoa2 = pessoaRepository.pessoaPeloNome(input.getNomePessoa2());

		var matrimonio = new Matrimonio(pessoa1, pessoa2);
		matrimonioRepository.salvar(matrimonio);

		return new MatrimonioOutput(
			matrimonio.getPessoa1().getNome(),
			matrimonio.getPessoa2().getNome(),
			matrimonio.getDataHoraCelebracao()
		);
	}
}
