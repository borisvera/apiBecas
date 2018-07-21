package institucion.alumno.domain.entity;

import java.math.BigDecimal;

public class AMaestria extends Alumno implements java.io.Serializable {
	private static final BigDecimal varibleCalculo = new BigDecimal("0.9");

	public AMaestria(String codigo, String nombres, String apellidos) {
		super(codigo, nombres, apellidos);	
		this.tipo = TipoAlumno.MAESTRIA;
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getFactor() {
		// TODO Auto-generated method stub
		return varibleCalculo;
	}
}
