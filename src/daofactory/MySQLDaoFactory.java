package daofactory;

import java.sql.Connection;
import java.sql.DriverManager;

import dao.interfaces.AlumnoDao;
import dao.mysql.MySql_AlumnoDao;

public class MySQLDaoFactory extends DaoFactory {

	public static Connection obtenerConexion() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			con = DriverManager.getConnection(url, "root", "root");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}

		return con;
	}

	public AlumnoDao obtenerAlumnoDao() {
		return new MySql_AlumnoDao();

	}
}