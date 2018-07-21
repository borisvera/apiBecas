package institucion.alumno.domain.entity;

import java.math.BigDecimal;

import institucion.beca.domain.entity.Beca;

public abstract class Alumno implements java.io.Serializable  {

	protected String codigo;
	protected String nombres;
	protected String apellidos;
	protected TipoAlumno tipo;	
	protected Beca beca;
	
	public abstract BigDecimal getFactor();
	
	
	public Alumno(String codigo, String nombres, String apellidos) {
		super();
		this.codigo = codigo;
		this.nombres = nombres;
		this.apellidos = apellidos;		
		this.beca = new Beca(this);
	}

	public TipoAlumno getTipo() {
		return tipo;
	}


	public void setTipo(TipoAlumno tipo) {
		this.tipo = tipo;
	}


	public String getCodigo() {
		return codigo;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Beca getBeca() {
		return beca;
	}

	
	public void setBeca(Beca beca) {
		this.beca = beca;
	}
	
	
	
	
	
	
	
	
	
	
}
