package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class dia_de_la_semana
 */
public class dia_de_la_semana extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dia_de_la_semana() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1 = request.getParameter("num1");
		
		Integer num_1 = Integer.valueOf(num1);
	
		int elDiaEs = 0;
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("</head>");
		out.print("<body>");
		if(num_1>=1 || num_1<=7) {
			if (num_1==1) {
				elDiaEs = 1;
				out.println("Lunes");
			}else if (num_1==2) {
				elDiaEs = 2;
				out.println("Martes");
			}else if (num_1==3) {
				elDiaEs = 3;
				out.println("Miércoles");
			}else if (num_1==4) {
				elDiaEs = 4;
				out.println("Jueves");
			}else if (num_1==5) {
				elDiaEs = 5;
				out.println("Viernes");
			}else if (num_1==6) {
				elDiaEs = 6;
				out.println("Sábado");
			}else {
				elDiaEs = 7;
				out.println("Domingo");
			}
			out.print("</body>");
			out.print("</html>");
		}else {
			System.out.println("Error, introduce un número entre el 1 y 7");
		}
		
		
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
