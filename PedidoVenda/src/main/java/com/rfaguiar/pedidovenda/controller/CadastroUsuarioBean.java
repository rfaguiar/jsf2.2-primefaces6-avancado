package com.rfaguiar.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroUsuarioBean {
	
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
