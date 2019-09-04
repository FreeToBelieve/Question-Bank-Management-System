package manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class tea_delete
 */
@WebServlet("/tea_delete")
public class tea_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tea_delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		ManagerImp imp = new ManagerImp();
		String tea_delete = request.getParameter("tea_delete"); 
		String no = request.getParameter("tea_no");
		String tea_pwd = request.getParameter("tea_pwd");
		int tea_no = Integer.parseInt(no);
		System.out.println(tea_no);
		System.err.println(tea_pwd);
		if(tea_delete.equals("true")){
			if(imp.delete_teacher(tea_no, tea_pwd) == true){
				session.setAttribute("teadel", "true");
				tea_delete = "false";
				request.getRequestDispatcher("/manager.jsp").forward(request, response);
			}
			else{
				session.setAttribute("teadel", "false");
				tea_delete = "false";
				request.getRequestDispatcher("/manager.jsp").forward(request, response);
			}
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
