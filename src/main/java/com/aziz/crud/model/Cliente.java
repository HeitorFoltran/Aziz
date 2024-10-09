package com.aziz.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
    private String cpf;

    private String senha;

    @Column(unique = true)
    private String rg;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_cidade", referencedColumnName = "id")
    private Cidade cidade;

    public Cliente() {
    	
    }
    
	public Cliente(Long id, String cpf, String senha, String rg, String nome, Cidade cidade) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.senha = senha;
		this.rg = rg;
		this.nome = nome;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
	
}
