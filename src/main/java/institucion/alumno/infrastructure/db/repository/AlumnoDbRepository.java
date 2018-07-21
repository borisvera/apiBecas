package institucion.alumno.infrastructure.db.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import institucion.alumno.domain.entity.ADoctorado;
import institucion.alumno.domain.entity.AMaestria;
import institucion.alumno.domain.entity.APregrado;
import institucion.alumno.domain.entity.Alumno;
import institucion.alumno.domain.entity.TipoAlumno;
import institucion.alumno.domain.repository.AlumnoRepository;

@Component("AlumnoDbRepository")
public class AlumnoDbRepository implements AlumnoRepository {
	
	private static final List<Alumno> lstAlumnos = new ArrayList<>();
	static {
		lstAlumnos.add(new ADoctorado("1","Pedro","Lavi"));
		lstAlumnos.add(new ADoctorado("2","Juan","Quiroz"));
		lstAlumnos.add(new ADoctorado("3","Adrian","Quiroga"));
		lstAlumnos.add(new ADoctorado("4","Jonathan","Alegria"));
		lstAlumnos.add(new AMaestria("5","Alan","Perez"));
		lstAlumnos.add(new AMaestria("6","Fiona","Salazar"));
		lstAlumnos.add(new AMaestria("7","Milagros","Salazar"));
		
		lstAlumnos.add(new APregrado("8","Adolfo","Pareda"));
		lstAlumnos.add(new APregrado("9","Raul","Alegre"));
		lstAlumnos.add(new APregrado("10","Titto","Rodriguez"));
		lstAlumnos.add(new APregrado("11","Joaquin","Umpiri"));
	}
	
	
	


	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return lstAlumnos;
	}

	@Override
	public List<Alumno> findAlumnoByType(TipoAlumno tipo) {
		List<Alumno> alumnosByType = lstAlumnos
				.stream()
				.filter(p -> p.getTipo()== tipo).collect(Collectors.toList());
		return alumnosByType;
	}

	
}
