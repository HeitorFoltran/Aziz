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
@Table(name = "casos_judiciais")
public class CourtCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_documento", referencedColumnName = "id")
    private Document document;

    @ManyToOne
    @JoinColumn(name = "id_defensor", referencedColumnName = "id", nullable = true)
    private Defender defender;

    @Column(nullable = false)
    @NotBlank(message = "Esse campo não pode estar vazio.")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    private Category category;

    @NotBlank(message = "Insira algo")
    @Column(nullable = false)
    private Boolean status;
}
