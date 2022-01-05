package es.fdeazagra.pruebaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.fdeazagra.pruebaAnnotations") // Especificamos el paquete a escanear por Spring
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	// definir el bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { // serrá el id del Bean inyectado
		
		return new InformeFinancieroDtoCompras();
	}
	
	// definir el bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
	
}
