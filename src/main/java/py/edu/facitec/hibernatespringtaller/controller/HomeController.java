package py.edu.facitec.hibernatespringtaller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//indicamos que se encargara de las peticiones del ususario
@Controller
public class HomeController {

	@RequestMapping ("/")
	public String index(){
		//Pagina a ser visualizada

		return "hello-world";// en appweb se comleta
	}

}
