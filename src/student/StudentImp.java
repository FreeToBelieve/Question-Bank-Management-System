package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbUtils;
import test.anwser;
import test.problem;
import test.problem_select;
import test.test;

public class StudentImp implements StuInter {

	@Override
	public problem select_pro(int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		problem pro = null;
		String sql = "select * from problem where pro_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
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
			}
			return pro;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return null;
	}

	@Override
	public anwser select_ans(int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		anwser ans = null;
		String sql = "select * from answer where ans_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String detail = rs.getString(2);
				int pro_no = rs.getInt(3);
				ans = new anwser(id, detail, pro_no);
			}
			return ans;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return null;
	}

	@Override
	public test select_tst(int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		test tst = null;
		String sql = "select * from test_table where tst_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String time = rs.getString(3);
				String type = rs.getString(4);
				int dif = rs.getInt(5);
				int num = rs.getInt(6);
				int score = rs.getInt(7);
				String detail = rs.getString(8);
				tst = new test(id, name, time, type, dif, num, score, detail);
			}
			return tst;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return null;
	}

	@Override
	public List<problem> list_pro() {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		problem pro = null;
		List<problem> list = new ArrayList<>();
		String sql = "select * from problem";
		try {
			pstm = conn.prepareStatement(sql);
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
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return null;
	}

	@Override
	public List<anwser> list_ans() {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		anwser ans = null;
		List<anwser> list = new ArrayList<>();
		String sql = "select * from answer";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String detail = rs.getString(2);
				int pro_no = rs.getInt(3);
				ans = new anwser(id, detail, pro_no);
				list.add(ans);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return null;
	}

	@Override
	public List<test> list_tst() {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		test tst = null;
		List<test> list = new ArrayList<>();
		String sql = "select * from test_table";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String time = rs.getString(3);
				String type = rs.getString(4);
				int dif = rs.getInt(5);
				int num = rs.getInt(6);
				int score = rs.getInt(7);
				String detail = rs.getString(8);
				tst = new test(id, name, time, type, dif, num, score, detail);
				list.add(tst);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return null;
	}

	@Override
	public problem_select select_pro_sel(int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		problem_select pro_sel = null;
		String sql = "select * from problem_select where select_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String A_select = rs.getString(3);
				String B_select = rs.getString(4);
				String C_select = rs.getString(5);
				String D_select = rs.getString(6);
				String pro_ansno = rs.getString(7);
				String pro_keyw = rs.getString(8);
				int pro_dif = rs.getInt(9);
				int cha_no = rs.getInt(10);
				String cha_title = rs.getString(11);
				String cha_mpiont = rs.getString(12);
				String pro_type = rs.getString(13);
				pro_sel = new problem_select(id, title, A_select, B_select, C_select, D_select, pro_ansno, pro_keyw, pro_dif, cha_no, cha_title, cha_mpiont, pro_type);
			}
		return pro_sel;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return null;
	}

	@Override
	public List<problem_select> list_pro_sel() {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		problem_select pro_sel = null;
		List<problem_select> list = new ArrayList<problem_select>();
		String sql = "select * from problem_select";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String title = rs.getString(2);
				String A_select = rs.getString(3);
				String B_select = rs.getString(4);
				String C_select = rs.getString(5);
				String D_select = rs.getString(6);
				String pro_ansno = rs.getString(7);
				String pro_keyw = rs.getString(8);
				int pro_dif = rs.getInt(9);
				int cha_no = rs.getInt(10);
				String cha_title = rs.getString(11);
				String cha_mpiont = rs.getString(12);
				String pro_type = rs.getString(13);
				pro_sel = new problem_select(id, title, A_select, B_select, C_select, D_select, pro_ansno, pro_keyw, pro_dif, cha_no, cha_title, cha_mpiont, pro_type);
				list.add(pro_sel);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return null;
	}

}
