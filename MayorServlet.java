package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SaludoServlet
 */
public class MayorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MayorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a =request.getParameter("a");
		String b =request.getParameter("b");
		String c =request.getParameter("c");
		int numeroPrimero=0;

		try {
			Integer primero = Integer.parseInt(a);
			Integer segundo = Integer.parseInt(b);
			Integer tercero = Integer.parseInt(c);
			
			if(primero>segundo && primero>tercero) {
				numeroPrimero=primero;
				System.out.println("El primero es mayor");
			}else if(segundo>primero && segundo>tercero) {
				numeroPrimero=segundo;
				System.out.println("El segundo es mayor");
				
			}else if(tercero>primero && tercero>segundo){
				numeroPrimero=tercero;
				System.out.println("El tercero es mayor");
			}else if(primero==segundo && primero==tercero) {
				numeroPrimero=tercero;
				System.out.println("Los número son iguales");
			}else if(primero==segundo && primero<tercero) {
				numeroPrimero=tercero;
				System.out.println("El tercero es mayor");
			}else if(tercero==segundo && tercero<primero) {
				numeroPrimero=primero;
				System.out.println("El primero es mayor");
			}else if(tercero==primero && tercero<segundo) {
				numeroPrimero=segundo;
				System.out.println("El segundo es mayor");
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}	
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1> El mayor entre " + a + ", " + b + " y " + c + " es: " + numeroPrimero );
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
