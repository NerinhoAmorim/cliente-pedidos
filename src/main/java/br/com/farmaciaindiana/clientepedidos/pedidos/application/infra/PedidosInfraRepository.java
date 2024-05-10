package br.com.farmaciaindiana.clientepedidos.pedidos.application.infra;

import org.springframework.stereotype.Repository;

import br.com.farmaciaindiana.clientepedidos.pedidos.application.repository.PedidosRepository;
import br.com.farmaciaindiana.clientepedidos.pedidos.domain.Pedidos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class PedidosInfraRepository implements PedidosRepository {

	@Override
	public Pedidos salva(Pedidos pedidos) {
		log.info("[inicio] PedidosInfraRepository - salva");
		log.info("[finaliza] PedidosInfraRepository - salva");
		return null;
	}

}
