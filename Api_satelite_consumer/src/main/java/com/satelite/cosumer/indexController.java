package com.satelite.cosumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.satelite.cosumer.service.SateliteService;

@Controller
@RequestMapping("/satelite")
public class indexController {

	@Autowired
	SateliteService sateliteService;
	
	
	// UMA DAS FORMAS DE CHAMAR CHAMA O INDEX
	@RequestMapping("/")
	public String index() {
		sateliteService.buscaSatelite();
		return "index2";
	}
	
	
	
// ADICONANDO O SERVICO
	
	// FORMA QUE VOU USAR
		@GetMapping("/")
	public String showPage() {
		//CHAMADA DO SERVIÇO QUE MOSTRA O SATELITE
		
			sateliteService.buscaSatelite();
		return "index";
		

	}
		
		

}
