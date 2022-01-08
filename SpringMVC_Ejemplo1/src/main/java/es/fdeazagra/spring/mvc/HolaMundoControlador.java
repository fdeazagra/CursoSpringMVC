package es.fdeazagra.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rutaPrincipal")
public class HolaMundoControlador {

	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {// proporciona el formulario
		
		return "HolaMundoFormulario";
		
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		
		return "HelloWorldSpring";
	}
	
	/* FORMA 1: Usando HttpServletRequest para recuperar un parámetro
	 * 
	 
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		String nombre=request.getParameter("nombreAlumno");
		
		nombre +=" es el nombre recogido en el formulario";
		
		String mensajeFinal="¿Quién es el que ha introducido su nombre? " + nombre;
		
		// agregando datos al modelo
		
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		
		return "HelloWorldSpring";
	}
	*/
	
	
	//* FORMA 2: Usando @RequestParam para recuperar un parámetro 
	 
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(
				@RequestParam("nombreAlumno") String nombre, Model modelo) {
		
		nombre +=" es el nombre recogido en el formulario";
		
		String mensajeFinal="¿Quién es el que ha introducido su nombre? " + nombre;
		
		// agregando datos al modelo
		
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		
		return "HelloWorldSpring";
	}
}
