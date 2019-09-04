package teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manager.ManagerImp;

/**
 * Servlet implementation class Login_teacher
 */
@WebServlet(
		name = "Login_teacher",
		urlPatterns = {
				"/Login_teacher",
		}
		)
public class Login_teacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_teacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user = request.getParameter("tea_user");
		int no = Integer.parseInt(user);
		System.out.println(no);
		String pwd = request.getParameter("tea_pwd");
		System.out.println(pwd);
		ManagerImp imp = new ManagerImp();
		Teacher tea = imp.select_tea(no,pwd);
		if(tea != null){
			String name = tea.getName();
			HttpSession session = request.getSession();
			session.setAttribute("tea_name", name);
			request.getRequestDispatcher("page_problem").forward(request, response);
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
