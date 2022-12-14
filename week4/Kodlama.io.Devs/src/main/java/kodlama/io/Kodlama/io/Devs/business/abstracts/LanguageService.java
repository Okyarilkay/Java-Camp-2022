package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;


public interface LanguageService {
	
	List<Language> getAll();
	void add(Language language) throws Exception;
	void update(Language language);
	void delete(Language language);
	Language getById(int id);

	
}
