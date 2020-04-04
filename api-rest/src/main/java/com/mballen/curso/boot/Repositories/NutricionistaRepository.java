package com.mballen.curso.boot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mballen.curso.boot.DataSourceModel.PacienteEntity;

public interface NutricionistaRepository extends JpaRepository<PacienteEntity,Long> {

}
