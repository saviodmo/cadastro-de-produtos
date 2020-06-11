package com.savioduarte.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.List;

public class ProdutoBean {
	
	private Integer codigo;
	private String nomeProduto;
	private Float preco;
	private String categoria;

	public ProdutoBean(Integer codigo, String nomeProduto, Float preco, String categoria) {
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.categoria = categoria;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	
}
