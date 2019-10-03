<%@ page import="br.com.inter.modelo.Pessoa"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Minha JSP</title>
</head>
<body>
<h1>Acessos: ${pessoa.contadorAcessos}</h1>
<h1>Nome </h1> ${pessoa.nome}
<h1>Data Nascimento: </h1> <fmt:formatDate type="date"  value="${pessoa.dataNascimento}" />
<c:if test="${pessoa.maiorDeIdade}">Mostrar</c:if>

<ul>
	<c:forEach items="${moedas}" var="moeda" varStatus="status">
		<li>${status.index + 1} - ${moeda}</li>
	</c:forEach>
</ul>
</body>
</html>