package vi.dev.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryImpl {
	private Connection con;

	public CategoryImpl(Connection con) {
		super();
		this.con = con;
	}
	public void insert() {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO CATEGORIES VALUES(NULL, ?, ?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "category name");
            stmt.setString(2, "url thumbnail");

            stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	
}
