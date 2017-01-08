package com.rfaguiar.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaPedidoBean {

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
