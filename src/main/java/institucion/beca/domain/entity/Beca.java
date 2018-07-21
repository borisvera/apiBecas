package institucion.beca.domain.entity;

import java.math.BigDecimal;

import institucion.alumno.domain.entity.Alumno;

public class Beca {
	
	private static final BigDecimal MONTO = new BigDecimal("20000");
	private Alumno alumno;
	private BigDecimal monto;
	
	
	public Beca(Alumno alumno) {
		super();	
		this.alumno = alumno;
		
		calcularMonto();
	}

	private void calcularMonto() {
		this.monto = MONTO.multiply(alumno.getFactor());
	}

	public Alumno getAlumno() {
		return alumno;
	}


	public BigDecimal getMonto() {
		return monto;
	}
	
	
	
}
