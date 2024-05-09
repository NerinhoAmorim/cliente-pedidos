package br.com.farmaciaindiana.clientepedidos.cliente.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.farmaciaindiana.clientepedidos.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clientteRequest) {
		log.info("[inicio] ClienteController - postCliente" );
		ClienteResponse clienteCriado = clienteService.criaCliente(clientteRequest);
		log.info("[finaliza] ClienteController - postCliente" );	
		return clienteCriado;
	}

}
