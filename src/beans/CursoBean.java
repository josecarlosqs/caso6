package beans;

public class CursoBean {
	private int codCurso;
	private String nombreCurso;
	private double precio;
	private String descripcion;
	private int duracionTotal;
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getNombreCurso() {
		return nombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getDuracionTotal() {
		return duracionTotal;
	}
	public void setDuracionTotal(int duracionTotal) {
		this.duracionTotal = duracionTotal;
	}
	public CursoBean(int codCurso, String nombreCurso, double precio,
			String descripcion, int duracionTotal) {
		super();
		this.codCurso = codCurso;
		this.nombreCurso = nombreCurso;
		this.precio = precio;
		this.descripcion = descripcion;
		this.duracionTotal = duracionTotal;
	}
}
