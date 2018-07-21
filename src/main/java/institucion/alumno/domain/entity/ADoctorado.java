package institucion.alumno.domain.entity;

import java.math.BigDecimal;

public class ADoctorado extends Alumno {
	
	private static final BigDecimal varibleCalculo = new BigDecimal("1.0");

	public ADoctorado(String codigo, String nombres, String apellidos) {
		super(codigo, nombres, apellidos);	
		this.tipo = TipoAlumno.DOCTORADO;
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getFactor() {
		// TODO Auto-generated method stub
		return varibleCalculo;
	}

	
	
	
	
	

	
	
	
}
