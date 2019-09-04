package manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import student.Student;

/**
 * Servlet implementation class add_student
 */
@WebServlet("/add_student")
public class add_student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_student() {
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
		String stu_no = request.getParameter("stu_no");
		String name = request.getParameter("stu_name");
		String pwd = request.getParameter("stu_pwd");
		String discipline = request.getParameter("stu_discipline");
		String stu_grade = request.getParameter("stu_grade");
		int no = Integer.parseInt(stu_no);
		int grade = Integer.parseInt(stu_grade);
		if(stu_no!=null&&name!=null&&pwd!=null&&discipline!=null&&stu_grade!=null){
			Student stu = new Student(no, name, pwd, discipline, grade);
			try{
				ManagerImp imp = new ManagerImp();
				if(imp.add_student(stu) == true){
					session.setAttribute("stu_reg", "true");					
				}
				else{					
					session.setAttribute("stu_reg", "false");
				}
			}
			catch (Exception e) {
			}finally{				
				request.getRequestDispatcher("/manager.jsp").forward(request, response);
			}
	}
		else{
			session.setAttribute("stu_reg", "false");
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
