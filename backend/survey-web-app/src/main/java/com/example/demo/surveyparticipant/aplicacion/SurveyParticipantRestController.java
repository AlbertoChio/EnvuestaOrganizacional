package com.example.demo.surveyparticipant.aplicacion;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Usuario.dominio.Usuario;
import com.example.demo.Usuario.infraestructura.IUsuarioService;
import com.example.demo.rol.dominio.RolNombre;
import com.example.demo.survey.dominio.Survey;
import com.example.demo.survey.dominio.dtos.SurveyListDto;
import com.example.demo.survey.infraestructura.ISurveyService;
import com.example.demo.surveyparticipant.dominio.Application;
import com.example.demo.surveyparticipant.dominio.Surveyparticipant;
import com.example.demo.surveyparticipant.dominio.dtos.NewAnswerDto;
import com.example.demo.surveyparticipant.dominio.dtos.ParticipantSurveyListDto;
import com.example.demo.surveyparticipant.infraestructura.IApplicationService;
import com.example.demo.surveyparticipant.infraestructura.ISurveyParticipantService;
import com.example.demo.util.dominio.Mensaje;
import com.example.demo.util.dominio.Views;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class SurveyParticipantRestController {

	@Autowired
	private ISurveyParticipantService surveyParticipantService;
	
	@Autowired
	private IApplicationService applicationService;
	
	private final Logger log = LoggerFactory.getLogger(SurveyParticipantRestController.class);

	@GetMapping("/participantes")
	@ResponseStatus(HttpStatus.OK)
	public MappingJacksonValue indexparticipant() {
		List<Surveyparticipant> surveys=surveyParticipantService.findAll();
	    MappingJacksonValue jacksonValue = new MappingJacksonValue(surveys);
	    jacksonValue.setSerializationView(Views.User.class);

		return jacksonValue;
	}
	
	@GetMapping("/applicaciones")
	@ResponseStatus(HttpStatus.OK)
	public List<Application> listapplications() {
		List<Application> applications=applicationService.findAll();
		return applications;
	}
	
	@GetMapping("/aplicaciones")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<MappingJacksonValue>  listmysurveyparticiants(Authentication authentication) {
		List<Surveyparticipant> surveyparticipants =surveyParticipantService.findByUsuarioUsername(authentication.getName());
		List<ParticipantSurveyListDto> participantSurveyListDto = surveyParticipantService.listParticipantSurveyListDto(surveyparticipants);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(participantSurveyListDto);

	    return new ResponseEntity<>(jacksonValue, HttpStatus.OK);
	}
	
	
	@GetMapping("/applications")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<MappingJacksonValue>  listapplicationsdto() {
		List<Application> applications=applicationService.findAll();
		List<NewAnswerDto> newAnswerDto = applicationService.aplicationToNewAnswerDto(applications);
	    MappingJacksonValue jacksonValue = new MappingJacksonValue(applications);
	    jacksonValue.setSerializationView(Views.User.class);

	    return new ResponseEntity<>(jacksonValue, HttpStatus.OK);
	
	}
	
	
    @PostMapping("/create/{surveyname}")
    public ResponseEntity<?> saveapplication(@PathVariable("surveyname") String surveyname, @RequestBody Application application,Authentication authentication){
    	Surveyparticipant surveyparticipant = surveyParticipantService.findByUsuarioUsernameAndSurveySurveyName(authentication.getName(), surveyname);
    	application.setSurveyparticipant(surveyparticipant);
    		applicationService.save(application);
        return new ResponseEntity<Object>(new Mensaje("Applicacion guardada"), HttpStatus.OK);    }
}
