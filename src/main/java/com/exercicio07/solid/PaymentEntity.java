
package com.exercicio07.solid;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PAYMENTS")
@JsonInclude(value = Include.NON_NULL)
public class PaymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "ADDRES")
	private String addres;

	@Column(name = "NAME")
	private String cpf;

	@Column(name = "CPF")
	private BigDecimal value;

	@Column(name = "TYPE")
	private String type;

	// CREDITO

	@Column(name = "CARD_HOLDER_NAME")
	private String cardHolderNumber;

	@Column(name = "CARD_NUMBER")
	private String cardNumber;

	@Column(name = "CARD_EXPIRATION")
	private String cardExpiration;

	@Column(name = "CARD_CVV")
	private String cardCvv;

	@Column(name = "INSTALLMENTS")
	private Integer installments;

	// BOLETO

	@Column(name = "BAR_CODE")
	private String barCode;

	// PIX

	@Column(name = "PIX_KEY")
	private String pixKey;

	@Column(name = "DATE")
	private LocalDate createdAt; // DATA
}
