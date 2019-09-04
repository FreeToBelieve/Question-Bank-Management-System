package student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manager.ManagerImp;

/**
 * Servlet implementation class Login_student
 */
@WebServlet(
		name = "Login_student",
		urlPatterns = {
				"/Login_student",
		}
)
public class Login_student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user = request.getParameter("stu_user");
		int no = Integer.parseInt(user);
		System.out.println(no);
		String pwd = request.getParameter("stu_pwd");
		System.out.println(pwd);
		ManagerImp imp = new ManagerImp();
		Student stu = imp.select_stu(no,pwd);
		if(stu != null){
			String name = stu.getName();
			HttpSession session = request.getSession();
			session.setAttribute("stu_name", name);
			request.getRequestDispatcher("student.jsp").forward(request, response);
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
