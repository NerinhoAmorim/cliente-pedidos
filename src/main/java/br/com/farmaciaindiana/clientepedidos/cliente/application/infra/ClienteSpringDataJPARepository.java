package br.com.farmaciaindiana.clientepedidos.cliente.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmaciaindiana.clientepedidos.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {

	

}
