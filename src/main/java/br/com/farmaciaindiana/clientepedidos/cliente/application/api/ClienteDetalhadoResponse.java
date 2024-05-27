package br.com.farmaciaindiana.clientepedidos.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.farmaciaindiana.clientepedidos.cliente.domain.Endereco;
import br.com.farmaciaindiana.clientepedidos.cliente.domain.Genero;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;

	private String cpf;
	private Genero genero;
	private LocalDate dataNascimento;
	private String telefone;
	private Endereco endereco;
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;

}
