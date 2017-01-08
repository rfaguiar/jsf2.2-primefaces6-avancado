package com.rfaguiar.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroClienteBean {
	
	private List<Integer> enderecos;

	public CadastroClienteBean() {
		enderecos = new ArrayList<Integer>();		
		enderecos.add(1);		
	}

	public List<Integer> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Integer> enderecos) {
		this.enderecos = enderecos;
	}


	
}
