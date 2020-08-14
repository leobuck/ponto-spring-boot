package com.timais.ponto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timais.ponto.domain.Empresa;
import com.timais.ponto.domain.Ponto;
import com.timais.ponto.repositories.PontoRepository;

@Service
public class PontoService {

	@Autowired
	private PontoRepository repo;
	
	public Ponto find(Integer id) {
		Optional<Ponto> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public Ponto insert(Ponto obj) {
		obj.setId(null);
		Empresa emp = new Empresa(obj.getEmpresa().getId(), null, null, null);
		obj.setEmpresa(emp);
		return repo.save(obj);
	}	
}
