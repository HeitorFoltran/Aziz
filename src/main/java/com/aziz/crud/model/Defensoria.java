package com.aziz.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
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

    public Defensoria() {
    	
    }
    
	public Defensoria(Long id, CasoJudicial casoJudicial, Defensor defensor) {
		super();
		this.id = id;
		this.casoJudicial = casoJudicial;
		this.defensor = defensor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CasoJudicial getCasoJudicial() {
		return casoJudicial;
	}

	public void setCasoJudicial(CasoJudicial casoJudicial) {
		this.casoJudicial = casoJudicial;
	}

	public Defensor getDefensor() {
		return defensor;
	}

	public void setDefensor(Defensor defensor) {
		this.defensor = defensor;
	}

    
}
