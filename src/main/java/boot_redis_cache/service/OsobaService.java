package boot_redis_cache.service;


import boot_redis_cache.model.Osoba;

public interface OsobaService {

	public Osoba findByID(Integer id);
}
