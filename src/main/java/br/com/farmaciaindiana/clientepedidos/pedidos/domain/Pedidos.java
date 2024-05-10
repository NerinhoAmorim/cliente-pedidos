package br.com.farmaciaindiana.clientepedidos.pedidos.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.farmaciaindiana.clientepedidos.pedidos.application.api.PedidosRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
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

	public Pedidos(PedidosRequest pedidosRequest) {
		this.nomeCompleto = pedidosRequest.getNomeCompleto();
		this.email = pedidosRequest.getEmail();
		this.cpf = pedidosRequest.getCpf();
		this.telefone = pedidosRequest.getTelefone();
		this.meuCarrinho = pedidosRequest.getMeuCarrinho();
		this.salvarInformacoes = pedidosRequest.getSalvarInformacoes();
		this.entrega = pedidosRequest.getEntrega();
		this.pagamento = pedidosRequest.getPagamento();
	}

}
