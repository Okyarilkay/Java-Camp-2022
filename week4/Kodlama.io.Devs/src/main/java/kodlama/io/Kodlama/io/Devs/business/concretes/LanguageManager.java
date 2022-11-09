package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;


@Service
public class LanguageManager implements LanguageService{
	

	private LanguageRepository languageRepository;
	
	
	
	
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}
	@Override
	public void add(Language language) throws Exception {
		
		List<Language> languages = languageRepository.getAll();
		for (Language lang : languages) {
			if (lang.getName().equals("") || lang.getId() == language.getId()||lang.getName()==language.getName()) {
				throw new Exception("Aynı isim veya boş girilemez.");
			}
		}
		languageRepository.add(language);
	}

	@Override
	public void update(Language language) {
		List<Language> languages = languageRepository.getAll();
		for (Language lang : languages) {
			if(lang.getId()==language.getId()) {
				languageRepository.update(language);
				
			}
		}
		
		
		
	}

	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
		
	}
	@Override
	public Language getById(int id) {
		
		return languageRepository.getById(id);
	}
}
