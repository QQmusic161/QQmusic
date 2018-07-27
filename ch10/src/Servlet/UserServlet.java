package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String name=request.getParameter("name");
			boolean used=false;
			if("ajax".equals(name)){
				used=true;
			}else{
			used=false;
			}
			response.setContentType("test/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.print(used);
			out.flush();
			out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
