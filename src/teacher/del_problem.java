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

import others.getno;
import test.problem;

/**
 * Servlet implementation class del_problem
 */
@WebServlet("/del_problem")
public class del_problem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public del_problem() {
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
		TeacherImp imp = new TeacherImp();
		String delete_no = request.getParameter("delete_no");
		int no = Integer.parseInt(delete_no);
		problem pro = imp.select_pro(no);
		if(imp.delete_problem(no)==true){
			List<Integer> list = new ArrayList<>();
			list = getno.get_no(pro.getAnsno());
			Iterator<Integer> it = list.iterator();
			while(it.hasNext()){
				int ansno = it.next();
				if(imp.delete_anwser(ansno)==true){
					session.setAttribute("pro_delete", "true");
				}
				else{
					session.setAttribute("pro_delete", "false");
				}
			}
			request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
		}
		else{
			session.setAttribute("pro_delete", "false");
			request.getRequestDispatcher("/teacher_1.jsp").forward(request, response);
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
