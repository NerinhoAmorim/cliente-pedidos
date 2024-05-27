package br.com.farmaciaindiana.clientepedidos.cliente.application.api;

import java.util.List;
import java.util.UUID;

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

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicio] ClienteController - getTodosClientes");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finaliza] ClienteController - getTodosClientes");
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getClientesAtravesId(UUID idCliente) {
		log.info("[inicio] ClienteController - getClientesAtravesId");
		log.info("[idCliente] {}", idCliente);
		ClienteDetalhadoResponse clienteDetalhado = clienteService.bucaClientesAtravesId(idCliente);
		log.info("[finaliza] ClienteController - getClientesAtravesId");
		return clienteDetalhado;
	}

	

}
