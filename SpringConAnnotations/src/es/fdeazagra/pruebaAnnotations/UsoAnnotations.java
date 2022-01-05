package es.fdeazagra.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {

		// cargar el XML de configuración
			ClassPathXmlApplicationContext contexto = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// obtención del bean 
		
			Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
		
		// usar el bean
			
			System.out.println(Antonio.getInforme());
			
			System.out.println(Antonio.getTareas());
		
		// cerrar el contexto

			contexto.close();
	}

}
