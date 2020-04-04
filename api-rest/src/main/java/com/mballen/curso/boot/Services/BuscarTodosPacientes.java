package com.mballen.curso.boot.Services;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballen.curso.boot.DataSourceModel.PacienteEntity;
import com.mballen.curso.boot.Repositories.NutricionistaRepository;
@Service
public class BuscarTodosPacientes {
	private static final Logger LOG = Logger.getLogger( BuscarTodosPacientes.class);
	@Autowired
	private NutricionistaRepository nutricionistaRepository ;
	
	public List<PacienteEntity> BuscarTodos(){
	LOG.info("serviço de busca todos os nutricionistas sendo executado");
		List<PacienteEntity> list = nutricionistaRepository.findAll();
		
		return list;
		
		
		
	}

}
