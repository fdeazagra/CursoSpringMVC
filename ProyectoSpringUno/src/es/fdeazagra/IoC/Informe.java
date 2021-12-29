package es.fdeazagra.IoC;

public class Informe implements CreacionInformes {

	@Override
	public String getInforme() {

		String informe = "Esta es la presentación del informe";
		
		return informe;
	}

}
