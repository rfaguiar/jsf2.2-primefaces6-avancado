package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PesquisaClienteBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Integer> clientes;

	public PesquisaClienteBean() {
		clientes = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			clientes.add(i);
		}
	}

	public List<Integer> getClientes() {
		return clientes;
	}

	public void setClientes(List<Integer> clientes) {
		this.clientes = clientes;
	}
	
	
}
