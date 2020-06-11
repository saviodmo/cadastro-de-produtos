<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<c:import url="/common/header.jsp" />

<body>
	<div class="container-fluid">
		<c:import url="/common/titulo.jsp" />

		<div class="row">
			<c:import url="/common/side-bar.jsp" />
			<!--  Side bar é col-3 -->
			<div class="col-9">
				<div class="container">
					<div class="row">
						<div class="col-12">
							<h3>Tela de cadastro</h3>
						</div>
						<div class="row">
							<div class="col-12">
								<form method="post">
									<div class="form-group">
										<label for="nomeProduto">Nome do Produto</label> 
											<input name="nomeProduto" class="form-control">
									</div>
									<div class="form-group">
										<label for="preco">Preço</label> 
											<input name="preco" class="form-control">
									</div>
									<div class="form-group">
										<label for="categoria">Categoria do Produto</label> 
											<input name="categoria" class="form-control">
									</div>
									<button name="cadastrar" type="submit" class="btn btn-dark">Cadastrar</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<c:import url="/common/footer.jsp" />
</body>

</html>