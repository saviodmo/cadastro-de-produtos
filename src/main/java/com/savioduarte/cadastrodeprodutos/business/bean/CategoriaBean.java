package com.savioduarte.cadastrodeprodutos.business.bean;

public class CategoriaBean {

	private Integer codigo;
	private String categoria;

	
	public CategoriaBean(Integer codigo, String categoria) {
		this.codigo = codigo;
		this.categoria = categoria;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
