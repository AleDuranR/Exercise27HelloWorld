package com.exercise27helloworld.controller;

import com.exercise27helloworld.model.UserModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsuariosServlet
 */
@WebServlet("/UsuariosServlet")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Hello world");
		String sid = "";
		String sname = "";
		String sage = "";
		// because the server treats any data as a string you should save as a parameter
		sid = request.getParameter("userID");
		sname = request.getParameter("userName");
		sage = request.getParameter("userAge");
		// Create an object from my class UserModel that is in the package model
		// but because all the data in the web its a string you must parse (because you are 
		// changing from a string-int)
		UserModel myUser = new UserModel(Short.parseShort(sage), sname, Integer.parseInt(sid));
		
		myUser.setID(Integer.parseInt(sid));
		myUser.setName(sname);
		myUser.setAge(Short.parseShort(sage));
		//show parameter
		response.getWriter().append("The ID input is: "+ myUser.getID() + "\n");
		response.getWriter().append("The Name input is: "+ myUser.getName() + "\n");
		response.getWriter().append("The Age input is: "+ myUser.getAge() + "\n");
		
		
		/*
		 * Create an object prom my class UserModel that is in the package model
		 */
		
		//
		
	
	}
}
