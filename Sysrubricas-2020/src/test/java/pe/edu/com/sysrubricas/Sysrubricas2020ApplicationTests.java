package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.CompetenciaCursoDao;
import pe.edu.com.sysrubricas.dao.CompetenciaDao;
import pe.edu.com.sysrubricas.entity.CompetenciaCurso;

@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	private CompetenciaCursoDao c;
	@Test
	void contextLoads() {
		System.out.println(c.readDinamic(1));
	}	
}	





