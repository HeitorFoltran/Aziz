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

    @NotBlank
	@Column(unique = true, nullable = false)
    private String cpf;

    @Column(nullable = false)
    @NotBlank
    private String senha;

    @NotBlank
    @Column(unique = true, nullable = false)
    private String rg;

    @Column(nullable = false)
    @NotBlank
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_cidade", referencedColumnName = "id")
    private Cidade cidade;
}
