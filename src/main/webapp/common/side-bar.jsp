<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-3">
	<ul class="list-unstyled">
		<li><a class="btn btn-dark btn-block m-1" href="<c:url value="/"/>">Inicio</a></li>
		<li><a class="btn btn-dark btn-block m-1" href=" <c:url value="/cadastro"/> ">Cadastrar
				Produtos</a></li>
		<li><a class="btn btn-dark btn-block m-1" href="<c:url value="/produtos"/>">Visualizar
				Produtos</a></li>
	</ul>

</div>