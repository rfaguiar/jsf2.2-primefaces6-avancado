package com.rfaguiar.pedidovenda.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.rfaguiar.pedidovenda.model.Produto;
import com.rfaguiar.pedidovenda.repository.Produtos;
import com.rfaguiar.pedidovenda.util.jpa.Transactional;

public class CadastroProdutoService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Produtos produtos;

	@Transactional
	public Produto salvar(Produto produto){
		Produto produtoExistente = this.produtos.porSku(produto.getSku());
		if(produtoExistente != null){
			throw new NegocioException("Já existe um produto com o SKU informado.");
		}
		return this.produtos.guardar(produto);
	}
}
