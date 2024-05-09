package br.com.farmaciaindiana.clientepedidos.cliente.application.api;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.farmaciaindiana.clientepedidos.cliente.domain.Endereco;
import br.com.farmaciaindiana.clientepedidos.cliente.domain.Genero;
import lombok.Value;
@Value
public class ClienteRequest {
	private String nomeCompleto;
	@Email
	@NotBlank
	private String email;
	@CPF
	@Enumerated(EnumType.STRING)
	private String cpf;
	private Genero genero;
	private LocalDate dataNascimento;
	private String telefone;
	private Endereco endereco;
	private Boolean aceitaTermos;

}
