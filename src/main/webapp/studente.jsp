<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.generationitaly.ateneo.entity.Studente" %>
<%@ page import="org.generationitaly.ateneo.entity.Esame" %>
<%@ page import="org.generationitaly.ateneo.entity.Materia" %>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%  Studente studente = (Studente) request.getAttribute("studente");
		
		%>
	
	<div>
		<p><b>Matricola: </b> <%= studente.getMatricola() %> </p>
		<p><b>Codice Fiscale: </b> <%= studente.getCodiceFiscale() %> </p>
		<p><b>Nome: </b> <%= studente.getNome() %> </p>
		<p><b>Cognome: </b> <%= studente.getCognome() %> </p>
		<p><b>Sesso: </b> <%= studente.getSesso() %> </p>
		<p><b>Data Nascita: </b> <%= studente.getDataNascita() %> </p>
		
		<br>
		
		<p><b>Esami Sostenuti: </b> </p>
		<ul>
			<% for (Esame esame : studente.getEsami()) { %>	
				<li>
					<p><b>Codice Materia: </b><%= esame.getMateria().getCodice() %></p>
					<p><b>Nome Materia: </b><%= esame.getMateria().getNome() %></p>
					<p><b>Cfu Materia: </b><%= esame.getMateria().getCfu() %></p>
					<p><b>Data Esame: </b><%= esame.getDataEsame() %></p>
					<p><b>Voto: </b><%= esame.getVoto() %></p>
					<p><b>Lode: </b><%= esame.isLode() %></p>
				</li>	
			<% } %> 
		</ul>
	</div>
</body>
</html>