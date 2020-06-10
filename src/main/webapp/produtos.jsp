<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<c:import url="/common/header.jsp" />

<body>
	<div class="container-fluid">
		<c:import url="/common/titulo.jsp" />

		<div class="row flex-xl-nowrap">
			<c:import url="/common/side-bar.jsp"/> <!--  Side bar é col-3 -->
			<div class="col-9">
				<div class="container">
					<div class="row">
						<div class="col-12">
							Bem Vindo!
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<c:import url="/common/footer.jsp" />
</body>

</html>