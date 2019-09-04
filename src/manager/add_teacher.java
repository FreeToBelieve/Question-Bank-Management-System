package manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import teacher.Teacher;

/**
 * Servlet implementation class add_teacher
 */
@WebServlet("/add_teacher")
public class add_teacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_teacher() {
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
		String tea_no = request.getParameter("tea_no");
		String name = request.getParameter("tea_name");
		String pwd = request.getParameter("tea_pwd");
		String discipline = request.getParameter("tea_discipline");
		String mail = request.getParameter("tea_mail");
		int no = Integer.parseInt(tea_no);
		if(tea_no!=null&&name!=null&&pwd!=null&&discipline!=null&&mail!=null){
			Teacher tea = new Teacher(no, pwd, name, discipline, mail);
			try{
				ManagerImp imp = new ManagerImp();
				if(imp.add_teacher(tea) == true){
					session.setAttribute("tea_reg", "true");					
				}
				else{					
					session.setAttribute("tea_reg", "false");
				}
			}
			catch (Exception e) {
			}finally{				
				request.getRequestDispatcher("/manager.jsp").forward(request, response);
			}
	}
		else{
			session.setAttribute("tea_reg", "false");
			request.getRequestDispatcher("/manager.jsp").forward(request, response);
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
