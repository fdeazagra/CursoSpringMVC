package es.fdeazagra.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Presentación del informe financiero del trimestre 1";
	}

}
