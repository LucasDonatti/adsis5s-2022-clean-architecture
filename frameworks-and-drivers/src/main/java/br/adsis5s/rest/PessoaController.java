package br.adsis5s.rest;

import br.adsis5s.gateway.CriarPessoaCommand;
import br.adsis5s.gateway.PessoaGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

	private PessoaGateway gateway;

	public PessoaController(PessoaGateway gateway) {
		this.gateway = gateway;
	}

	@PostMapping("/criar")
	public ResponseEntity<Void> criarPessoa(@RequestBody CriarPessoaCommand command) {
		gateway.executar(command);
		return ResponseEntity.accepted().build();
	}
}
