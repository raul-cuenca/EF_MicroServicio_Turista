package pe.cuenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.cuenca.model.Turista;
import pe.cuenca.service.TuristaService;

@RestController
@RequestMapping("/raulcuenca/api/turista")
public class TuristaController {
	
	@Autowired
	private TuristaService service;
	
	@RequestMapping(path="/listar",method=RequestMethod.GET)
	public ResponseEntity<List<Turista>> get(){		
		return new ResponseEntity<List<Turista>>(service.get(),HttpStatus.OK);		
	}
	
	
	@RequestMapping(path="/guardar",method=RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Turista turista){
		
		service.save(turista);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
