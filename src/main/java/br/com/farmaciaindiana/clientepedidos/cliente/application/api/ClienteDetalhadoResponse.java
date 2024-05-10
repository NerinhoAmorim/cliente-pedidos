package br.com.farmaciaindiana.clientepedidos.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.farmaciaindiana.clientepedidos.cliente.domain.Cliente;
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

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.cpf = cliente.getCpf();
		this.genero = cliente.getGenero();
		this.dataNascimento = cliente.getDataNascimento();
		this.telefone = cliente.getTelefone();
		this.endereco = cliente.getEndereco();
		this.aceitaTermos = cliente.getAceitaTermos();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
		
	}

	
}
