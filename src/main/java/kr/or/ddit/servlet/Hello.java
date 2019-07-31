package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charst=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>hello, today : " + sdf.format(new Date()) + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
