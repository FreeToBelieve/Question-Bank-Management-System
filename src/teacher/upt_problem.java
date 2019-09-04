package teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.anwser;
import test.problem;

/**
 * Servlet implementation class upt_problem
 */
@WebServlet("/upt_problem")
public class upt_problem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upt_problem() {
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
		String pro_no = request.getParameter("upt_no");
		String detail = request.getParameter("upt_detail");
		String keyw = request.getParameter("upt_keyw");
		String pro_dif = request.getParameter("upt_dif");
		String pro_chano = request.getParameter("upt_chano");
		String title = request.getParameter("upt_title");
		String mpiont = request.getParameter("upt_mpiont");
		String type = request.getParameter("upt_type");
		String ans1_oldno = request.getParameter("upt_ans1oldno");
		String ans1_no = request.getParameter("upt_ans1no");
		String detail1 = request.getParameter("upt_ans1detail");
		String ans2_oldno = request.getParameter("upt_ans2oldno");
		String ans2_no = request.getParameter("upt_ans2no");
		String detail2 = request.getParameter("upt_ans2detail");
		String pro_oldno = request.getParameter("upt_oldno");
		String ans_no = ans1_no+','+ans2_no;
		int oldno1 = Integer.parseInt(ans1_oldno);
		int oldno = Integer.parseInt(pro_oldno);
		int no = Integer.parseInt(pro_no);
		int dif = Integer.parseInt(pro_dif);
		int chano = Integer.parseInt(pro_chano);
		int no1 = Integer.parseInt(ans1_no);
		if(ans2_no.equals("here")&&detail2.equals("here")){
			TeacherImp imp = new TeacherImp();
			problem pro = new problem(no, detail, ans1_no, keyw, dif, chano, title, mpiont, type);
			anwser ans = new anwser(no1, detail1, no);
			if(imp.update_problem(pro, oldno) == true&&imp.update_anwser(ans, oldno1) == true){
				session.setAttribute("pro_upt", "true");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else{
				session.setAttribute("pro_upt", "false");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
		}
		else{
			int oldno2 = Integer.parseInt(ans2_oldno);
			int no2 = Integer.parseInt(ans2_no);
			problem pro = new problem(no, detail, ans_no, keyw, dif, chano, title, mpiont, type);
			anwser ans1 = new anwser(no1, detail1, no);
			anwser ans2 = new anwser(no2, detail2, no);
			TeacherImp imp = new TeacherImp();
			if(imp.update_problem(pro, oldno) == true&&imp.update_anwser(ans1, oldno1) == true&&imp.update_anwser(ans2, oldno2) == true){
				session.setAttribute("pro_upt", "true");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else{
				session.setAttribute("pro_upt", "false");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
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
