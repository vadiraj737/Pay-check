package com.test.webApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.entity.Person;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String URI = request.getRequestURI();
		System.out.println("URI:"+URI);
		
		if(URI.endsWith("sendValues.action")){
			//System.out.println("here");
			getState(request,response);
		}
	}
	public void getState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Inside the acrtion");
		Person per = new Person();
		per.setGrossPay(Float.parseFloat(request.getParameter("grossPay")));
		per.setState(request.getParameter("state"));
		per.setPayType(request.getParameter("payType"));
		 per.setGrossSalaryYTD(Integer.parseInt(request.getParameter("grossSalaryYTD")));
		per.setFrequency(request.getParameter("frequency"));
		per.setBilingStatus(request.getParameter("bilingStatus"));
		List<Person> persons = new ArrayList<Person>();
		persons.add(per);
		request.setAttribute("persons", persons);
		request.getRequestDispatcher("results.jsp").forward(request, response);
		
		
	}
}
