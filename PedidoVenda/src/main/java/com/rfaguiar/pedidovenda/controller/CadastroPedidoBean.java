package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.rfaguiar.pedidovenda.model.EnderecoEntrega;
import com.rfaguiar.pedidovenda.model.Pedido;
import com.rfaguiar.pedidovenda.service.NegocioException;

@Named
@ViewScoped
public class CadastroPedidoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Pedido pedido;
	
	private List<Integer> itens;

	public CadastroPedidoBean() {
		this.pedido = new Pedido();
		this.pedido.setEnderecoEntrega(new EnderecoEntrega());
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	
}
