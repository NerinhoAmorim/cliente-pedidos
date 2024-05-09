package br.com.farmaciaindiana.clientepedidos.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.farmaciaindiana.clientepedidos.cliente.domain.Cliente;
public interface ClienteRepository {

	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClientesAtravesId(UUID idCliente);

}
