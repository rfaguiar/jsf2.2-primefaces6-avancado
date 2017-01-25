package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.rfaguiar.pedidovenda.model.Categoria;
import com.rfaguiar.pedidovenda.model.Produto;
import com.rfaguiar.pedidovenda.repository.Categorias;
import com.rfaguiar.pedidovenda.service.CadastroProdutoService;
import com.rfaguiar.pedidovenda.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private Categorias categorias;
	
	@Inject
	private CadastroProdutoService cadastroProdutoService;
	
	private Produto produto;
	
	private Categoria categoriaPai;
	
	private List<Categoria> categoriasRaizes;
	private List<Categoria> subCategoriasRaizes;
	
	public CadastroProdutoBean() {		
		this.limpar();
	}
	
	public void inicializar(){		
		if(FacesUtil.isNotPostBack()){
			this.categoriasRaizes = this.categorias.raizes();
			
		}
	}
	
	public void carregarSubCategoria(){
		this.subCategoriasRaizes = this.categorias.subCategoriasDe(this.categoriaPai);
	}
	
	public void salvar(){
		this.produto = this.cadastroProdutoService.salvar(this.produto);		
		this.limpar();		
		FacesUtil.addInfoMessage("Produto salvo com sucesso");
	}

	private void limpar() {
		this.produto = new Produto();
		this.categoriaPai = null;
		this.subCategoriasRaizes = new ArrayList<Categoria>();
		
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

	public Categoria getCategoriaPai() {
		return categoriaPai;
	}

	public void setCategoriaPai(Categoria categoriaPai) {
		this.categoriaPai = categoriaPai;
	}

	public List<Categoria> getSubCategoriasRaizes() {
		return subCategoriasRaizes;
	}

	public void setSubCategoriasRaizes(List<Categoria> subCategoriasRaizes) {
		this.subCategoriasRaizes = subCategoriasRaizes;
	}
	
}
