package br.adsis5s.adapters.repository;

import br.adsis5s.interfaces.persistence.PessoaPersistence;
import br.adsis5s.interfaces.persistence.PessoaPO;
import br.adsis5s.entities.Pessoa;
import br.adsis5s.repository.PessoaRepository;

import java.util.Optional;

public class PessoaRepositoryAdapter implements PessoaRepository {

	private PessoaPersistence pessoaPersistence;

	public PessoaRepositoryAdapter(PessoaPersistence pessoaPersistence) {
		this.pessoaPersistence = pessoaPersistence;
	}

	@Override
	public void salvar(Pessoa pessoa) {
		pessoaPersistence.salvar(new PessoaPO(pessoa.getNome()));
	}

	@Override
	public Optional<Pessoa> pessoaPeloNome(String nome) {
		return pessoaPersistence.pessoaPeloNome(nome).map(po -> new Pessoa(po.getNome()));
	}

}
