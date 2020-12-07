package pe.edu.com.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.sysrubricas.entity.LineaAcademica;
import pe.edu.com.sysrubricas.entity.Semestre;
import pe.edu.com.sysrubricas.entity.TipoUnidadAcademica;
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
	
	@PostMapping("/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody Semestre s) {
		Semestre semestre = new Semestre();
		semestre.setNombre(s.getNombre());
		return sser.create(semestre);
	}
	
	@DeleteMapping("/semestre/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return sser.delete(id);
	}
	@PutMapping("/semestre/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody Semestre semestres,@PathVariable int id) {
		Semestre semestre = new Semestre();
		semestre.setId_semestre(id);
		semestre.setNombre(semestres.getNombre());
		return sser.update(semestre);
	}
	
}
