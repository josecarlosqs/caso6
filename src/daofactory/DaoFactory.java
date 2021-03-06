package daofactory;

import dao.interfaces.AlumnoDao;



public abstract class DaoFactory {

	public static final int MYSQL = 1; 
	public static final int SQLSERVER = 2; 
	public static final int ORACLE = 3; 

	public abstract AlumnoDao obtenerAlumnoDao(); 


	public static DaoFactory obtenerFactory (int factory) {
		
		switch (factory) {
			case MYSQL:
				return new MySQLDaoFactory();
				//break;
			case SQLSERVER:
				return null;
				//break;
			case ORACLE:
				return null;
				//break;
	
			default:
				return null;
		}
		
	}
}
