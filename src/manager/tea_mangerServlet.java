package manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import teacher.Teacher;

/**
 * Servlet implementation class tea_mangerServlet
 */
@WebServlet(
		name = "tea_mangerServlet",
		urlPatterns = {
				"/tea_mangerServlet"
		},
		loadOnStartup = 1
		)
public class tea_mangerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tea_mangerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String tea_currPage = request.getParameter("tea_currentPage");
		if(tea_currPage == null || "".equals(tea_currPage.trim())){
			tea_currPage = "1";
		}
		
		int tea_currentPage = Integer.parseInt(tea_currPage);
		PageBean<Teacher> tea_pageBean = new PageBean<Teacher>();
		tea_pageBean.setCurrentpage(tea_currentPage);
		ManagerImp imp = new ManagerImp();
		imp.list_tea(tea_pageBean);
		request.setAttribute("tea_pageBean", tea_pageBean);
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
