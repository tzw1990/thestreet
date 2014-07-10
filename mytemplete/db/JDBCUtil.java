import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@172.16.8.154:1521:XE";
		//	"jdbc:oracle:thin:@ChaoZhang-PC:1521:XE";
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "admin";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(conn);
		return conn;
	}
}
