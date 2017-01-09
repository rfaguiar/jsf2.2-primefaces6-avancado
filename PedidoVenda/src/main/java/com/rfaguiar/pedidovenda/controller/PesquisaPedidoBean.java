package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PesquisaPedidoBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Integer> pedidosFiltrados;

	public PesquisaPedidoBean() {
		pedidosFiltrados = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			pedidosFiltrados.add(i);
		}
	}

	public List<Integer> getPedidosFiltrados() {
		return pedidosFiltrados;
	}

	public void setPedidosFiltrados(List<Integer> pedidosFiltrados) {
		this.pedidosFiltrados = pedidosFiltrados;
	}
	
}
