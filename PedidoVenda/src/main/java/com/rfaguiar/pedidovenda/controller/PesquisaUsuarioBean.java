package com.rfaguiar.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaUsuarioBean {

	private List<Integer> usuarios;

	public PesquisaUsuarioBean() {
		usuarios = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			usuarios.add(i);
		}
	}

	public List<Integer> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Integer> usuarios) {
		this.usuarios = usuarios;
	}

	
	
}
