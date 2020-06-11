package com.savioduarte.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.List;


public class ProdutosBean {

	public List<ProdutoBean> getProdutosFiltrados(String nomeCategoria, List<ProdutoBean> produtos) {

		if (nomeCategoria == null) {
			return produtos;
		}	

		List<ProdutoBean> produtosFiltrados = new ArrayList<>();

		//List<Integer> codigos = new ArrayList<>();

		for (ProdutoBean produto : produtos) {
			if (produto.getCategoria().equals(nomeCategoria)) {
				produtosFiltrados.add(produto);
			}
		}

		return produtosFiltrados;

	}

}
