package teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import connection.DbUtils;
import manager.PageBean;
import test.anwser;
import test.problem;
import test.test;

public class TeacherImp implements TeaInter {

	@Override
	public boolean add_problem(problem pro) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "insert into problem(pro_no,pro_detail,pro_ansno,pro_keyw,pro_dif,cha_no,cha_title,cha_mpiont,pro_type)"+"values(?,?,?,?,?,?,?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, pro.getNo());
			pstm.setString(2, pro.getDetail());
			pstm.setString(3, pro.getAnsno());
			pstm.setString(4, pro.getKeyw());
			pstm.setInt(5, pro.getDif());
			pstm.setInt(6, pro.getCha_no());
			pstm.setString(7, pro.getTitle());
			pstm.setString(8, pro.getMpiont());
			pstm.setString(9, pro.getType());
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

	@Override
	public boolean add_anwser(anwser ans) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "insert into answer(ans_no,ans_detail,pro_no)"+"values(?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, ans.getNo());
			pstm.setString(2, ans.getDetail());
			pstm.setInt(3, ans.getPro_no());
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

	@Override
	public boolean add_test(test tst) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "insert into test_table(tst_no,tst_name,tst_time,tst_type,tst_dif,tst_num,tst_score,tst_detail)"+"values(?,?,?,?,?,?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, tst.getNo());
			pstm.setString(2, tst.getName());
			pstm.setString(3, tst.getTime());
			pstm.setString(4, tst.getType());
			pstm.setInt(5, tst.getDif());
			pstm.setInt(6, tst.getNum());
			pstm.setInt(7, tst.getScore());
			pstm.setString(8, tst.getDetail());
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

	@Override
	public boolean delete_problem(int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "delete from problem where pro_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

	@Override
	public boolean delete_anwser(int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "delete from answer where ans_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

	@Override
	public boolean delete_test(int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "delete from test_table where tst_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			return pstm.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

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
	public void list_pro(PageBean<problem> pageBean) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		problem pro = null;
		List<problem> list = new ArrayList<problem>();
		int totalCount = this.pro_getTotalCount();
		pageBean.setTotalCount(totalCount);
		if(pageBean.getCurrentpage() <= 0){
			pageBean.setCurrentpage(1);
		}
		else if(pageBean.getCurrentpage() > pageBean.getTotalPage()){
			pageBean.setCurrentpage(pageBean.getTotalPage());
		}
		String sql = "SELECT * FROM  (  SELECT A.*, ROWNUM RN  FROM (SELECT * FROM problem) A  WHERE ROWNUM <= ?*5  )  WHERE RN >= ?*5  ";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, pageBean.getCurrentpage());
			pstm.setInt(2, pageBean.getCurrentpage()-1);
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
				pageBean.setPageDate(list);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
	}

	@Override
	public void list_ans(PageBean<anwser> pageBean) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		anwser ans = null;
		List<anwser> list = new ArrayList<>();
		int totalCount = this.ans_getTotalCount();
		pageBean.setTotalCount(totalCount);
		if(pageBean.getCurrentpage() <= 0){
			pageBean.setCurrentpage(1);
		}
		else if(pageBean.getCurrentpage() > pageBean.getTotalPage()){
			pageBean.setCurrentpage(pageBean.getTotalPage());
		}
		String sql = "SELECT * FROM  (  SELECT A.*, ROWNUM RN  FROM (SELECT * FROM answer) A  WHERE ROWNUM <= ?*3  )  WHERE RN >= ?*3  ";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, pageBean.getCurrentpage());
			pstm.setInt(2, pageBean.getCurrentpage()-1);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String detail = rs.getString(2);
				int pro_no = rs.getInt(3);
				ans = new anwser(id, detail, pro_no);
				list.add(ans);
				pageBean.setPageDate(list);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}

	}

	@Override
	public void list_tst(PageBean<test> pageBean) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		test tst = null;
		List<test> list = new ArrayList<>();
		int totalCount = this.tst_getTotalCount();
		pageBean.setTotalCount(totalCount);
		if(pageBean.getCurrentpage() <= 0){
			pageBean.setCurrentpage(1);
		}
		else if(pageBean.getCurrentpage() > pageBean.getTotalPage()){
			pageBean.setCurrentpage(pageBean.getTotalPage());
		}
		String sql = "SELECT * FROM  (  SELECT A.*, ROWNUM RN  FROM (SELECT * FROM test_table) A  WHERE ROWNUM <= ?*5  )  WHERE RN >= ?*5  ";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, pageBean.getCurrentpage());
			pstm.setInt(2, pageBean.getCurrentpage()-1);
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
				pageBean.setPageDate(list);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
	}

	@Override
	public int pro_getTotalCount() {
		Connection conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select count(*) from problem";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){				
				int count = rs.getInt(1);
				return count;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return 0;
	}

	@Override
	public int ans_getTotalCount() {
		Connection conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select count(*) from answer";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){				
				int count = rs.getInt(1);
				return count;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return 0;
	}

	@Override
	public int tst_getTotalCount() {
		Connection conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select count(*) from test_table";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){				
				int count = rs.getInt(1);
				return count;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(rs);
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return 0;
	}

	@Override
	public boolean update_problem(problem pro,int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "update problem set pro_no=?, pro_detail=?, pro_ansno=?, pro_keyw=?, pro_dif=?, cha_no=?, cha_title=?, cha_mpiont=?, pro_type=? where pro_no=?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, pro.getNo());
			pstm.setString(2, pro.getDetail());
			pstm.setString(3, pro.getAnsno());
			pstm.setString(4, pro.getKeyw());
			pstm.setInt(5, pro.getDif());
			pstm.setInt(6, pro.getCha_no());
			pstm.setString(7, pro.getTitle());
			pstm.setString(8, pro.getMpiont());
			pstm.setString(9, pro.getType());
			pstm.setInt(10, no);
			boolean f = pstm.executeUpdate()>0;
			conn.commit();
			return f;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

	@Override
	public boolean update_anwser(anwser ans,int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "update answer set ans_no=?, ans_detail=?, pro_no=? where ans_no = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, ans.getNo());
			pstm.setString(2, ans.getDetail());
			pstm.setInt(3, ans.getPro_no());
			pstm.setInt(4, no);
			boolean f = pstm.executeUpdate()>0;
			conn.commit();
			return f;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

	@Override
	public boolean update_test(test tst,int no) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "update test_table set tst_no=?, tst_name=?, tst_time=?, tst_type=?, tst_dif=?, tst_num=?, tst_score=?, tst_detail=? where tst_no=?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, tst.getNo());
			pstm.setString(2, tst.getName());
			pstm.setString(3, tst.getTime());
			pstm.setString(4, tst.getType());
			pstm.setInt(5, tst.getDif());
			pstm.setInt(6, tst.getNum());
			pstm.setInt(7, tst.getScore());
			pstm.setString(8, tst.getDetail());
			pstm.setInt(9, no);
			boolean f = pstm.executeUpdate()>0;
			conn.commit();
			return f;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			DbUtils.close(pstm);
			DbUtils.close(conn);
		}
		return false;
	}

}
