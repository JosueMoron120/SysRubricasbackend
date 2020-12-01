package pe.edu.com.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import pe.edu.com.sysrubricas.service.SemestreService;

@RestController
@RequestMapping("/semestres")
public class SemestreController {
	@Autowired
	private SemestreService sser;
	
	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return sser.readAll();
	}
}
