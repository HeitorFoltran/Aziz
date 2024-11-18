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
@Table(name = "defensores")
public class Defender {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Esse campo não pode estar vazio.")
    @Column(unique = true, nullable = false)
    @Pattern(regexp = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}|\\d{11})$", message = "Inserir pelo menos 11 dígitos, com ou sem pontuação.")
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "Esse campo não pode estar vazio.")
    private String password;

}
