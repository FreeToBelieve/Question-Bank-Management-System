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
 * Servlet implementation class add_problem
 */
@WebServlet("/add_problem")
public class add_problem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_problem() {
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
		String pro_no = request.getParameter("add_no");
		String detail = request.getParameter("add_detail");
		String keyw = request.getParameter("add_keyw");
		String pro_dif = request.getParameter("add_dif");
		String pro_chano = request.getParameter("add_chano");
		String title = request.getParameter("add_title");
		String mpiont = request.getParameter("add_mpiont");
		String type = request.getParameter("add_type");
		String ans1_no = request.getParameter("add_ans1no");
		String detail1 = request.getParameter("add_ans1detail");
		String ans2_no = request.getParameter("add_ans2no");
		String detail2 = request.getParameter("add_ans2detail");
		String ans_no = ans1_no+','+ans2_no;
		int no = Integer.parseInt(pro_no);
		int dif = Integer.parseInt(pro_dif);
		int chano = Integer.parseInt(pro_chano);
		int no1 = Integer.parseInt(ans1_no);
		if(ans2_no.equals("here")&&detail2.equals("here")){
			problem pro = new problem(no, detail, ans1_no, keyw, dif, chano, title, mpiont, type);
			anwser ans = new anwser(no1, detail1, no);
			TeacherImp imp = new TeacherImp();
			boolean f1 = imp.add_problem(pro);
			boolean f2 = imp.add_anwser(ans);
			if(f1 == true&&f2 == true){
				session.setAttribute("pro_add", "true");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else if(f1 == true&&f2 != true){
				imp.delete_problem(no);
				session.setAttribute("pro_add", "false");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else if(f1 == false&&f2 == true){
				imp.delete_anwser(no1);
				session.setAttribute("pro_add", "false");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else{
				session.setAttribute("pro_add", "false");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
		}
		else{
			int no2 = Integer.parseInt(ans2_no);
			problem pro = new problem(no, detail, ans_no, keyw, dif, chano, title, mpiont, type);
			anwser ans1 = new anwser(no1, detail1, no);
			anwser ans2 = new anwser(no2, detail2, no);
			TeacherImp imp = new TeacherImp();
			boolean f1 = imp.add_problem(pro);
			boolean f2 = imp.add_anwser(ans1);
			boolean f3 = imp.add_anwser(ans2);
			if(f1 == true&&f2 == true&&f3 == true){
				session.setAttribute("pro_add", "true");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else if(f1 == true){
				imp.delete_problem(no);
				session.setAttribute("pro_add", "false");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else if(f2 == true){
				imp.delete_anwser(no1);
				session.setAttribute("pro_add", "false");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else if(f3 == true){
				imp.delete_anwser(no2);
				session.setAttribute("pro_add", "false");
				request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
			}
			else{
				session.setAttribute("pro_add", "false");
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
