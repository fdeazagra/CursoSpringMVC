package es.fdeazagra.pruebaAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;
	
	@Value("${email}") // nombre le la propiedad en el archivo externo (no tiene por qué coincidir)
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		
		return "Gestión y dirección de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		
		return informeFinanciero.getInformeFinanciero();
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	

}
