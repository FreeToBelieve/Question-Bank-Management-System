package teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.PageBean;
import test.problem;

/**
 * Servlet implementation class page_problem
 */
@WebServlet("/page_problem")
public class page_problem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public page_problem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String pro_currPage = request.getParameter("pro_currentPage");
		if(pro_currPage == null || "".equals(pro_currPage.trim())){
			pro_currPage = "1";
		}
		int pro_currentPage = Integer.parseInt(pro_currPage);
		PageBean<problem> pro_pageBean = new PageBean<problem>();
		pro_pageBean.setCurrentpage(pro_currentPage);
		TeacherImp imp = new TeacherImp();
		imp.list_pro(pro_pageBean);
		request.setAttribute("pro_pageBean", pro_pageBean);
		request.getRequestDispatcher("/teacher.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
