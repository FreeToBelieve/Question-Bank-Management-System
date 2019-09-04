package manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.LoginManImp;

/**
 * Servlet implementation class Login_manager
 */
@WebServlet(
		name = "Login_manager",
		urlPatterns = {
				"/Login_manager",
		}
)
public class Login_manager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_manager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user = request.getParameter("man_user");
		int no = Integer.parseInt(user);
//		System.out.println(no);
		String pwd = request.getParameter("man_pwd");
//		System.out.println(pwd);
		LoginManImp imp = new LoginManImp();
		Manager man = imp.select_man(no, pwd);
		if(man != null){
			String name = man.getName();
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			request.getRequestDispatcher("managerServlet").forward(request, response);
		}
		else{
			request.getRequestDispatcher("LoginFail.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
