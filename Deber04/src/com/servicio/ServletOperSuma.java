package com.servicio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OperacionSuma
 */
//@WebServlet("/OperacionSuma")
public class ServletOperSuma extends HttpServlet {
	
		    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
		public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws IOException {
	 
	        PrintWriter writer = response.getWriter();
	        writer.println("<html>Prueba Servlet</html>");
	        writer.flush();
	    }
	 
	    /**
	     * handles HTTP POST request
	     */
	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws IOException {
	        String paramNum1 = request.getParameter("txtNumero1");
	        int numero1 = Integer.parseInt(paramNum1);
	 
	        String paramNum2 = request.getParameter("txtNumero2");
	        int numero2 = Integer.parseInt(paramNum2);
	 
	        int Sumar = numero1 + numero2;
	 
	        PrintWriter writer = response.getWriter();
	        writer.println("<html>El resultado de la operacion es: " + Sumar + "</html>");
	        writer.flush();
	 
	    }
	 
	   
	}
	
	
	
	
	/*private static final long serialVersionUID = 1L;
       
    *//**
     * @see HttpServlet#HttpServlet()
     *//*
    public OperacionSuma() {
        super();
        // TODO Auto-generated constructor stub
    }

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String a = request.getParameter("txtnumero1");
		int x = Integer.parseInt(a);

		String b = request.getParameter("txtnumero2");
		int y = Integer.parseInt(b);

		int OperacionSumar = x + y;

		PrintWriter writer = response.getWriter();
		writer.println("<html> Resultado:" + OperacionSumar + "</html>");
		writer.flush();
		
			}
*/

