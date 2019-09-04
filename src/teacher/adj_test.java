package teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.problem;
import test.test;

/**
 * Servlet implementation class adj_test
 */
@WebServlet("/adj_test")
public class adj_test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adj_test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String test_no = request.getParameter("test_no");
		int no = Integer.parseInt(test_no);
		TeacherImp imp = new TeacherImp();
		test tst = imp.select_tst(no);
		List<problem> list = new ArrayList<problem>();
		List<Integer> list_int = new ArrayList<Integer>();
		problem pro = null;
		if(tst != null){
			String detail = tst.getDetail();
			list_int = others.getno.get_no(detail);
			Iterator<Integer> it = list_int.iterator();
			while(it.hasNext()){
				int temp = it.next();
				pro = imp.select_pro(temp);
				list.add(pro);
			}
		}
		request.setAttribute("test_no", test_no);
		request.setAttribute("list", list);
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
