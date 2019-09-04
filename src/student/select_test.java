package student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.anwser;
import test.problem;
import test.test;

/**
 * Servlet implementation class select_test
 */
@WebServlet("/select_test")
public class select_test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public select_test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String testno = request.getParameter("test_no");
		int test_no = Integer.parseInt(testno);
		StudentImp imp = new StudentImp();
		test tst = imp.select_tst(test_no);
		List<problem> list = new ArrayList<>();
		List<Integer> list_int = new ArrayList<>();
		List<String> list_ans = new ArrayList<>();
		if(tst != null){
			String temp = tst.getDetail();
			list_int = others.getno.get_no(temp);
			Iterator<Integer> it = list_int.iterator();
			while(it.hasNext()){
				int i = it.next();
				problem pro = imp.select_pro(i);
				list.add(pro);
				anwser ans = null;
				List<Integer> list2 = new ArrayList<>();
				list2 = others.getno.get_no(pro.getAnsno());
				Iterator<Integer> it2 = list2.iterator();
				ans = imp.select_ans(it2.next());
				String answer = "" + ans.getDetail();
				while(it2.hasNext()){
					ans = imp.select_ans(it2.next());
					answer = answer + "»ò" + ans.getDetail();
				}
				list_ans.add(answer);
			}
			request.setAttribute("list_ans", list_ans);
			request.setAttribute("tst", tst);
			request.setAttribute("list", list);
			request.getRequestDispatcher("/student.jsp").forward(request, response);
		}
		else{
			request.getRequestDispatcher("/student.jsp").forward(request, response);
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
