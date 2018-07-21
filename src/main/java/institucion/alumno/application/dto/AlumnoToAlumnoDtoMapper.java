package institucion.alumno.application.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import institucion.alumno.domain.entity.Alumno;


@Component("AlumnoToAlumnoDtoMapper")	
public class AlumnoToAlumnoDtoMapper {

	

public AlumnoDto map(Alumno alumno) {
		
		AlumnoDto alumnoDto = new AlumnoDto();
		
		alumnoDto.setApellidos(alumno.getApellidos());
		
		alumnoDto.setNombres(alumno.getNombres());
		
		alumnoDto.setTipo(alumno.getTipo());
		
		alumnoDto.setMonto(alumno.getBeca().getMonto());
		
		alumnoDto.setCodigo(alumno.getCodigo());
		
		return alumnoDto;
		
	}
	
	
	public List<AlumnoDto> map(List<Alumno> alumnos) {
		
		List<AlumnoDto> dtoTemp = new ArrayList<>();
		
		for (Alumno alumno : alumnos) {
			
			dtoTemp.add(map(alumno));
			
		}
		
		return dtoTemp;
		
	}
	
	
}
