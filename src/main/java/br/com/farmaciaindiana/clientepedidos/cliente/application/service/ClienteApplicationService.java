package br.com.farmaciaindiana.clientepedidos.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteRequest;
import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clientteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}

}
