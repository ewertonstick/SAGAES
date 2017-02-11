<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Categoria</title>
</head>
<body>

<c:import url="/view/index.jsp" />
<h3>Adicionar Categoria </h3>

<form action="AdcCategoria" method="post">


         <label>NOME: </label> <input type="text" name="nome">&nbsp;<input type="submit" value="Cadastrar">
  
		
		
		<div style="textalign: center; color: red;"> ${mensagem} </div>
	</form>
</body>
</html>