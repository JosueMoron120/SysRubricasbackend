package pe.edu.com.sysrubricas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.sysrubricas.dao.CompetenciaDao;
import pe.edu.com.sysrubricas.dao.CompetenciaNivelDao;
import pe.edu.com.sysrubricas.dao.LineaAcademicaDao;

import pe.edu.com.sysrubricas.dao.NiveldeLogroDao;
import pe.edu.com.sysrubricas.dao.SemestreDao;


import pe.edu.com.sysrubricas.dao.PlanAcademicoDao;
import pe.edu.com.sysrubricas.dao.PlanLineaDao;
import pe.edu.com.sysrubricas.dao.UnidadAcademicaDao;

import pe.edu.com.sysrubricas.entity.CompetenciaNivel;

import pe.edu.com.sysrubricas.entity.LineaAcademica;

import pe.edu.com.sysrubricas.entity.PlanAcademico;
import pe.edu.com.sysrubricas.entity.PlanLinea;


@SpringBootTest
class Sysrubricas2020ApplicationTests {
	@Autowired

	private CompetenciaNivelDao cndao;
	@Autowired
	private NiveldeLogroDao ndao;

	@Test
	void contextLoads() {

		/*PlanAcademico p = new PlanAcademico();
		p.setIdplan(23);
		p.setNombre("2016-1 EP Ingeniería de Sistemas - Sede Lima");
		p.setIdunidad(5);
		p.setCiclos(10);
		p.setCreditos(201);
		p.setCursos(70);
		p.setAnio_inicio("02/03/2016");
		p.setAnio_termino("25/12/2020");
		System.out.println(pd.update(p));*/
		//System.out.println(ud.Campus());
		/*CompetenciaNivel cn = new CompetenciaNivel();
		cn.setIdcomp_n(1);
		cn.setIdcomp(1);
		cn.setIdnivel(1);
		cn.setSaber("Texto1...");
		cn.setHacer("Texto2...");
		System.out.println(cndao.update(cn));*/

		
	}	
}	



