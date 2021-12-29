package es.fdeazagra.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {


		// Carga de XML de configuración
		ClassPathXmlApplicationContext contexto = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// Petición de beans al contenedor de Spring
		
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria); // Se imprime la dirección de memoria donde se aloja el objeto
		System.out.println(Pablo); 
		
		if(Maria==Pablo) System.out.println("Apuntan al mismo objeto"); // Apuntan al mismo objeto (Patrón Singleton)
		else System.out.println("No se trata del mismo objeto"); // No apuntan al mismo objeto (Patrón Prototype)
		
		contexto.close();

	}

}
