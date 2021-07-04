package com.AnuncioCadastro.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Classe que representa o anúncio cadastrado
 * @author anari
 *
 */
@Entity
public class Anuncio {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String cliente;
	
	@Column
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dataInicio;
	
	@Column
    @JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate dataTermino;
	
	@Column
	private double investimentoDia;
	
	public Anuncio() {}
	
	public Anuncio(Long id, String nome, String cliente, LocalDate dataInicio, LocalDate dataTermino, double investimentoDia) {
		this.id = id;
		this.nome = nome;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.investimentoDia = investimentoDia;
	}
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

	public double getInvestimentoDia() {
		return investimentoDia;
	}

	public void setInvestimentoPorDia(double investimentoDia) {
		this.investimentoDia = investimentoDia;
	}
		
}
