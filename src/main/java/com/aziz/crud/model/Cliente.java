package com.aziz.crud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
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

    @NotEmpty
    @NotNull
	@Column(unique = true)
    private String cpf;

    @NotEmpty
    @NotNull
    private String senha;

    @NotEmpty
    @NotNull
    @Column(unique = true)
    private String rg;

    @NotEmpty
    @NotNull
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_cidade", referencedColumnName = "id")
    private Cidade cidade;
}
