package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import kodlama.io.swagger.v3.oas.annotations.Operation;
import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;


@RestController
@RequestMapping("/api/Languages")
public class LanguagesController {
	
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getAll/")	
	public List<Language> getAll(){
		return languageService.getAll();
	}
	@GetMapping("/getId")
	public Language getId(int id) {
		return languageService.getById(id);
	}
	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}
	
	@PutMapping("/update")
	public void update(Language language) throws Exception {
		languageService.update(language);
	}
	@DeleteMapping("/delete")
	public void delete(Language language) {
		languageService.delete(language);
	}
}