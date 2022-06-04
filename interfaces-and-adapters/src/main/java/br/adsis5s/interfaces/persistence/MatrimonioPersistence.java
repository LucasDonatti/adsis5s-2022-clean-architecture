package br.adsis5s.interfaces.persistence;

import java.util.Optional;

public interface MatrimonioPersistence {
	void salvar(MatrimonioPO matrimonioPO);

	Optional<MatrimonioPO> encontrarMatrimonioAtivo(PessoaPO pessoaPO);
}
