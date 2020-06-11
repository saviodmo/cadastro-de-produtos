package com.savioduarte.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.List;

public class CategoriasBean {

	public List<CategoriaBean> getCategorias(List<ProdutoBean> produtos){
		
		List<CategoriaBean> categoriaDistintas = new ArrayList<>();
		
		for (ProdutoBean produto : produtos) {
			categoriaDistintas.add(produto.getCategoria());
		}
		
		
		return categoriaDistintas;
	}
	
}
