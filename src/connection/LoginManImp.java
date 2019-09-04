package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import manager.Manager;

public class LoginManImp implements LoginManInter {

	@Override
	public Manager select_man(int no, String pwd) {
		Connection conn = null;
		conn = DbUtils.getConn();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		Manager man = null;
		String sql = "select * from manager where mana_no = ? and mana_pwd = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, pwd);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				man = new Manager(id, name, password);
			}
			return man;
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
	public List list_man() {
		Connection conn = null;
		conn = DbUtils.getConn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Manager man = null;
		List<Manager> list = new ArrayList();
		String sql = "select * from manager";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				man = new Manager(id, name, password);
				list.add(man);
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
