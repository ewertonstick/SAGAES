<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar</title>
</head>
<body>
<c:import url="/view/index.jsp" />
<h3>Alterar Categoria </h3> 

<form action="alterarCategoria" method="post">
<input type="hidden" name="idCategoria" value="${alterarCategoria.idCategoria}" />
<label>NOME: </label> <input type="text" name="nome" value="${alterarCategoria.nome}" /> <br>

<p><input type="submit" value="Alterar"/> 
</form> 

</body>
</html>