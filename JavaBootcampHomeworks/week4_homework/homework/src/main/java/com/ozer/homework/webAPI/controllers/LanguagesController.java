package com.ozer.homework.webAPI.controllers;

import com.ozer.homework.business.abstracts.ILanguageService;
import com.ozer.homework.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {

    private final ILanguageService languageService;


    @Autowired
    public LanguagesController(ILanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping()
    public Language add(@RequestBody Language language) {
        return languageService.add(language);
    }

    @GetMapping("getById")
    public Language getById(@RequestParam int id) {
        return languageService.getById(id);
    }

    @DeleteMapping("/{id}")
    public Language delete(@PathVariable(name = "id") int id) {
        return languageService.delete(id);
    }

    @PutMapping()
    public Language update(@RequestParam int id, @RequestBody Language language) {
        return languageService.update(id, language);
    }

    @GetMapping()
    public List<Language> getAll() {
        return languageService.getAll();
    }
}
