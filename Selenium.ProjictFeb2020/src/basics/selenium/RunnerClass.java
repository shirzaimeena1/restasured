package basics.selenium;

public class RunnerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// connect to DB or Establish a connection with DB
		JDBCUtility.setupDBConnection();
		JDBCUtility.runQuery("select * from public.actor");
		JDBCUtility.returnResult();
		JDBCUtility.closeDBConnection();

		// 1. Important classes of JDBC
		// 1. Connection Class - Connects to DB using URL ( host:port database name,
		// username, password)
		// 2. Statement Clas - execute the query
		// 3. ResultSet - Store the output of the query
		// 4.DriverManager - will be use for connection to DB driver.

	}

}
