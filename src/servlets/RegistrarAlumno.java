package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AlumnoBean;
import dao.interfaces.AlumnoDao;
import daofactory.DaoFactory;

/**
 * Servlet implementation class RegistrarAlumno
 */
@WebServlet("/RegistrarAlumno")
public class RegistrarAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			
			String nomPer = request.getParameter("name");
			String apePat = request.getParameter("apePat");
			String apeMat = request.getParameter("apeMat");
			String dni    = request.getParameter("dni");
			int celular = Integer.parseInt(request.getParameter("celular"));
			String email = request.getParameter("email");
			String direccion = request.getParameter("direccion");
			
			String codUsua = nomPer.charAt(0) + apePat + (int)(Math.random()*(999-100)+100);
			String password = dni;
			// Password sera enviada a su correo electronico
			
			AlumnoBean alu = new AlumnoBean(0, nomPer, apePat, apeMat, dni, direccion, celular, codUsua, password, email);	
			
			DaoFactory mysqldao = DaoFactory.obtenerFactory(DaoFactory.MYSQL);
			AlumnoDao cd = mysqldao.obtenerAlumnoDao();
			boolean flag = cd.insertAlumno(alu);
			
			if(flag){
				request.setAttribute("mensaje", "Registrado...");
			}else{
				request.setAttribute("mensaje", "Ocurrio un error");
			}
			
			getServletContext().getRequestDispatcher("/ResultadoRegistro.jsp")
													.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
	}

}
