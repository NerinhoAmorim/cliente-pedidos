package br.com.farmaciaindiana.clientepedidos.pedidos.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.farmaciaindiana.clientepedidos.pedidos.application.service.PedidosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidosController implements PedidosAPI {
	private final PedidosService pedidosService;

	@Override
	public PedidosResponse postPedidos(@Valid PedidosRequest pedidosRequest) {
		log.info("[inicio] PedidosController - postPedidos ");
		PedidosResponse pedidos = pedidosService.criaPedidos(pedidosRequest);
		log.info("[finaliza] PedidosController - postPedidos ");
		return pedidos;
	}

}
