package org.generationitaly.ateneo.controller;

import java.io.IOException;

import org.generationitaly.ateneo.entity.Studente;
import org.generationitaly.ateneo.repository.StudenteRepository;
import org.generationitaly.ateneo.repository.impl.StudenteRepositoryImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class StudenteServlet extends HttpServlet {

	private StudenteRepository studenteRepository = new StudenteRepositoryImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		Studente studente = studenteRepository.findById(id);
		
		request.setAttribute("studente", studente);
		request.getRequestDispatcher("studente.jsp").forward(request, response);
	}

}
