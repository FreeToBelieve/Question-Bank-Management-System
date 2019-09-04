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
import javax.servlet.http.HttpSession;

import test.problem;
import test.test;

/**
 * Servlet implementation class del_test
 */
@WebServlet("/del_test")
public class del_test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public del_test() {
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
		String tst_delete = request.getParameter("tst_delete");
		String prono = request.getParameter("pro_no");
		String testno = request.getParameter("test_no");
		int pro_no = Integer.parseInt(prono);
		int test_no = Integer.parseInt(testno);
		TeacherImp imp = new TeacherImp();
		test tst = imp.select_tst(test_no);
		problem pro = imp.select_pro(pro_no);
		if(tst_delete.equals("true")){
			if(tst != null && pro != null){
				String temp = tst.getDetail();
				List<Integer> list = new ArrayList<Integer>();
				list = others.getno.get_no(temp);
				Iterator<Integer> it = list.iterator();
				String detail = ""+it.next();
				while(it.hasNext()){
					int i = it.next();
					if(pro_no != i){
						detail = detail + ',' + i;
					}
				}
				tst.setDetail(detail);
				if(imp.update_test(tst, test_no) != false){
					session.setAttribute("deltest", "true");
					tst_delete = "false";
				}
				else{
					session.setAttribute("addtest", "false");
					tst_delete = "false";
				}
				request.getRequestDispatcher("/teacher.jsp").forward(request, response);
			}
			else{
				session.setAttribute("addtest", "false");
				tst_delete = "false";
				request.getRequestDispatcher("/teacher.jsp").forward(request, response);
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
