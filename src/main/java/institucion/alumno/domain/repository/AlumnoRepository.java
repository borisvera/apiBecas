package institucion.alumno.domain.repository;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import institucion.alumno.domain.entity.Alumno;
import institucion.alumno.domain.entity.TipoAlumno;


@Component("AlumnoRepository")
public interface AlumnoRepository {
	public List<Alumno> findAlumnoByType(TipoAlumno tipo);
	
	public List<Alumno> findAll();
}
