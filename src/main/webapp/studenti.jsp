<%@page import="java.util.List"%>
<%@page import="org.generationitaly.ateneo.entity.Studente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<Studente> studenti = (List<Studente>) request.getAttribute("studenti"); %>
	<table>
		<thead>
			<tr>
				<th>Matricola</th>
				<th>Nome</th>
				<th>Cognome</th>
			</tr>
		</thead>
		<tbody>
		<% for(Studente studente : studenti){ %>
			<tr>
				<td><%=studente.getMatricola() %></td>
				<td><%=studente.getNome() %></td>
				<td><%=studente.getCognome() %></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>