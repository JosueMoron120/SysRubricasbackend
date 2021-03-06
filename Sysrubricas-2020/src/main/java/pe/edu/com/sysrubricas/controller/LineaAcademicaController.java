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
import pe.edu.com.sysrubricas.service.LineaAcademicaService;

@RestController
@RequestMapping("/api")
public class LineaAcademicaController {
	@Autowired
	private LineaAcademicaService lser;
	
	@GetMapping("/lineas")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> readAll(){
		return lser.readAll();
	}
	@GetMapping("/lineas/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id) {
		return lser.read(id);
	}
	@PostMapping("/lineas/add")
	@CrossOrigin(origins = "http://localhost:4200")
	public int create(@RequestBody LineaAcademica l) {
		return lser.create(l);
	}
	@DeleteMapping("/lineas/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int delete(@PathVariable int id) {
		return lser.delete(id);
	}
	
	@PutMapping("/lineas/update/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public int update(@RequestBody LineaAcademica linea,@PathVariable int id) {
		LineaAcademica l = new LineaAcademica();
		l.setId_linea(id);
		l.setNombre(linea.getNombre());
		return lser.update(l);
	}
	
	
}
