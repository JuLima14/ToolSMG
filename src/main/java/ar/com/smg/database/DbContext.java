package ar.com.smg.database;

import java.sql.*;


public class DbContext {

	private java.sql.Connection connection;

	public DbContext() throws SQLException, Exception {

		Class.forName("com.mysql.jdbc.Driver");

		System.out.println("connecting to the database");

	}

	private Connection getConnectionSingleton() throws SQLException {

		try {
			if (connection != null && connection.isClosed()) {
				// Start afresh.
				connection = null;
			}
			// ** More tests here to check connection is ok.
			if (connection == null) {
				// Make a new connection.
				connection = DriverManager.getConnection(getConnectionString());
				
			}
		} catch (SQLException ex) {
			// Cause a NPE further down the line.
			connection = null;
                        throw new SQLException("No hay conexion con la base de datos");
		}
		return connection;
	}

	private String getConnectionString() {
			
		String ip = "172.16.82.30";
		String port = "3306";
		String dataBase = "root";
		String user = "";
		String password = "";
	
            System.out.println("jdbc:mysql://"+ip+":"+port+"/"+dataBase+"?user="+user+"&password="+password);        
	return "jdbc:mysql://"+ip+":"+port+"/"+dataBase+"?user="+user+"&password="+password;
			
		
		
		
	}
	

	public java.sql.Connection getConnection() throws SQLException {
		return getConnectionSingleton();
	}

	public void setConnection(java.sql.Connection newConnection) {
		this.connection = newConnection;
	}

}
