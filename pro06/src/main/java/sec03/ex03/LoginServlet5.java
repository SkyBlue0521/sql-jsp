package sec03.ex03;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet5
 */
@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init()
	{
		System.out.println("init 메서드 호출");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String id=request.getParameter("use_id");
		String pw=request.getParameter("user_pw");
		String address=request.getParameter("user_address");
		System.out.println("아이디	:" + id);
		System.out.println("비밀번호	:" + pw);
		
		String data = "<html>";
		data += "<body>";
		data += "아이디 : " + id;
		data += "<br>";
		data += "비밀번호 : " + pw;
		data += "<br>";
		data +="주소 : " + address;
		data +="</body>";
		data +="</html>";
		System.out.print(data);
	}

	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
