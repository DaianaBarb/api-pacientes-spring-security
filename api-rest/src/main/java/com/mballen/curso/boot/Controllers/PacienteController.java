package com.mballen.curso.boot.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mballen.curso.boot.DataSourceModel.PacienteEntity;
import com.mballen.curso.boot.Exceptions.PacienteNotFoundException;
import com.mballen.curso.boot.Repositories.NutricionistaRepository;
import com.mballen.curso.boot.Resources.NutricionistaResource;
import com.mballen.curso.boot.Services.BuscarPacientePorId;
import com.mballen.curso.boot.Services.BuscarTodosPacientes;
import com.mballen.curso.boot.Services.CadastroPacientes;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Pacientes")
//quero que qualquer aplicação acesse esta api
@CrossOrigin(origins="*")
public class PacienteController {
	@Autowired
	private NutricionistaRepository Repository;
	@Autowired
	private BuscarTodosPacientes BuscarTodos;
	@Autowired
	private CadastroPacientes cadastro;
	@Autowired
	private BuscarPacientePorId buscarPorId;
	@GetMapping(path ="/buscarporid/{id}")
	@ApiOperation(value="Retorna um produto")
	public PacienteEntity buscarNutricionistaPorId(
			@PathVariable(name = "id", required = true) Long idnutricionista) throws PacienteNotFoundException {

		return buscarPorId.BuscarPorId(idnutricionista);

	}

	@GetMapping(path ="/buscarTodos")
	@ApiOperation(value="Retorna uma lista de  produtos")
	public List<PacienteEntity> buscarNutricionistas() {

		return BuscarTodos.BuscarTodos();

	}

	@PostMapping(path ="/salvar")
	@ApiOperation(value="Salva  um produto")
	public void salvarNutricionista(@RequestBody NutricionistaResource nutricionista) {

		cadastro.cadastro(nutricionista);
	}
	
	@PostMapping(path ="/salvarMuitos")
	@ApiOperation(value="Salva  muitos produto")
	public void salvarMuitos(@RequestBody List<NutricionistaResource> nutricionistas) {

		cadastro.cadastrarMuitos(nutricionistas);
	}
	@PutMapping(path ="/editar/{id}")
	@ApiOperation(value="Atualiza  um produto")
	public void EditarNutricionista(@PathVariable(name = "id", required = true) Long idnutricionista,@RequestBody NutricionistaResource entity) {
	  cadastro.cadastro(entity);
	}

	@DeleteMapping(path ="/deletar/{id}")
	@ApiOperation(value="Remove  um produto")
	public void DeletarNutricionista(@PathVariable(name = "id", required = true) Long idnutricionista) {
		Repository.deleteById(idnutricionista);
	}

}
