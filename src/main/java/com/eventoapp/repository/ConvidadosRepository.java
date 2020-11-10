package com.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventoapp.models.Convidado;
import com.eventoapp.models.Evento;

public interface ConvidadosRepository extends CrudRepository<Convidado, String> {
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);

}
