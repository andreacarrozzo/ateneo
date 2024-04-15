<%@page import="java.util.List"%>
<%@page import="org.generationitaly.ateneo.entity.Studente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<% List<Studente> studenti = (List<Studente>) request.getAttribute("studenti"); %>
	
	<table class="table table-success table-striped">
		<thead class="thead-dark">
			<tr>
				<th scope="col"> # </th>
				<th scope="col">Matricola</th>
				<th scope="col">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
		<% for(Studente studente : studenti){ %>
			<tr>
				<th scope="row"> - </th>
				<td><%=studente.getMatricola() %></td>
				<td><%=studente.getNome() %></td>
				<td><%=studente.getCognome() %></td>
				<td><button class="btn btn-primary">Info</button>
			</tr>
			<%} %>
		</tbody>
	</table>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>