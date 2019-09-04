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

/**
 * Servlet implementation class select_ans
 */
@WebServlet("/select_ans")
public class select_ans extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public select_ans() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String pro_ans = request.getParameter("pro_ans");
		System.out.println(pro_ans);
		anwser ans = null;
		StudentImp imp = new StudentImp();
		List<Integer> list2 = new ArrayList<>();
		list2 = others.getno.get_no(pro_ans);
		Iterator<Integer> it2 = list2.iterator();
		ans = imp.select_ans(it2.next());
		String answer = "" + ans.getDetail();
		while(it2.hasNext()){
			answer = answer + "»ò" + it2.next();
		}
		request.setAttribute("answer", answer);
		request.getRequestDispatcher("/student.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
