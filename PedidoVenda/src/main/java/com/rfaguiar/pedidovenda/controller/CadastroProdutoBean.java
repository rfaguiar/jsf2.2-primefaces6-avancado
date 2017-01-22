package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.rfaguiar.pedidovenda.model.Produto;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Produto produto;
	
	public CadastroProdutoBean() {
		this.produto = new Produto();
	}
	
	public void salvar(){
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
