package com.savioduarte.cadastrodeprodutos.business.bean;

public class CategoriaBean {

	private String categoria;

	
	public CategoriaBean(Integer codigo, String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
