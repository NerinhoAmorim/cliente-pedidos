package br.com.farmaciaindiana.clientepedidos.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteAlteracaoRequest;
import br.com.farmaciaindiana.clientepedidos.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
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
	private Genero genero;
	private LocalDate dataNascimento;
	private String telefone;
	private Endereco endereco;
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(ClienteRequest clientteRequest) {
		this.nomeCompleto = clientteRequest.getNomeCompleto();
		this.email = clientteRequest.getEmail();
		this.cpf = clientteRequest.getCpf();
		this.genero = clientteRequest.getGenero();
		this.dataNascimento = clientteRequest.getDataNascimento();
		this.telefone = clientteRequest.getTelefone();
		this.endereco = clientteRequest.getEndereco();
		this.aceitaTermos = clientteRequest.getAceitaTermos();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(ClienteAlteracaoRequest clienteAlteracaoRequest) {
		this.nomeCompleto = clienteAlteracaoRequest.getNomeCompleto();
		this.genero = clienteAlteracaoRequest.getGenero();
		this.dataNascimento = clienteAlteracaoRequest.getDataNascimento();
		this.telefone = clienteAlteracaoRequest.getTelefone();
		this.aceitaTermos = clienteAlteracaoRequest.getAceitaTermos();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();

	}
}
