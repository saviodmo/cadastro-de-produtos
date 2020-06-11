package com.savioduarte.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CategoriasBean {

	public List<CategoriaBean> getCategorias(List<CategoriaBean> categorias) {

		if (categorias == null) {
			return categorias;
		}

		//Set<CategoriaBean> set = new HashSet<CategoriaBean>(categorias);
		List<CategoriaBean> categoriasDistintas = categorias.stream().distinct().collect(Collectors.toList());
		
		
		return categoriasDistintas;
	}

}
