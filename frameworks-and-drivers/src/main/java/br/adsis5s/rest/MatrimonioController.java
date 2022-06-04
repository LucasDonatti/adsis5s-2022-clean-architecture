package br.adsis5s.rest;

import br.adsis5s.gateway.CriarMatrimonioCommand;
import br.adsis5s.gateway.MatrimonioGateway;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/matrimonio")
public class MatrimonioController {

//	private MatrimonioGateway gateway;
//
//	public MatrimonioController(MatrimonioGateway gateway) {
//		this.gateway = gateway;
//	}

	@PostMapping("/criar")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void criar(@RequestBody CriarMatrimonioCommand command) {
//		gateway.executar(command);
	}
}
