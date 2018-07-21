package institucion.alumno.domain.entity;

import java.math.BigDecimal;

public class APregrado extends Alumno  implements java.io.Serializable {

	private static final BigDecimal varibleCalculo = new BigDecimal("0.8");

	public APregrado(String codigo, String nombres, String apellidos) {
		super(codigo, nombres, apellidos);	
		this.tipo = TipoAlumno.PREGRADO;
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getFactor() {
		// TODO Auto-generated method stub
		return varibleCalculo;
	}
	
}
