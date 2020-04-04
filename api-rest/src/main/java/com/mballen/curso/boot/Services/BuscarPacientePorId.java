package com.mballen.curso.boot.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballen.curso.boot.DataSourceModel.PacienteEntity;
import com.mballen.curso.boot.Exceptions.PacienteNotFoundException;
import com.mballen.curso.boot.Repositories.NutricionistaRepository;

@Service
public class BuscarPacientePorId {
	@Autowired
	private NutricionistaRepository    nutricionistaRepository;
	
	public PacienteEntity BuscarPorId(Long id) throws PacienteNotFoundException {
		Optional<PacienteEntity> optional=
		
		nutricionistaRepository.findById(id);
		PacienteEntity nutri=null;
		if(!optional.isPresent()) {
			throw new PacienteNotFoundException(" n encontrado ");
		} 
		else {nutri = optional.get();}
		return nutri;
	}
	
	
	public void DeletarPorID(Long id) throws PacienteNotFoundException {
		Optional<PacienteEntity> optional=
				
				nutricionistaRepository.findById(id);
				PacienteEntity nutri=null;
				if(!optional.isPresent()) {
					throw new PacienteNotFoundException(" n encontrado ");
				} 
				else { nutricionistaRepository.delete(optional.get());}
			
		
	}

}
