package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CadastroClienteBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
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
