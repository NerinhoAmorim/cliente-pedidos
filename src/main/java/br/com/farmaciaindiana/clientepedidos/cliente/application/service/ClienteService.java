package br.com.farmaciaindiana.clientepedidos.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteAlteracaoRequest;
import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteDetalhadoResponse;
import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteListResponse;
import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteRequest;
import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clientteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse bucaClientesAtravesId(UUID idCliente);
	void deletaClientePorId(UUID idCliente);
	void patcAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);

}
