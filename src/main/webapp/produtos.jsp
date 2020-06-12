<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<c:import url="/common/header.jsp" />

<body>
	<div class="container-fluid">
		<c:import url="/common/titulo.jsp" />

		<div class="row flex-xl-nowrap">
			<c:import url="/common/side-bar.jsp" />
			<!--  Side bar é col-3 -->
			<div class="col-9">
				<div class="container">
					<div class="row">
						<div class="col-12">
							<h3>Produtos Cadastrados</h3>
						</div>
					</div>
					<div class="row">
						<div class="col-9">
							<table class="table table-bordered table-hover table-striped">
								<thead class="thead-dark">
									<tr>
										<th class="text-center align-middle">Nome do Produto</th>
										<th class="text-center align-middle">Preço</th>
										<th class="text-center align-middle">Categoria</th>
										<th></th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${ produtos }" var="produto"
										varStatus="index">
										<tr>
											<td class="text-center align-middle">${ produto.nomeProduto }</td>
											<td class="text-center align-middle">${ produto.preco }</td>
											<td class="text-center align-middle">${ produto.categoria }</td>
											<td class="text-center align-middle">
												<form method="post">
													<button class="btn btn-danger" name="remover"
														value="${ index.count }">Remover</button>
												</form>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<div class="col-3 text-right">
							<h5>Filtros</h5>

							<form method="get">
								<div class="form-group">
									<label for="categorias">Categorias</label> <select multiple
										class="form-control" name="categoria" id="categorias">
										<c:forEach items="${ categorias }" var="categoria">
											<option>${ categoria }</option>
										</c:forEach>
									</select>
								</div>
								<div class="btn-group">
									<button class="btn btn-warning" type="reset">Resetar</button>
									<button class="btn btn-primary">Filtrar</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<c:import url="/common/footer.jsp" />
</body>

</html>