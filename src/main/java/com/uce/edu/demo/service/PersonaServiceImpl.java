package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepository personaJpaRespository; 
	
	@Override
	public void guardar(Persona persona) {
		this.personaJpaRespository.insertar(persona);
		
	}

	@Override
	public void actualizar(Persona persona) {
		this.personaJpaRespository.actualizar(persona);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.personaJpaRespository.eliminar(id);
		
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarPorId(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return this.personaJpaRespository.buscarTodos();
	}

	
}
