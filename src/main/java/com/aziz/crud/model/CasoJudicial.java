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
@Table(name = "casos_judiciais")
public class CasoJudicial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_documento", referencedColumnName = "id")
    private Documento documento;

    @ManyToOne
    @JoinColumn(name = "id_defensor", referencedColumnName = "id", nullable = true)
    private Defensor defensor;

    @Column(nullable = false)
    @NotBlank
    @NotNull
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    private Categoria categoria;

    @Column(nullable = false)
    private Boolean aptidao;
}

