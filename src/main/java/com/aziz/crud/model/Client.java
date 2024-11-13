package com.aziz.crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @NotBlank(message = "Esse campo não pode estar vazio.")
	@Column(unique = true, nullable = false)
    @Pattern(regexp = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$", message = "CPF inválido")
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "Esse campo não pode estar vazio.")
    private String password;

    @NotBlank(message = "Esse campo não pode estar vazio.")
    @Column(unique = true, nullable = false)
    @Pattern(regexp = "^\\d{1,2}\\.?\\d{3}\\.?\\d{3}-?\\d{1}$", message = "RG inválido")
    private String rg;

    @Column(nullable = false)
    @NotBlank(message = "Esse campo não pode estar vazio.")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_cidade", referencedColumnName = "id")
    private City city;
}
