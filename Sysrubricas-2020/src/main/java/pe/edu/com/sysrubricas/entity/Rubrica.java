package pe.edu.com.sysrubricas.entity;

public class Rubrica {
	   private int id_rubricas;
	    private int id_curso_proyecto;
	    private String estado;
	    private Double peso;
		public Rubrica(int id_rubricas, int id_curso_proyecto, String estado, Double peso) {
			super();
			this.id_rubricas = id_rubricas;
			this.id_curso_proyecto = id_curso_proyecto;
			this.estado = estado;
			this.peso = peso;
		}
		
		public Rubrica() {
			super();
		}

		public int getId_rubricas() {
			return id_rubricas;
		}
		public void setId_rubricas(int id_rubricas) {
			this.id_rubricas = id_rubricas;
		}
		public int getId_curso_proyecto() {
			return id_curso_proyecto;
		}
		public void setId_curso_proyecto(int id_curso_proyecto) {
			this.id_curso_proyecto = id_curso_proyecto;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public Double getPeso() {
			return peso;
		}
		public void setPeso(Double peso) {
			this.peso = peso;
		}
	    
	    
	    
	    
	    
}
