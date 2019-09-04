package teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.problem;
import test.test;

/**
 * Servlet implementation class add_test
 */
@WebServlet("/add_test")
public class add_test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_test() {
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
		String testno = request.getParameter("test_add_no");
		String prono = request.getParameter("add_test_no");
		int test_no = Integer.parseInt(testno);
		int pro_no = Integer.parseInt(prono);
		TeacherImp imp = new TeacherImp();
		test tst = imp.select_tst(test_no);
		problem pro = imp.select_pro(pro_no);
		String temp = tst.getDetail();
		if(pro != null&&tst != null){
			temp = temp + ',' + pro.getNo();
			tst.setDetail(temp);
			if(imp.update_test(tst, test_no) != false){
				session.setAttribute("addtest", "true");
			}
			else{
				session.setAttribute("addtest", "false");
			}
		}
		else{
			session.setAttribute("addtest", "false");
		}
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
