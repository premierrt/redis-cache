package boot_redis_cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot_redis_cache.model.Osoba;
import boot_redis_cache.service.OsobaService;

@RestController
public class OsobaController {

@Autowired
OsobaService osobaService;
	
@GetMapping(value="/osoba/{id}")
public Osoba getOsobaByID(@PathVariable Integer id){
	
	return osobaService.findByID(id);
	}
}
