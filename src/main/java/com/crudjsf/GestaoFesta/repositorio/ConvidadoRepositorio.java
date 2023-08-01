package com.crudjsf.GestaoFesta.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudjsf.GestaoFesta.Entidades.GestaoFestaEntidade;

@Repository
public interface ConvidadoRepositorio extends JpaRepository<GestaoFestaEntidade, Long> {

}
