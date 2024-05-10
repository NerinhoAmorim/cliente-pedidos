package br.com.farmaciaindiana.clientepedidos.pedidos.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
@Value
@Builder
public class PedidosResponse {
	private UUID idCliente;


}
