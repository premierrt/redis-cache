package boot_redis_cache.model;

public class Osoba {

	private String imie;
	private String nazwisko;
	private Integer numer;
	
	
	
	public Osoba(String imie, String nazwisko, Integer numer) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.numer = numer;
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Integer getNumer() {
		return numer;
	}
	public void setNumer(Integer numer) {
		this.numer = numer;
	}
	
	
}
