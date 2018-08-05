package boot_redis_cache.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import boot_redis_cache.model.Osoba;

@Service
public class RandomOsobaServiceImpl implements OsobaService {

	private static final Log log = LogFactory.getLog(RandomOsobaServiceImpl.class);
	@Override
	public Osoba findByID(Integer id) {
		
		log.info(RandomOsobaServiceImpl.class.getName() + " tworzenie nowej osoby przy pobieraniu");
		// TODO Auto-generated method stub
		return new Osoba(id,"test1", "test1", id);
	}

}
