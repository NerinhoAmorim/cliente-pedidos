package br.com.farmaciaindiana.clientepedidos.pedidos.application.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.farmaciaindiana.clientepedidos.pedidos.domain.Entrega;
import br.com.farmaciaindiana.clientepedidos.pedidos.domain.MeuCarrinho;
import br.com.farmaciaindiana.clientepedidos.pedidos.domain.Pagamento;
import lombok.Value;
@Value
public class PedidosRequest {
	@NotBlank
	private String nomeCompleto;
	@Email
	@NotBlank
	private String email;
	@CPF
	private String cpf;
	private String telefone;
	private MeuCarrinho meuCarrinho;
	private Boolean salvarInformacoes;
	private Entrega entrega;
	private Pagamento pagamento;
	
	

}
