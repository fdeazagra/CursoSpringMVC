package es.fdeazagra.IoC;

public class JefeEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;

	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a los empleados de mi sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con correcciones: " + informeNuevo.getInforme() ;
	}
}
