package com.mballen.curso.boot.Services;

import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mballen.curso.boot.Converters.PacienteConversor;
import com.mballen.curso.boot.DataSourceModel.PacienteEntity;
import com.mballen.curso.boot.Repositories.NutricionistaRepository;
import com.mballen.curso.boot.Resources.NutricionistaResource;

@Service
public class CadastroPacientes {
@Autowired
private NutricionistaRepository    nutricionistaRepository;
@Autowired
private PacienteConversor conversor;

private static final Logger LOG = Logger.getLogger( CadastroPacientes.class);
public void cadastro(NutricionistaResource nutricionista) {
	LOG.info("serviço de save sendo executado");
	// transforma em json em objeto
	PacienteEntity nutri=conversor.Conversor(nutricionista);
	
	
	nutricionistaRepository.saveAndFlush(nutri);
}
public void cadastrarMuitos(List<NutricionistaResource> nutricionistas) {
	List<PacienteEntity>lista=new ArrayList<>();
	for(NutricionistaResource nutri:nutricionistas) {
		lista.add(conversor.Conversor(nutri));
		
	}
	
	
	nutricionistaRepository.saveAll(lista);
	



}




}
