package br.adsis5s.config;

import br.adsis5s.interfaces.persistence.PessoaPO;
import br.adsis5s.interfaces.persistence.PessoaPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PessoaPersistenceDummy implements PessoaPersistence  {

	private Map<String, PessoaPO> data = new HashMap<>();

	@Override
	public void salvar(PessoaPO pessoaPO) {
		data.put(pessoaPO.getNome(), pessoaPO);
	}

	@Override
	public Optional<PessoaPO> pessoaPeloNome(String nome) {
		return Optional.ofNullable(data.get(nome));
	}
}
