package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.CompetenciaDao;

@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired
	CompetenciaDao cdao;
	@Test
	void contextLoads() {
		System.out.println(cdao.readxPlan_l(21));
	}	
}	





