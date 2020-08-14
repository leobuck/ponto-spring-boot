package com.timais.ponto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timais.ponto.domain.Empresa;
import com.timais.ponto.repositories.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repo;
	
	public Empresa find(Integer id) {
		Optional<Empresa> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public Empresa insert(Empresa obj) {
		obj.setId(null);
		return repo.save(obj);
	}
}
