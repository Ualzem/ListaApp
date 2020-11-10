package com.eventoapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.NotEmpty;


@Entity
public class Convidado {
	
	@Id
	@NotEmpty
	private String rg;
	
	@NotEmpty
	private String nome;
	
	@JsonIgnore
	@org.hibernate.annotations.ForeignKey(name="evento_id")
	@ManyToOne(optional = false)
	private Evento evento;

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

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	


}
