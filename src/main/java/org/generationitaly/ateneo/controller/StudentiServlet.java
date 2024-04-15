package org.generationitaly.ateneo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.generationitaly.ateneo.entity.Studente;
import org.generationitaly.ateneo.repository.StudenteRepository;
import org.generationitaly.ateneo.repository.impl.StudenteRepositoryImpl;


public class StudentiServlet extends HttpServlet {
	
	private static StudenteRepository studenteRepository = new StudenteRepositoryImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Studente> studenti = studenteRepository.findAll();
		/*Studente studente = new Studente();
		studente.setMatricola("123");
		studente.setNome("Mario");
		studente.setCognome("rossi");
		Studente studente2 = new Studente();
		studente2.setMatricola("234");
		studente2.setNome("Francesca");
		studente2.setCognome("Verdi");
		List<Studente> studenti = new ArrayList<Studente>();
		studenti.add(studente);
		studenti.add(studente2);
		*/
		request.setAttribute("studenti", studenti);
		request.getRequestDispatcher("studenti.jsp").forward(request, response);
	}

}
