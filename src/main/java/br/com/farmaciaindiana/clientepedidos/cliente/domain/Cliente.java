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

	public Cliente(UUID idCliente, @NotBlank String nomeCompleto, @Email @NotBlank String email, @CPF String cpf,
			Genero genero, LocalDate dataNascimento, String telefone, Endereco endereco, Boolean aceitaTermos,
			LocalDate dataHoraDoCadastro, LocalDate dataHoraDaUltimaAlteracao) {
		this.idCliente = idCliente;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.cpf = cpf;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
		this.aceitaTermos = aceitaTermos;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
