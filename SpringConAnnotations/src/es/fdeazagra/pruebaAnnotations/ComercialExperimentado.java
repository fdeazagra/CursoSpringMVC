package es.fdeazagra.pruebaAnnotations;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")// Si no especificamos nombre, Spring anota el de la clase comenzando con minúscula
public class ComercialExperimentado implements Empleados,InitializingBean,DisposableBean  {

	// Creamos un campo de la clase (interfaz) que queremos inyectar
	
	@Autowired // Ejemplo autowired con campos de clase
	@Qualifier("informeFinancieroTrim4") // bean Id que debe utilizar
	private CreacionInformeFinanciero nuevoInforme;
	
	// Ejecución de código después de creación del Bean
	
	//@PostConstruct (java 8) se sustituye con afterPropertiesSet()
	public void ejecutaDespuésCreacion() {
		
		System.out.println("Ejecutado tras creación de Bean");
		
	}
	
	// Ejecución de código después de apagado contenedor de Spring
	
	//@PreDestroy (java 8) se sustituye con destroy()
	public void ejecutaAntesDestruccion() {
		
		System.out.println("Ejecutando antes de la destrucción");
		
	}
	
	
	/* Creamos un constructor que inyecte la dependencia "InformeFinanciero"
	
	@Autowired // Ejemplo autowired con constructor
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	} */

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Ejecutando antes de la destrucción");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Ejecutado tras creación de Bean");
		
	}

	/* Creamos un setter que inyecte la dependencia "InformeFinanciero"
	 *  (Se puede hacer con cualquier método normal)
	 
	
	@Autowired // Ejemplo autowired con setter
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	} */
	
	
}
