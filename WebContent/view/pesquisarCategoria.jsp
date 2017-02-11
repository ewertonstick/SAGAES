<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar</title>
</head>
<body>
<c:import url="/view/index.jsp" />

<table border='2' style='width: 100%;'>
<tr style='background-color: #E6E6E6; font-weight: bold;'>

				<tr>
					<th>Id</th>
					<th>Nome</th>
					<th>Data</th>
					<th>#</th>
				</tr>
				<c:forEach var="Categoria" items="${pesquisarCategoria}">
					<tr>
						<td>${Categoria.idCategoria}</td>
						<td>${Categoria.nome}</td>
						<td>${Categoria.dataCadastro}</td>
						<td><a href="removerCategoria?idCategoria=${Categoria.idCategoria}">Remover</a>&nbsp;
						<a href="mostraAlterar?idCategoria=${Categoria.idCategoria}">Alterar</a>
						</td>
					</tr>
					<div style="textalign: center; color: red;"> ${mensagem} </div>
				</c:forEach>
			</table>
			
			</body>
</html>