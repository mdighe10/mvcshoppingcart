import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBCheck {

	Connection conn = null;
	static String userName = "";
	//String url = "jdbc:mysql://172.27.0.99:3306/";
	String url = "jdbc:mysql://mvc-spring.mysql.database.azure.com:3306/shopping_cart?useSSL=true&requireSSL=false";
	String dbName = "shopping_cart";
	String driver = "com.mysql.jdbc.Driver";
	String DBuserName = "mvc-root@mvc-spring";
	String password = "P@ssw0rd";

	boolean flag = false;

	public static void main(String[] args) {
		DBCheck test = new DBCheck();
		test.dbconnection();

	}

	public void dbconnection() {
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, DBuserName, password);
			flag = true;
			System.out.println("Connection Successful");

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String CheckDbConnection() {

		dbconnection();
		if (flag)
			return "connection successful";
		return "not connected";
	}

}
