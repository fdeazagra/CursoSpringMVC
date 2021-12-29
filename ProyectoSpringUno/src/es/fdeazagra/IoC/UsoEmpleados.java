package es.fdeazagra.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*
		// Creación de objetos tipo Empleado
		
		Empleados Empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		
		System.out.println(Empleado1.getTareas()); */
		

		// Cargamos el XML de configuración
		ClassPathXmlApplicationContext contexto = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());*/
		
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		// Métodos de la interfaz (Maria podría ser de clase Empleados)
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		
		// Setters de la clase SecretarioEmpleado
		System.out.println("Email María: " + Maria.getEmail());
		System.out.println("Email Pablo: " + Pablo.getEmail()); // Se inyecta el email común definido en el xml
		System.out.println(Maria.getNombreEmpresa());
		
		contexto.close();
		
	}

}
