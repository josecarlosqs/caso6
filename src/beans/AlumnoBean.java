package beans;

public class AlumnoBean{
	
	private int codPer;
	private String nomPer;
	private String apePat;
	private String apeMat;
	private String dni;
	private String direccion;
	private int celular;
	private String codUsua;
	private String password;
	private String email;
	public AlumnoBean(int codPer, String nomPer, String apePat, String apeMat,
			String dni, String direccion, int celular, String codUsua,
			String password, String email) {
		super();
		this.codPer = codPer;
		this.nomPer = nomPer;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.dni = dni;
		this.direccion = direccion;
		this.celular = celular;
		this.codUsua = codUsua;
		this.password = password;
		this.email = email;
	}

	public String getEmail(){
	return email;
	}
	public void setEmail(String email){
		this.email= email;
	}
	public int getCodPer() {
		return codPer;
	}
	public void setCodPer(int codPer) {
		this.codPer = codPer;
	}
	public String getNomPer() {
		return nomPer;
	}
	public void setNomPer(String nomPer) {
		this.nomPer = nomPer;
	}
	public String getApePat() {
		return apePat;
	}
	public void setApePat(String apePat) {
		this.apePat = apePat;
	}
	public String getApeMat() {
		return apeMat;
	}
	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getCodUsua() {
		return codUsua;
	}
	public void setCodUsua(String codUsua) {
		this.codUsua = codUsua;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		


			

}
