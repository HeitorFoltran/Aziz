package com.aziz.crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @NotBlank(message = "Esse campo não pode estar vazio.")
	@Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "Esse campo não pode estar vazio.")
    private String senha;

    @NotBlank(message = "Esse campo não pode estar vazio.")
    @Column(unique = true, nullable = false)
    private String rg;

    @Column(nullable = false)
    @NotBlank(message = "Esse campo não pode estar vazio.")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_cidade", referencedColumnName = "id")
    private Cidade cidade;
}
