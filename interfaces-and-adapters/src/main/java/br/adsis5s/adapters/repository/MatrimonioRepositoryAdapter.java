package br.adsis5s.adapters.repository;

import br.adsis5s.interfaces.persistence.MatrimonioPO;
import br.adsis5s.interfaces.persistence.MatrimonioPersistence;
import br.adsis5s.entities.Matrimonio;
import br.adsis5s.entities.Pessoa;
import br.adsis5s.interfaces.persistence.PessoaPersistence;
import br.adsis5s.repository.MatrimonioRepository;

import java.util.Optional;

public class MatrimonioRepositoryAdapter implements MatrimonioRepository {

	private PessoaRepositoryAdapter pessoaRepositoryAdapter;
	private PessoaPersistence pessoaPersistence;
	private MatrimonioPersistence matrimonioPersistence;

	@Override
	public void salvar(Matrimonio matrimonio) {
		var pessoa1 = pessoaPersistence.pessoaPeloNome(matrimonio.getPessoa1().getNome()).orElseThrow();
		var pessoa2 = pessoaPersistence.pessoaPeloNome(matrimonio.getPessoa2().getNome()).orElseThrow();
		MatrimonioPO matrimonioPO = new MatrimonioPO(
				pessoa1,
				pessoa2,
				matrimonio.getDataCelebracao(),
				matrimonio.getDataFinalizacao()
		);
		matrimonioPersistence.salvar(matrimonioPO);
	}

	@Override
	public Optional<Matrimonio> encontrarMatrimonioAtivo(Pessoa pessoa) {
		var pessoaPO = pessoaPersistence.pessoaPeloNome(pessoa.getNome());

		return pessoaPO
				.flatMap(po -> matrimonioPersistence.encontrarMatrimonioAtivo(po))
				.map(matrimonioPO -> {
					var pessoa1 = getPessoa(matrimonioPO.getPessoa1().getNome());
					var pessoa2 = getPessoa(matrimonioPO.getPessoa2().getNome());
					var matrimonio = new Matrimonio(pessoa1, pessoa2);
					matrimonio.setDataCelebracao(matrimonioPO.getDataCelebracao());
					matrimonio.setDataFinalizacao(matrimonioPO.getDataFinalizacao());
					return matrimonio;
				});
	}

	private Pessoa getPessoa(String nome) {
		return pessoaRepositoryAdapter.pessoaPeloNome(nome).orElseThrow();
	}
}
