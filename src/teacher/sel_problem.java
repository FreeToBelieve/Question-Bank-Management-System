package teacher;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.DbUtils;
import test.problem;

/**
 * Servlet implementation class sel_provlem
 */
@WebServlet("/sel_problem")
public class sel_problem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sel_problem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String [] sel_dif = request.getParameterValues("dif");
		int i = sel_dif.length;
		String [] sel_chano = request.getParameterValues("select_chano");
		String [] sel_keyw = request.getParameterValues("select_keyw");
		int i2 = sel_chano.length;
		int i3 = sel_keyw.length;
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		problem pro = null;
		List<problem> list = new ArrayList<>();
		for(int k=0; k<i3; k++){
		for(int q=0; q<i2; q++){
			int chano = Integer.parseInt(sel_chano[q]);
		for(int j=0; j<i; j++){
			int temp = Integer.parseInt(sel_dif[j]);
			String sql = "select * from problem where pro_dif = ? and cha_no = ? and pro_keyw = ?";
			try {
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1, temp);
				pstm.setInt(2, chano);
				pstm.setString(3, sel_keyw[k]);
				rs = pstm.executeQuery();
				while(rs.next()){
					int id = rs.getInt(1);
					String detail = rs.getString(2);
					String ansno = rs.getString(3);
					String keyw = rs.getString(4);
					int dif = rs.getInt(5);
					int cha_no = rs.getInt(6);
					String title = rs.getString(7);
					String mpiont = rs.getString(8);
					String type = rs.getString(9);
					pro = new problem(id, detail, ansno, keyw, dif, cha_no, title, mpiont, type);
					list.add(pro);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
		}
		DbUtils.close(rs);
		DbUtils.close(pstm);
		DbUtils.close(conn);
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
