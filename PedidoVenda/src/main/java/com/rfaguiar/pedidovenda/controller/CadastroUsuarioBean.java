package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CadastroUsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Integer> grupos;

	public CadastroUsuarioBean() {
		grupos = new ArrayList<Integer>();		
		grupos.add(1);		
	}

	public List<Integer> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Integer> grupos) {
		this.grupos = grupos;
	}
	
}
