package com.rfaguiar.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PesquisaUsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;

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
