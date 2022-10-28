package com.ozer.homework.business.concretes;

import com.ozer.homework.business.abstracts.ILanguageService;
import com.ozer.homework.dataAccess.concretes.InMemoryLanguageRepository;
import com.ozer.homework.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements ILanguageService {

    private final InMemoryLanguageRepository repository;

    @Autowired
    public LanguageManager(InMemoryLanguageRepository repository) {
        this.repository = repository;
    }

    @Override
    public Language add(Language language) {
        try {
            for (Language item : getAll()) {
                if (item.getName().equals(language.getName()) || language.getName().equals(null)) {
                    System.err.println("This name already exists");
                    return null;
                } else {
                    repository.add(language);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return language;
    }

    @Override
    public Language update(int id, Language language) {
        for (Language item : getAll()) {
            item.setName(language.getName());
        }
        return language;
    }

    @Override
    public Language delete(int id) {
        for (Language item : getAll()) {
            if (item.getId() == id) {
                repository.delete(id);
                return item;
            }
        }
        return null;
    }

    @Override
    public Language getById(int id) {
        for (Language item : getAll()) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Language> getAll() {
        return repository.getAll();
    }
}
