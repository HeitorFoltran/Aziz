package com.aziz.crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank
    @NotNull
	@Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String senha;

    @NotBlank
    @NotNull
    @Column(unique = true, nullable = false)
    private String rg;

    @NotBlank
    @NotNull
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_cidade", referencedColumnName = "id")
    private Cidade cidade;
}
