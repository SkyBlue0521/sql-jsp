package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("doGet �޼��� ȣ��");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
