package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductFormServlet")
public class ProductFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductFormServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productName = request.getParameter("product-name");
		String productDescription = request.getParameter("product-desc");
		double productPrice = Double.parseDouble(request.getParameter("product-price"));
		String productImage = request.getParameter("product-image");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Product Details</title>");
		out.println("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css'>");
		out.println("<style>");
		out.println(".center {");
		out.println("  margin: auto;");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<div class='container center'>");
		
		out.println("<h1 class='text-center'>Product Details</h1>");
		
		out.println("<table class='table table-striped table-bordered table-hover'>");
		out.println("<thead class='thead-dark'>");
		out.println("<tr>");
		out.println("<th>Product Name</th>");
		out.println("<th>Description</th>");
		out.println("<th>Price</th>");
		
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tbody>");
		out.println("<tr>");
		out.println("<td>" + productName + "</td>");
		out.println("<td>" + productDescription + "</td>");
		out.println("<td>$" + productPrice + "</td>");
		
		out.println("</tr>");
		out.println("</tbody>");
		out.println("</table>");
		
		out.println("</div>");
		
		out.println("</body>");
		out.println("</html>");
	}
}
