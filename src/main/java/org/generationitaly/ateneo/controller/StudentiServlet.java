package org.generationitaly.ateneo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import org.generationitaly.ateneo.entity.Studente;
import org.generationitaly.ateneo.repository.StudenteRepository;
import org.generationitaly.ateneo.repository.impl.StudenteRepositoryImpl;


public class StudentiServlet extends HttpServlet {
	
	private static StudenteRepository studenteRepository = new StudenteRepositoryImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Studente> studenti = studenteRepository.findAll();
		request.setAttribute("studenti", studenti);
		request.getRequestDispatcher("studenti.jsp").forward(request, response);
	}

}
