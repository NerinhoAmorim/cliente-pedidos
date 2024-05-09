package br.com.farmaciaindiana.clientepedidos.cliente.application.service;

import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteRequest;
import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clientteRequest);

}
