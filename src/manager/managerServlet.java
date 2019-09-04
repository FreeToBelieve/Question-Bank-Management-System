package manager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.Student;

/**
 * Servlet implementation class managerServlet
 */
@WebServlet(
		name = "managerServlet",
		urlPatterns = {
				"/managerServlet"
		},
		loadOnStartup = 0
		)
public class managerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public managerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String currPage = request.getParameter("currentPage");
		if(currPage == null || "".equals(currPage.trim())){
			currPage = "1";
		}
		int currentPage = Integer.parseInt(currPage);
		PageBean<Student> pageBean = new PageBean<Student>();
		pageBean.setCurrentpage(currentPage);
		ManagerImp imp = new ManagerImp();
		imp.list_stu(pageBean);
		request.setAttribute("pageBean", pageBean);
		request.getRequestDispatcher("/manager.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
