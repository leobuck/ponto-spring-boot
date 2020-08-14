package com.timais.ponto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timais.ponto.domain.Funcionario;
import com.timais.ponto.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repo;
	
	public Funcionario find(Integer id) {
		Optional<Funcionario> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public Funcionario insert(Funcionario obj) {
		obj.setId(null);
		return repo.save(obj);
	}	
}
