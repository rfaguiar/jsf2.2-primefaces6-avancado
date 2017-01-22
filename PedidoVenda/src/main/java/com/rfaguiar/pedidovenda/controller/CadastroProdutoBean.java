package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.rfaguiar.pedidovenda.model.Categoria;
import com.rfaguiar.pedidovenda.model.Produto;
import com.rfaguiar.pedidovenda.repository.Categorias;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private Categorias categorias;
	
	private Produto produto;
	
	private List<Categoria> categoriasRaizes;
	
	public CadastroProdutoBean() {
		this.produto = new Produto();
	}
	
	public void inicializar(){		
		this.categoriasRaizes = this.categorias.raizes();
	}
	
	public void salvar(){
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Categoria> getCategoriasRaizes() {
		return categoriasRaizes;
	}

	public void setCategoriasRaizes(List<Categoria> categoriasRaizes) {
		this.categoriasRaizes = categoriasRaizes;
	}
	
}
