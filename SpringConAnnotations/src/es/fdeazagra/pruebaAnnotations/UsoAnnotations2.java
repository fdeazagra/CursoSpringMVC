package es.fdeazagra.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		
		// cargar el XML de configuración
		
				/*ClassPathXmlApplicationContext contexto = 
						new ClassPathXmlApplicationContext("applicationContext.xml");*/
		
		// leer el class de configuración
		
				AnnotationConfigApplicationContext contexto = 
						new AnnotationConfigApplicationContext(EmpleadosConfig.class);
				
				// obtención del Bean 
				
					/*Empleados Antonio = contexto.getBean("ComercialExperimentado", Empleados.class);
					Empleados Lucia = contexto.getBean("ComercialExperimentado", Empleados.class);
					
					// Apuntan al mismo objeto en memoria?
					
					if(Antonio==Lucia) {
						
						System.out.println("Apuntan al mismo lugar en memoria");
						System.out.println(Antonio + "\n"  + Lucia);
						
					} else {
						
						System.out.println("No apuntan al mismo lugar en memoria");
						System.out.println(Antonio + "\n"  + Lucia);
						
					}*/
				
				// pedir un Bean al contenedor
				
				Empleados empleado=contexto.getBean("directorFinanciero", Empleados.class);
				
				System.out.println(empleado.getTareas());
				
				System.out.println(empleado.getInforme());
				
				// pedimos un Bean director financiero para probar las propiedades del archivo externo
				
				DirectorFinanciero director=contexto.
						getBean("directorFinanciero", DirectorFinanciero.class);
				
				System.out.println("Email del director: "+ director.getEmail());
				
				System.out.println("Nombre de la Empresa: "+ director.getNombreEmpresa());
				
				// cerrar el contexto

					contexto.close();

	}

}
