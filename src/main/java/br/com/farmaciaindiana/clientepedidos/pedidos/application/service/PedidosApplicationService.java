package br.com.farmaciaindiana.clientepedidos.pedidos.application.service;

import org.springframework.stereotype.Service;

import br.com.farmaciaindiana.clientepedidos.pedidos.application.api.PedidosRequest;
import br.com.farmaciaindiana.clientepedidos.pedidos.application.api.PedidosResponse;
import br.com.farmaciaindiana.clientepedidos.pedidos.application.repository.PedidosRepository;
import br.com.farmaciaindiana.clientepedidos.pedidos.domain.Pedidos;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class PedidosApplicationService implements PedidosService {

	private final PedidosRepository pedidosRepository;

	@Override
	public PedidosResponse criaPedidos(PedidosRequest pedidosRequest) {
		log.info("[inicio] PedidosApplicationService - criaPedidos");
		Pedidos pedido = pedidosRepository.salva(new Pedidos(pedidosRequest));
		log.info("[finaliza] PedidosApplicationService - criaPedidos");
		return PedidosResponse.builder().idCliente(pedido.getIdCliente()).build();
	}

}
