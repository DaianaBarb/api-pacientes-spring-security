package com.mballen.curso.boot.Converters;

import org.springframework.stereotype.Component;

import com.mballen.curso.boot.DataSourceModel.PacienteEntity;
import com.mballen.curso.boot.Resources.NutricionistaResource;
// tranforma o json em uma entidade do banco de dados convertendo com a classe conversor
@Component
public class PacienteConversor {
	
	public PacienteEntity Conversor(NutricionistaResource nutricionista)
	{
		// converte um json em objeto
		
		try {
			PacienteEntity nutri= new PacienteEntity();
			
			
			
			int idade =chekidade(nutricionista.getIdade());
			nutri.setNome( nutricionista.getNome());
			nutri.setIdade(idade);
			nutri.setTelefone( nutricionista.getTelefone());
			
			
			return nutri;
			
			
		} catch (Exception e) {
			
		}
		return null;
	
			
			
		
	}
	

	
	
	public int chekidade(String idade) {
		return Integer.parseInt(idade);
		
	}

}
