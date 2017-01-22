package com.rfaguiar.pedidovenda.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.rfaguiar.pedidovenda.model.Categoria;

public class Categorias implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager manager;
	
	public List<Categoria> raizes(){
		return this.manager.createQuery("from Categoria", Categoria.class).getResultList();
	}
}
