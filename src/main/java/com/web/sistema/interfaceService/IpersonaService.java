package com.web.sistema.interfaceService;

import java.util.List;
import java.util.Optional;

import com.web.sistema.modelo.Persona;

public interface IpersonaService { 
	public List<Persona>listar();
	public Optional<Persona>ListarId(int id);
    public int save(Persona p);
    public void delete(int id);
}
