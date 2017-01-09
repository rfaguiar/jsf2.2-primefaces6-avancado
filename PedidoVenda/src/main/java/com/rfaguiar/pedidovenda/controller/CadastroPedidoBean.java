package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rfaguiar.pedidovenda.service.NegocioException;

@Named
@RequestScoped
public class CadastroPedidoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Integer> itens;

	public CadastroPedidoBean() {
		itens = new ArrayList<Integer>();		
		itens.add(1);
		
	}
	
	public void salvar(){
		throw new NegocioException("Pedido não pode ser salvo, pois ainda não foi implementado.");
	}

	public List<Integer> getItens() {
		return itens;
	}

	public void setItens(List<Integer> itens) {
		this.itens = itens;
	}

	
}
