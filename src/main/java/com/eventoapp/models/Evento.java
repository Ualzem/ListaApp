package com.eventoapp.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.persistence.OneToMany;

@Entity
public class Evento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotEmpty
	private String nome;
	
	@NotEmpty
	private String local;
	
	@NotEmpty
	private String data;
	
	@NotEmpty
	private String horario;
	
	@OneToMany(mappedBy="evento", orphanRemoval = true, cascade= CascadeType.ALL)
	private List<Convidado> convidados = new ArrayList<Convidado>();
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public List<Convidado> getConvidados() {
		return convidados;
	}

	public void setConvidados(List<Convidado> convidados) {
		this.convidados = convidados;
	}
	


}
