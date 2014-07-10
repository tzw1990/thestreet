import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTestA3 {

	public static void main(String[] args) {
		Connection conn = JDBCUtil.getConnection();
		String sql = "select * from employee where ename = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "tim");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ename") + ", " + rs.getInt("eid"));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
