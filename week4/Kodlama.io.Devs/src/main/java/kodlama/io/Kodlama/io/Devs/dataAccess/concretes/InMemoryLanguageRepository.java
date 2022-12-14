package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"Python"));
		languages.add(new Language(3,"C#"));
		languages.add(new Language(4,"C++"));
	}
	public List<Language> getAll() {
		
		return languages;
	}
	
	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId()==id) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void update(Language language) {
		for (Language lang : languages) {
			if (language.getId()==lang.getId()) {
				lang.setName(language.getName());
			}
		}
		
	}

	@Override
	public void delete(Language language) {
		languages.remove(language);
	}
	
}
