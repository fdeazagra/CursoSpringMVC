package es.fdeazagra.IoC;

public class DirectorEmpleado implements Empleados {
	
	// Creación de campo tipo CreaciónInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	// Creación de constructor que inyecta la dependencia
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		
		return "Informe creado por el Directoar: " + informeNuevo.getInforme();
	}
	
	// Método init. Ejecutar tareas antes de que el bean esté disponible
	
	public void metodoInicial() {
		
		System.out.println("Dentro del método init. Aquí irían las tareas " +
				"a ejecutar antes de que el bean esté listo");
	}
	
	// Método destroy. Ejecutar tareas después de que el bean haya sido utilizado
	
	public void metodoFinal() {
		
		System.out.println("Dentro del método destroy. Aquí irían las tareas " +
				"a ejecutar después de que el bean ha sido utilizado");
	}

}
