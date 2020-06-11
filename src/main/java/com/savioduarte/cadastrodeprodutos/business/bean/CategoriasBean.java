package com.savioduarte.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.List;

public class CategoriasBean {

	public List<String> getCategorias(List<ProdutoBean> produtos) {


		List<String> categoriaDistinta = new ArrayList<>();


		for (ProdutoBean produto : produtos) {
			categoriaDistinta.add(produto.getCategoria());
		}
		
		return categoriaDistinta;
	}

}
