package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import beans.AlumnoBean;
import dao.interfaces.AlumnoDao;
import daofactory.MySQLDaoFactory;

public class MySql_AlumnoDao extends MySQLDaoFactory implements AlumnoDao{

	public boolean insertAlumno(AlumnoBean Alumno) {
		boolean flag = false;
		try {
			Connection con = MySQLDaoFactory.obtenerConexion();
			Statement stmt = con.createStatement();
			String sql = "insert into Alumno (dni,direccion,celular,email,codUsua,password) values ("
					+ "'"+Alumno.getDni()+"',"
					+ "'"+Alumno.getDireccion()+"',"
					+ "'"+Alumno.getCelular()+"',"
					+ "'"+Alumno.getEmail()+"',"
					+ "'"+Alumno.getCodUsua()+"',"
					+ "'"+Alumno.getPassword()+"')";
			int filas = stmt.executeUpdate(sql);
			


			sql = "insert into Persona (codPer,nomPer,apePat,apeMat) values("
					+ "'"+Alumno.getCodPer()+"',"
					+ "'"+Alumno.getNomPer()+"',"
					+ "'"+Alumno.getApePat()+"',"
					+ "'"+Alumno.getApeMat()+"')";
			filas = stmt.executeUpdate(sql);


			if(filas == 1){
				flag = true;
			}


			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return flag;
	}

}