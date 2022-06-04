package br.adsis5s.config;

import br.adsis5s.adapters.repository.PessoaRepositoryAdapter;
import br.adsis5s.gateway.PessoaGateway;
import br.adsis5s.interfaces.persistence.PessoaPersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfiguration {

	@Bean
	public PessoaPersistence pessoaPersistence() {
		return new PessoaPersistenceDummy();
	}

	@Bean
	public PessoaRepositoryAdapter pessoaRepositoryAdapter(PessoaPersistence pessoaPersistence) {
		return new PessoaRepositoryAdapter(pessoaPersistence);
	}

	@Bean
	public PessoaGateway pessoaGateway(PessoaRepositoryAdapter pessoaRepositoryAdapter) {
		return new PessoaGateway(pessoaRepositoryAdapter);
	}

}
