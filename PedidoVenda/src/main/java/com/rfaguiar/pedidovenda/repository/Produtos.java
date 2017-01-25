package com.rfaguiar.pedidovenda.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.rfaguiar.pedidovenda.model.Produto;

public class Produtos  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager manager;

	public Produto guardar(Produto produto) {
		return this.manager.merge(produto);
	}

	public Produto porSku(String sku) {
		try{
			return this.manager.createQuery("from Produto where upper(sku) = :sku", Produto.class)
					.setParameter("sku", sku.toUpperCase())
					.getSingleResult();
		}catch (NoResultException e) {
			return null;
		}
	}
	
}
