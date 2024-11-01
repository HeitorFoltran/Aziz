package com.aziz.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "casos_encaminhados")
public class Defensoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_casojudicial", referencedColumnName = "id")
    private CasoJudicial casoJudicial;

    @ManyToOne
    @JoinColumn(name = "id_defensor", referencedColumnName = "id")
    private Defensor defensor;
}
