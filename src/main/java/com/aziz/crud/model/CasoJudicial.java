package com.aziz.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
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

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    private Categoria categoria;

    private Boolean aptidao;
    
    public CasoJudicial() {
    	
    }

	public CasoJudicial(Long id, Documento documento, Defensor defensor, String descricao, Cliente cliente,
			Categoria categoria, Boolean aptidao) {
		super();
		this.id = id;
		this.documento = documento;
		this.defensor = defensor;
		this.descricao = descricao;
		this.cliente = cliente;
		this.categoria = categoria;
		this.aptidao = aptidao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Defensor getDefensor() {
		return defensor;
	}

	public void setDefensor(Defensor defensor) {
		this.defensor = defensor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Boolean getAptidao() {
		return aptidao;
	}

	public void setAptidao(Boolean aptidao) {
		this.aptidao = aptidao;
	}

    
}

