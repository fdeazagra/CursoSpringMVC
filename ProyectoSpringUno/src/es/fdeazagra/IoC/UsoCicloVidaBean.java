package es.fdeazagra.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		
		// cargar el XML de configuración
		
		ClassPathXmlApplicationContext contexto = 
				new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// obtención del bean 
		
		Empleados Juan=contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getInforme());
		
		// cerrar contexto
		
		contexto.close();

	}

}
