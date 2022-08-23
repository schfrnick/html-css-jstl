package com.Homework;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Assign5serv
 */
@WebServlet("/Assign6Serv")
public class Assign6Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assign6Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		HttpSession session = request.getSession();
		double Prince = Double.parseDouble(request.getParameter("b1"));
		double Inter = Double.parseDouble(request.getParameter("b2"));
		double Monthly = Double.parseDouble(request.getParameter("b3"));
		double Ir = Inter / 12; //monthly interest rate
		double Ic; // interest cost
		double It = 0; // interest total
		int Months = 0;
		//some math
		while(Prince > 0) {
			
			Ic = Prince * Ir;
			Monthly-= Ic;
			Prince -= Monthly;
			It += Ic;
			Months ++;
		}
		double years = Months /12;
		double Rem = Months%12;
		
		//reference the tables in the session
		List<Double> Prince2=(List<Double>) request.getAttribute("Principal");
		List<Double> Inter2=(List<Double>) request.getAttribute("InterestRate");
		List<Double> MonthlyP=(List<Double>) request.getAttribute("MonthlyPayment");
		List<Double> ICharged=(List<Double>) request.getAttribute("ICharged");
		List<Double> Year=(List<Double>) request.getAttribute("Year");
		List<Double> Remainder=(List<Double>) request.getAttribute("Remainder");
		//update the lists for the new info
		String url = "/Homework6.jsp";
		Prince2.add(Prince);
		Inter2.add(Inter);
		MonthlyP.add(Monthly);
		ICharged.add(It);
		Year.add(years);
		Remainder.add(Rem);
		//set the new values to the session
		session.setAttribute("Principal", Prince2);
		session.setAttribute("InterestRate", Inter2);
		session.setAttribute("MonthlyPayment", MonthlyP);
		session.setAttribute("ICharged", ICharged);
		session.setAttribute("Year", Year);
		session.setAttribute("Remainder", Remainder);
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
	    rd.forward(request, response);
	    getServletContext().getRequestDispatcher(url).forward(request, response);
		
		
		
	}

}
