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


import com.savioduarte.cadastrodeprodutos.business.bean.CategoriaBean;
import com.savioduarte.cadastrodeprodutos.business.bean.CategoriasBean;
import com.savioduarte.cadastrodeprodutos.business.bean.ProdutoBean;
import com.savioduarte.cadastrodeprodutos.business.bean.ProdutosBean;

/**
 * Servlet implementation class ProdutosController
 */
@WebServlet("/produtos")
public class ProdutosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProdutosBean produtosBean;
	private CategoriasBean categoriaBean;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutosController() {
        super();
        // TODO Auto-generated constructor stub
        produtosBean = new ProdutosBean();
        categoriaBean = new CategoriasBean();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String nomeCategoria = request.getParameter("categoria");
		
		List<ProdutoBean> produtos = (List<ProdutoBean>) session.getAttribute("produtos");
		
		request.setAttribute("produtos", produtosBean.getProdutosFiltrados(nomeCategoria, produtos));
		//request.setAttribute("categorias", categoriaBean.getCategorias(produtos));
		
		
		if (produtos == null) {
			produtos = new ArrayList<ProdutoBean>();
			request.setAttribute("produtos", produtos);
		}
		
		
		produtos.stream().distinct().collect(Collectors.toList());
		
		request.getRequestDispatcher("/produtos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String indexString = request.getParameter("remover");
		
		int index = Integer.parseInt(indexString) - 1;
		
		HttpSession session = request.getSession();
		List<ProdutoBean> produtos = (List<ProdutoBean>) session.getAttribute("produtos");
		
		produtos.remove(index);
		
		
		doGet(request, response);
	}

}
