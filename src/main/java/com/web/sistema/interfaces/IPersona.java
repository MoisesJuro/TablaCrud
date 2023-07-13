package com.web.sistema.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.sistema.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
