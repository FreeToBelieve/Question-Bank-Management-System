package manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class stu_delete
 */
@WebServlet("/stu_delete")
public class stu_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stu_delete() {
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
		String stu_delete = request.getParameter("stu_delete"); 
		String no = request.getParameter("stu_no");
		String stu_pwd = request.getParameter("stu_pwd");
		int stu_no = Integer.parseInt(no);
		System.out.println(stu_no);
		System.err.println(stu_pwd);
		if(stu_delete.equals("true")){
			if(imp.delete_student(stu_no, stu_pwd) == true){
				session.setAttribute("studel", "true");
				stu_delete = "false";
				request.getRequestDispatcher("/manager.jsp").forward(request, response);
			}
			else{
				session.setAttribute("studel", "false");
				stu_delete = "false";
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
