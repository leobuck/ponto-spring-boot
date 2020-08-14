package com.timais.ponto.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ponto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;
	
	private Date entradaManha;
	
	private Date saidaManha;
	
	private Date entradaTarde;
	
	private Date saidaTarde;
	
	private String observacao;
	
	public Ponto() {
	}

	public Ponto(Integer id, Date data, Empresa empresa, Funcionario funcionario, Date entradaManha, Date saidaManha,
			Date entradaTarde, Date saidaTarde, String observacao) {
		super();
		this.id = id;
		this.data = data;
		this.empresa = empresa;
		this.funcionario = funcionario;
		this.entradaManha = entradaManha;
		this.saidaManha = saidaManha;
		this.entradaTarde = entradaTarde;
		this.saidaTarde = saidaTarde;
		this.observacao = observacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getEntradaManha() {
		return entradaManha;
	}

	public void setEntradaManha(Date entradaManha) {
		this.entradaManha = entradaManha;
	}

	public Date getSaidaManha() {
		return saidaManha;
	}

	public void setSaidaManha(Date saidaManha) {
		this.saidaManha = saidaManha;
	}

	public Date getEntradaTarde() {
		return entradaTarde;
	}

	public void setEntradaTarde(Date entradaTarde) {
		this.entradaTarde = entradaTarde;
	}

	public Date getSaidaTarde() {
		return saidaTarde;
	}

	public void setSaidaTarde(Date saidaTarde) {
		this.saidaTarde = saidaTarde;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ponto other = (Ponto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ponto [id=" + id + ", data=" + data + ", empresa=" + empresa + ", funcionario=" + funcionario
				+ ", entradaManha=" + entradaManha + ", saidaManha=" + saidaManha + ", entradaTarde=" + entradaTarde
				+ ", saidaTarde=" + saidaTarde + ", observacao=" + observacao + "]";
	}
	
}
