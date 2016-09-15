package py.edu.facitec.hibernatespringtaller.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import py.edu.facitec.hibernatespringtaller.dao.ClienteDAO;
import py.edu.facitec.hibernatespringtaller.model.Cliente;

@Controller


@Transactional
public class ClienteController {

	@Autowired
	private ClienteDAO clienteDAO;

	@RequestMapping(value ="/cliente",method=RequestMethod.POST)
	public String registrar(Cliente cliente){

		
		System.out.println("Registrando el cliente");
		clienteDAO.guardar(cliente, cliente.getId());

		//pagina a retornar
		return"/clientes/ok";
	}

	//url a responder
	@RequestMapping("/cliente/form")

	public String formulario(){

		return "/clientes/formulario";//Carpeta y luego la pagina
	}


}//END
