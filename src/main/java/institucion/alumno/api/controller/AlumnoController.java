package institucion.alumno.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import institucion.alumno.application.AlumnoApplicationService;
import institucion.alumno.application.dto.AlumnoToAlumnoDtoMapper;
import institucion.alumno.domain.entity.Alumno;
import institucion.alumno.domain.repository.AlumnoRepository;
import institucion.alumno.infrastructure.db.repository.AlumnoDbRepository;
import institucion.common.api.controller.ResponseHandler;



@RestController
@RequestMapping("api/")
public class AlumnoController {
	
	
	
	@Autowired
	ResponseHandler responseHandler;
	

	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Autowired
	AlumnoToAlumnoDtoMapper mapper;
	
	@RequestMapping(method = RequestMethod.GET,path = "alumnos" ,produces = "application/json; charset=UTF-8")
	public ResponseEntity<?> getListAlumnos(){// throws Exception {
	//	try {
		
		//System.out.println("enter");
			List<Alumno> lstAlumno = alumnoRepository.findAll();
			
		
			
			return new ResponseEntity<List<Alumno>>(lstAlumno,HttpStatus.OK);
			
			
			
			//return lstAlumno;
			//transactionApplicationService.al
			//return this.responseHandler.getOkCommandResponse("Transfer done!");
			/*
		} catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			return this.responseHandler.getAppExceptionResponse();
		}
		*/
	}
	
}
