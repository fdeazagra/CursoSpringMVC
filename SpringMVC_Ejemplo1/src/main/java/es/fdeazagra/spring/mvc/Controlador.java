package es.fdeazagra.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	@RequestMapping // Al dejarlo en blanco especificamos que es la página de inicio (es la raíz de la ruta "/")
	public String muestraPagina( ) {
		
		return "paginaEjemplo";
	}
}
