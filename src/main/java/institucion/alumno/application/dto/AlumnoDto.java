package institucion.alumno.application.dto;

import java.math.BigDecimal;
import java.util.Set;


import institucion.alumno.domain.entity.TipoAlumno;

public class AlumnoDto {
	private String codigo;
	private String nombres;
	private String apellidos;	
	private TipoAlumno tipo;	
	private BigDecimal monto;
	
	



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public BigDecimal getMonto() {
		return monto;
	}



	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}



	public TipoAlumno getTipo() {
		return tipo;
	}



	public void setTipo(TipoAlumno tipo) {
		this.tipo = tipo;
	}





	

	
}
