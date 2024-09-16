package vi.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import vi.dev.data.CategoryImpl;

public class MainApp {

	static final String url = "jdbc:mysql://localhost/shop";
	static final String user = "root";
	static final String password = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		CategoryImpl categoryImpl = new CategoryImpl(con);
		categoryImpl.insert();

	}
	private static Connection getConnection() {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Ket noi thanh cong");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}