package manager;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.DbUtils;
import student.Student;
import teacher.Teacher;

public class ManagerImp implements ManInter {

	@Override
	public boolean add_student(Student stu) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "insert into student(stu_no,stu_name,stu_pwd,stu_discipline,stu_grade)"+"values(?,?,?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, stu.getNo());
			pstm.setString(2, stu.getName());
			pstm.setString(3, stu.getPwd());
			pstm.setString(4, stu.getDiscipline());
			pstm.setInt(5, stu.getGrade());
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
	public boolean add_teacher(Teacher tea) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "insert into teacher(tea_no,tea_name,tea_pwd,tea_discipline,tea_mail)"+"values(?,?,?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, tea.getNo());
			pstm.setString(2, tea.getName());
			pstm.setString(3, tea.getPwd());
			pstm.setString(4, tea.getDiscipline());
			pstm.setString(5, tea.getMail());
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
	public boolean delete_student(int no, String pwd) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "delete from student where stu_no = ? and stu_pwd = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, pwd);
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
	public boolean delete_teacher(int no, String pwd) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		String sql = "delete from teacher where tea_no = ? and tea_pwd = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, pwd);
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
	public Student select_stu(int no, String pwd) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		Student stu = null;
		String sql = "select * from student where stu_no = ? and stu_pwd = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, pwd);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String discipline = rs.getString(4);
				int grade = rs.getInt(5);
				stu = new Student(id, name, password, discipline, grade);
			}
			return stu;
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
	public Teacher select_tea(int no, String pwd) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		Teacher tea = null;
		String sql = "select * from teacher where tea_no = ? and tea_pwd = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, pwd);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String discipline = rs.getString(4);
				String mail = rs.getString(5);
				tea = new Teacher(id, name, password, discipline, mail);
			}
			return tea;
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
	public List<Student> list_stu() {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Student stu = null;
		List<Student> list  = new ArrayList<>();
		String sql = "select * from student";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String discipline = rs.getString(4);
				int grade = rs.getInt(5);
				stu = new Student(id, name, password, discipline, grade);
				list.add(stu);
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
	public List<Teacher> list_tea() {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Teacher tea = null;
		List<Teacher> list  = new ArrayList<>();
		String sql = "select * from teacher";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String discipline = rs.getString(4);
				String mail = rs.getString(5);
				tea = new Teacher(id, name, password, discipline, mail);
				list.add(tea);
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
	public void list_stu(PageBean<Student> pageBean){
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Student stu = null;
		List<Student> list  = new ArrayList<>();
		int totalCount = this.stu_getTotalCount();
		pageBean.setTotalCount(totalCount);
		if(pageBean.getCurrentpage() <= 0){
			pageBean.setCurrentpage(1);
		}
		else if(pageBean.getCurrentpage() > pageBean.getTotalPage()){
			pageBean.setCurrentpage(pageBean.getTotalPage());
		}
		System.out.println(pageBean.getCurrentpage());
		String sql = "SELECT * FROM  (  SELECT A.*, ROWNUM RN  FROM (SELECT * FROM student) A  WHERE ROWNUM <= ?*5  )  WHERE RN >= ?*5  ";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, pageBean.getCurrentpage());
			pstm.setInt(2, pageBean.getCurrentpage()-1);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String discipline = rs.getString(4);
				int grade = rs.getInt(5);
				stu = new Student(id, name, password, discipline, grade);
				list.add(stu);
			}
			pageBean.setPageDate(list);
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
	public void list_tea(PageBean<Teacher> pageBean) {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Teacher tea = null;
		List<Teacher> list  = new ArrayList<>();
		int totalCount = this.stu_getTotalCount();
		pageBean.setTotalCount(totalCount);
		if(pageBean.getCurrentpage() <= 0){
			pageBean.setCurrentpage(1);
		}
		else if(pageBean.getCurrentpage() > pageBean.getTotalPage()){
			pageBean.setCurrentpage(pageBean.getTotalPage());
		}
		String sql = "SELECT * FROM  (  SELECT A.*, ROWNUM RN  FROM (SELECT * FROM teacher) A  WHERE ROWNUM <= ?*5  )  WHERE RN >= ?*5  ";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, pageBean.getCurrentpage());
			pstm.setInt(2, pageBean.getCurrentpage()-1);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String discipline = rs.getString(4);
				String mail = rs.getString(5);
				tea = new Teacher(id, name, password, discipline, mail);
				list.add(tea);
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
	public int stu_getTotalCount() {
		Connection conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select count(*) from student";
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
	public int tea_getTotalCount() {
		Connection conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select count(*) from teacher";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			int count = rs.getInt(1);
			return count;
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
	public boolean exportDatabaseTool(String userName, String password, String SID, String savePath, String fileName){
		File saveFile = new File(savePath);
		if (!saveFile.exists()) {
			saveFile.mkdirs();
		}
		try {
			Process process = Runtime.getRuntime().exec("exp " + userName + "/" + password + "@" + SID + " file=" + savePath + "/" + fileName + ".dmp");
			try {
				if(process.waitFor() == 0){//0 表示线程正常终止。 
					return true;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean restoreDatabaseTool(String userName, String password, String SID, String savePath, String fileName) {
		File saveFile = new File(savePath);
		if (saveFile.exists()) {
			saveFile.mkdirs();
		try {
			Process process = Runtime.getRuntime().exec("exp " + userName + "/" + password + "@" + SID + " file=" + savePath + "/" + fileName + ".dmp"+"full=y"+"ignore=y");
			try {
				if(process.waitFor() == 0){//0 表示线程正常终止。 
					return true;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	    }
		return false;
	}
}
