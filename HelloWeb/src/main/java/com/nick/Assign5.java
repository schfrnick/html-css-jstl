package com.nick;

import java.io.PrintWriter;
import java.lang.Math;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Assign5
 */
@WebServlet("/Assign5")
public class Assign5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		int num1 =Integer.parseInt(request.getParameter("b1"));	   
	    int num2 =Integer.parseInt(request.getParameter("b2"));
	    String checkBox = request.getParameter("arithmetic");
	    int i = getResult(num1,num2,checkBox);
	    String url = "/holder.jsp";
	    String info = (String) session.getAttribute("info");
	    
	    
	    
	    info += num1 + " " + checkBox + " " + num2 + " = " +i;
	    
	    
	    PrintWriter out = response.getWriter();
	    out.println(" "+ info);
		session.setAttribute("info", info);
		request.setAttribute("outInfo", info);
	    RequestDispatcher rd = request.getRequestDispatcher(url);
	    rd.forward(request, response);
	    getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	public static int getResult(int num1,int num2,String string) {
		
		int i=0;
		String comp = string;
		
		
		if(comp.equals("+"))
		{
			i = num1 + num2;
			
		}
		if(comp.equals("-"))
		{
			i = num1 - num2;
		
		
		}
		if(comp.equals("*"))
		{
			i = num1 * num2;
		
		}
		if(comp.equals("/"))
		{
			i = num1 / num2;
		
		}
		
		return i;
	}


}
