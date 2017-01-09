package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaProdutoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Integer> produtosFiltrados;

	public PesquisaProdutoBean() {
		produtosFiltrados = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			produtosFiltrados.add(i);
		}
	}
	
	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}

	public void setProdutosFiltrados(List<Integer> produtosFiltrados) {
		this.produtosFiltrados = produtosFiltrados;
	}
	
}
