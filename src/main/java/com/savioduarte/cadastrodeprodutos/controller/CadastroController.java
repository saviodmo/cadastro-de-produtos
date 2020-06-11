package com.savioduarte.cadastrodeprodutos.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.tools.ForwardingFileObject;

import com.savioduarte.cadastrodeprodutos.business.bean.CategoriaBean;
import com.savioduarte.cadastrodeprodutos.business.bean.ProdutoBean;
import com.savioduarte.cadastrodeprodutos.business.bean.ProdutosBean;

/**
 * Servlet implementation class CadastroController
 */
@WebServlet("/cadastro")
public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastroController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		List<ProdutoBean> produtos = (List<ProdutoBean>) session.getAttribute("produtos");
		List<CategoriaBean> categorias = (List<CategoriaBean>) session.getAttribute("categorias");
		
		
		if(produtos == null) {
			produtos = new ArrayList<ProdutoBean>();
			categorias = new ArrayList<CategoriaBean>();
			session.setAttribute("produtos", produtos);
			session.setAttribute("categorias", categorias);
		}
		
		
		
		Integer codigo = produtos.size();
		String nomeProduto = request.getParameter("nomeProduto");
		Float preco = Float.parseFloat(request.getParameter("preco"));
		String categoria = request.getParameter("categoria");
		
		ProdutoBean prod = new ProdutoBean(codigo, nomeProduto, preco, categoria);
		CategoriaBean cat = new CategoriaBean(categoria);
		
		//produtos.stream().forEach(p -> System.out.print(prod.getCategoria())); 
		
		produtos.add(prod);
		categorias.add(cat);
		
		
		session.setAttribute("produtos", produtos);
		session.setAttribute("categorias", categorias);
		
		//System.out.print(categorias.stream().distinct().collect(Collectors.toList()));
		
//		for (ProdutoBean produtoBean : produtos) {
//			System.out.print(produtoBean.getNomeProduto());
//		}
		
		doGet(request, response);
	}

}
