package com.savioduarte.cadastrodeprodutos.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.tools.ForwardingFileObject;

import com.savioduarte.cadastrodeprodutos.business.bean.CadastroBean;


/**
 * Servlet implementation class CadastroController
 */
@WebServlet("/cadastro")
public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private List<CadastroBean> cadastroProduto = new ArrayList<CadastroBean>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer codigo = 1;
		String nomeProduto = (String) request.getParameter("nomeProduto");
		Float preco = (Float) Float.parseFloat(request.getParameter("preco"));
		String categoria = (String) request.getParameter("categoria");
		

		CadastroBean prod = new CadastroBean(codigo, nomeProduto, preco, categoria);
		
		cadastroProduto.add(prod);
	
		
		doGet(request, response);
		
	}

}
