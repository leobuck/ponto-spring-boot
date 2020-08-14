package com.timais.ponto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timais.ponto.domain.Ponto;

@Repository
public interface PontoRepository extends JpaRepository<Ponto, Integer>{

}
