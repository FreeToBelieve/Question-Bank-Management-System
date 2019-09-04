package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbUtils {
//	private static final String url = "jdbc:oracle:thin:@172.28.0.41:1521:jxc";
//	private static final String user = "scott"; 
//	private static final String pwd =  "Jj123456";
	private static String url = "jdbc:oracle:thin:@localhost:1521:test";
	private static String user = "scott"; 
	private static String pwd =  "Zgl153624";
	public static void DbUtils(String new_url,String new_user,String new_pwd)
	{
		url = new_url;
		user = new_user;
		pwd = new_pwd;
	}
	static
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	private DbUtils(){}
	public static Connection getConn()
	{
		try{
			Connection conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("连接成功");
			return conn;
		} catch(SQLException e){
			e.printStackTrace();
			System.out.println("连接失败");
			return null;
		}
	}
	public static void close(ResultSet rs)
	{
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement pstm)
	{
		try {
			pstm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Connection conn)
	{
		try {
			conn.close();
			System.out.println("连接已关闭");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

