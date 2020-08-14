package com.timais.ponto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.timais.ponto.domain.Empresa;
import com.timais.ponto.domain.Funcionario;
import com.timais.ponto.domain.Ponto;
import com.timais.ponto.repositories.EmpresaRepository;
import com.timais.ponto.repositories.FuncionarioRepository;
import com.timais.ponto.repositories.PontoRepository;

@SpringBootApplication
public class PontoApplication implements CommandLineRunner {

	@Autowired
	private EmpresaRepository empresaRepository;
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	@Autowired
	private PontoRepository pontoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PontoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Empresa emp = new Empresa(null, "TI Mais Soluções", "123456789", true);
		empresaRepository.save(emp);
		
		Funcionario fun = new Funcionario(null, 1, "Leo", true);
		funcionarioRepository.save(fun);
		
		Ponto pon = new Ponto(null, new Date(), emp, fun, new Date(), new Date(), null, null, "");
		pontoRepository.save(pon);
	}
}
