package com.rfaguiar.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaClienteBean {

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
