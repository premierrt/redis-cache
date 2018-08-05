package boot_redis_cache.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot_redis_cache.model.Osoba;
import boot_redis_cache.service.OsobaService;

@RestController
public class OsobaController {

private static final Log log = LogFactory.getLog(OsobaController.class);
	

OsobaService osobaService;



@Autowired
@Qualifier ("randomOsobaServiceImpl")
public void setOsobaService(OsobaService osobaService) {
	this.osobaService = osobaService;
}

//@Cacheable (value="osoby", key="#id")
@GetMapping(value="/osoba/{id}")
public Osoba getOsobaByID(@PathVariable Integer id){
	log.info("=========== Pobieram osobe "+" "+ id);
	return osobaService.findByID(id);
	}
}
