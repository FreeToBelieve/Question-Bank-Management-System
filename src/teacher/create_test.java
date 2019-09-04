package teacher;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.test;

/**
 * Servlet implementation class create_test
 */
@WebServlet("/create_test")
public class create_test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public create_test() {
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
		String test[] = request.getParameterValues("test");
		String test_no = request.getParameter("test_no");
		String name = request.getParameter("test_name");
		String test_score = request.getParameter("test_score");
		String test_dif = request.getParameter("test_dif");
		String type = request.getParameter("test_type");
		int score = Integer.parseInt(test_score);
		int dif = Integer.parseInt(test_dif);
		int no = Integer.parseInt(test_no);
		int i = test.length;
		String temp = test[0];
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = df.format(new Date());
		for(int j = 1 ;j < i; j++){
			temp = temp + ',' + test[j];
			System.out.println(temp);
		}
		test tst = new test(no, name, time, type, dif, i, score, temp);
		TeacherImp imp = new TeacherImp();
		if(imp.add_test(tst)){
			session.setAttribute("tst_add", "true");
			request.getRequestDispatcher("/teacher.jsp").forward(request, response);
		}
		else{
			session.setAttribute("tst_add", "false");
			request.getRequestDispatcher("/teacher.jsp").forward(request, response);
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
