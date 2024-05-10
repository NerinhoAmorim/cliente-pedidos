package br.com.farmaciaindiana.clientepedidos.pedidos.application.service;

import br.com.farmaciaindiana.clientepedidos.pedidos.application.api.PedidosRequest;
import br.com.farmaciaindiana.clientepedidos.pedidos.application.api.PedidosResponse;

public interface PedidosService {
	PedidosResponse criaPedidos( PedidosRequest pedidosRequest);
	

}
